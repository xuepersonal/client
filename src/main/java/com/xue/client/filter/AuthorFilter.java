package com.xue.client.filter;

import org.jasig.cas.client.authentication.AuthenticationFilter;
import org.jasig.cas.client.validation.Assertion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author QSNP253
 */
public class AuthorFilter implements Filter {

    private static final Logger logger = LoggerFactory.getLogger(AuthorFilter.class);

    public static final String PARAM_NAME_EXCLUSIONS = "exclusions";
    private Set<String> excludesPattern;
    protected String contextPath;

    @Override
    public void init(FilterConfig filterConfig) {
        String param = filterConfig.getInitParameter(PARAM_NAME_EXCLUSIONS);
        if (param != null && param.trim().length() != 0) {
            this.excludesPattern = new HashSet(Arrays.asList(param.split("\\s*,\\s*")));
        }
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        logger.info("==========单点登陆拦截===========");
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        if (excludesPattern != null) {
            String uri = req.getRequestURI();
            for (String u : excludesPattern) {
                if (uri.indexOf(u) != -1) {
                    chain.doFilter(request, response);
                    return;
                }
            }
        }
        HttpSession session = req.getSession();
        Assertion assertion = (Assertion) session.getAttribute(AuthenticationFilter.CONST_CAS_ASSERTION);
        String userId = null;
        if (assertion != null) {
            userId = assertion.getPrincipal().getName();
        }
        String path = req.getContextPath();
        if (null == userId) {
            resp.sendRedirect(path + "html/error.html");
        } else {
            logger.info("用户id为：" + userId);
            String uriStr = req.getRequestURL().toString();
            System.out.println(req.getRequestURL().toString());
            // 区分请求路径，只有是主页面的url才添加cookie，避免重复添加。（;jsessionid=是CAS服务端返回时的一个后缀）
            if (uriStr.endsWith("/") || uriStr.contains(";jsessionid=")) {
                resp.addCookie(new Cookie("userId", userId));
            }
            chain.doFilter(req, resp);
        }
    }

}

