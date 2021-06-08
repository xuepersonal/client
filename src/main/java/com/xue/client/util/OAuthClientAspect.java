package com.xue.client.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;

/**
 *
 * 单点登录切面类
 *
 * @author QSNP253
 */
@Aspect
@Component
public class OAuthClientAspect {

    private static final Logger logger = LoggerFactory.getLogger(OAuthClientAspect.class);
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();


    private final String POINT_CUT = "execution(* com.gc.bcc.controller.web.*.*(..))";

    @Pointcut(POINT_CUT)
    public void pointCut(){}

    /**
     * 前置通知 @Before
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    @Before(value = "pointCut()")
    public Object before(JoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        Arrays.stream(args).forEach(arg->{
            try {
                logger.info(OBJECT_MAPPER.writeValueAsString(arg));
            } catch (JsonProcessingException e) {
                logger.info(arg.toString());
            }
        });
        ServletRequestAttributes attributes =
                (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        HttpSession session = request.getSession(false);
        for (Object obj: args) {

        }

//        //aop代理对象
//        Object aThis = joinPoint.getThis();
//        logger.info(aThis.toString());
//
//        //被代理对象
//        Object target = joinPoint.getTarget();
//        logger.info(target.toString());
//
//        Signature signature = joinPoint.getSignature();
//        logger.info(signature.toLongString());
//        logger.info(signature.toShortString());
//        logger.info(signature.toString());
//        //获取方法名
//        logger.info(signature.getName());
//        //获取声明类型名
//        logger.info(signature.getDeclaringTypeName());
//        //获取声明类型  方法所在类的class对象
//        logger.info(signature.getDeclaringType().toString());
//        //和getDeclaringTypeName()一样
//        logger.info(signature.getDeclaringType().getName());
//        Method method = target.getClass().getDeclaredMethod(signature.getName(), String.class);
//        method.invoke(args);
        return null;
    }

   /* *//**
     * 校验数据
     * @param joinPoint
     *//*
    private void checkData(ProceedingJoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();

        SysLog sysLog = method.getAnnotation(TableItemEditService.class);
        if(sysLog != null){
            //注解上的描述
            sysLogBO.setRemark(sysLog.value());
        }
        //请求的 类名、方法名
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = signature.getName();
        sysLogBO.setClassName(className);
        sysLogBO.setMethodName(methodName);
        //请求的参数
        Object[] args = joinPoint.getArgs();
        try{
            List<String> list = new ArrayList<String>();
            for (Object o : args) {
                list.add(new Gson().toJson(o));
            }
            sysLogBO.setParams(list.toString());
        }catch (Exception e){ }
        tableItemEditService.(sysLogBO);
    }*/
}
