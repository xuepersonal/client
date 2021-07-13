package com.xue.client.config;

import com.xue.client.filter.AuthorFilter;
import net.unicon.cas.client.configuration.CasClientConfigurerAdapter;
import net.unicon.cas.client.configuration.EnableCasClient;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.DispatcherType;

/**
 * @author QSNP253
 */
@Configuration
@EnableCasClient
public class AuthenticationFilterConfig extends CasClientConfigurerAdapter {

    @Override
    public void configureAuthenticationFilter(FilterRegistrationBean authenticationFilter) {
        super.configureAuthenticationFilter(authenticationFilter);
        //配置地址，这里还可以配置很多，例如cas重定向策略等。
        authenticationFilter.getInitParameters().put("ignorePattern", "");
    }

    /**
     * 单点登录本地用户信息
     *
     */
    @Bean
    public FilterRegistrationBean<AuthorFilter> localUserInfoFilter() {
        FilterRegistrationBean<AuthorFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new AuthorFilter());
        registrationBean.addUrlPatterns("/*");
        registrationBean.setName("authorFilter");
        registrationBean.setOrder(6);
        registrationBean.addInitParameter("exclusions", "/html/error.html,/favicon.ico,/getPartyInfo");
        registrationBean.setDispatcherTypes(DispatcherType.REQUEST);
        return registrationBean;
    }

}
