package com.xue.client.designpatterns.proxy;

public class TargetServiceImpl implements TargetService {

    @Override
    public void doSomething() {
        System.out.println("do an important thing!");
    }

    @Override
    public void nothing() {
        System.out.println("done nothing!");
    }
}
