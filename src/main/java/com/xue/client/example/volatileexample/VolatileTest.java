package com.xue.client.example.volatileexample;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;

public class VolatileTest {

    @Test
    public void test() throws InterruptedException {

        MyThread<Integer> t = new MyThread<Integer>();
        System.out.println("========开始执行========");
        new Thread(t).start();
        System.out.println("执行到这了F1");
        t.isEnd();
        System.out.println("执行到这了F3");
    }
}
