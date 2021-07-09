package com.xue.client.designpatterns.builder.traditional;

import com.xue.client.designpatterns.builder.traditional.pojo.Computer;
import com.xue.client.designpatterns.builder.traditional.service.ComputerBuilder;
import com.xue.client.designpatterns.builder.traditional.service.impl.LenovoComputerBuilder;
import com.xue.client.designpatterns.builder.traditional.service.impl.MacComputerBuilder;

public class Test {

    @org.junit.Test
    public void  test(){
        ComputerDirector director=new ComputerDirector();//1
        ComputerBuilder builder = new MacComputerBuilder("I5处理器","三星125");//2
        director.makeComputer(builder);//3
        Computer macComputer = builder.getComputer();//4
        System.out.println("mac computer:"+macComputer.toString());

        ComputerBuilder lenovoBuilder = new LenovoComputerBuilder("I7处理器","海力士222");
        director.makeComputer(lenovoBuilder);
        Computer lenovoComputer = lenovoBuilder.getComputer();
        System.out.println("lenovo computer:"+lenovoComputer.toString());
    }
}
