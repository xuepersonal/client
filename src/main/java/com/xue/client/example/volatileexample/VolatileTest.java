package com.xue.client.example.volatileexample;

import org.junit.Test;

/**
 * @author QSNP253
 */
public class VolatileTest {

    @Test
    public void test() throws InterruptedException {

        MyThread<Integer> t = new MyThread<>();
        System.out.println("========开始执行========");
        new Thread(t).start();
        System.out.println("执行到这了F1");
        t.isEnd();
        System.out.println("执行到这了F3");
    }
}
