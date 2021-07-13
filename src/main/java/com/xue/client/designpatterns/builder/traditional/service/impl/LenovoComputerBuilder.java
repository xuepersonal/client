package com.xue.client.designpatterns.builder.traditional.service.impl;

import com.xue.client.designpatterns.builder.traditional.pojo.Computer;
import com.xue.client.designpatterns.builder.traditional.service.ComputerBuilder;

/**
 * 联想电脑构建者类
 * @author QSNP253
 */
public class LenovoComputerBuilder extends ComputerBuilder {
    private final Computer computer;
    public LenovoComputerBuilder(String cpu, String ram) {
        computer=new Computer(cpu,ram);
    }
    @Override
    public void setUsbCount() {
        computer.setUsbCount(4);
    }
    @Override
    public void setKeyboard() {
        computer.setKeyboard("联想键盘");
    }
    @Override
    public void setDisplay() {
        computer.setDisplay("联想显示器");
    }
    @Override
    public Computer getComputer() {
        return computer;
    }
}
