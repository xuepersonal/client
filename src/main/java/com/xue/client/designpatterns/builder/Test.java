package com.xue.client.designpatterns.builder;

public class Test {

    @org.junit.Test
    public void test(){
        ComputerWithBuilder computer = new ComputerWithBuilder.Builder("因特尔","三星")
                .setDisplay("三星24寸")
                .setKeyboard("罗技")
                .setUsbCount(2)
                .build();
    }
}
