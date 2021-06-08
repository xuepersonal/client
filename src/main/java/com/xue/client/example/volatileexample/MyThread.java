package com.xue.client.example.volatileexample;

public class MyThread<T> implements Runnable {

    public boolean flag = false;

    volatile int t = 0;

    @Override
    public void run() {
        for (int n = 1; n <= 5; n++) {
            System.out.println(n);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            t += n;
        }
        System.out.println("总和："+t);
        System.out.println("更新flag值！！！");
        flag = true;
    }



    public void isEnd() throws InterruptedException {
        while (true) {
            System.out.println("执行到这了F2");
            if (this.flag) {
                System.out.println("=========执行完毕========");
                break;
            }
        }
    }
}