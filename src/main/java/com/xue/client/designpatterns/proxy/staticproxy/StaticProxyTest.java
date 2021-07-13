package com.xue.client.designpatterns.proxy.staticproxy;

import com.xue.client.designpatterns.proxy.TargetService;
import com.xue.client.designpatterns.proxy.TargetServiceImpl;
import org.junit.Test;

/**
 * @author QSNP253
 */
public class StaticProxyTest {

    @Test
    public void test(){

        TargetService targetService = new TargetServiceImpl();
        TargetServiceProxy proxy = new TargetServiceProxy(targetService);
        proxy.doSomething();
    }
}
