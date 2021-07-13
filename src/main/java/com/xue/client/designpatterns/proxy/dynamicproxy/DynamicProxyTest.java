package com.xue.client.designpatterns.proxy.dynamicproxy;

import com.xue.client.designpatterns.proxy.TargetService;
import com.xue.client.designpatterns.proxy.TargetServiceImpl;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author QSNP253
 */
public class DynamicProxyTest {

    @Test
    public void test(){
        TargetService targetServiceImpl = new TargetServiceImpl();
        InvocationHandler handler = new TargetServiceInvocationHandler<>(targetServiceImpl);
        TargetService targetServiceImplProxy = (TargetService) Proxy.newProxyInstance(TargetService.class.getClassLoader(),new Class[]{TargetService.class},handler);
        targetServiceImplProxy.nothing();
    }
}
