package com.xue.client.designpatterns.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author QSNP253
 */
public class TargetServiceInvocationHandler<T> implements InvocationHandler {

    T target;

    public TargetServiceInvocationHandler(T target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result;
        System.out.println("Before invoke...");
        if ("nothing".equals(method.getName())) {
            System.out.println("Accomplish an important thing");
        }
        result = method.invoke(target, args);
        System.out.println("After invoke...");
        return result;
    }
}
