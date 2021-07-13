package com.xue.client.designpatterns.proxy.staticproxy;

import com.xue.client.designpatterns.proxy.TargetService;

/**
 * @author QSNP253
 */
public class TargetServiceProxy implements TargetService {

    private TargetService targetService;

    public TargetServiceProxy(TargetService targetService){
        this.targetService = targetService;
    }

    @Override
    public void doSomething() {

        System.out.println("Before DoSomething...");
        targetService.doSomething();
        System.out.println("After DoSomething...");

    }

    @Override
    public void nothing() {

    }
}
