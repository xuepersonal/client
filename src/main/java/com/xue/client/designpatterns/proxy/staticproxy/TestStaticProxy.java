package com.xue.client.designpatterns.proxy.staticproxy;

import com.xue.client.designpatterns.proxy.TargetService;
import com.xue.client.designpatterns.proxy.TargetServiceImpl;
import org.junit.Test;

public class TestStaticProxy {

    @Test
    public void test(){

        TargetService targetService = new TargetServiceImpl();
        TargetServiceProxy proxy = new TargetServiceProxy(targetService);
        proxy.doSomething();
    }
}
