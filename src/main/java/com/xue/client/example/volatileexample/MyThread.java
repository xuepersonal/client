package com.xue.client.example.volatileexample;

/**
 * @author QSNP253
 */
public class MyThread<T> implements Runnable {

    public boolean flag = false;

    volatile int t = 0;

    @Override
    public void run() {
        System.out.println(1);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t += 1;
        System.out.println(2);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t += 2;
        System.out.println(3);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t += 3;
        System.out.println(4);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t += 4;
        System.out.println(5);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t += 5;
        System.out.println("总和："+t);
        System.out.println("更新flag值！！！");
        flag = true;
    }



    public void isEnd() {
        while (true) {
            System.out.println("执行到这了F2");
            if (this.flag) {
                System.out.println("=========执行完毕========");
                break;
            }
        }
    }
}