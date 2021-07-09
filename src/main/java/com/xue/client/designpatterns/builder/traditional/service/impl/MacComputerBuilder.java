package com.xue.client.designpatterns.builder.traditional.service.impl;

import com.xue.client.designpatterns.builder.traditional.pojo.Computer;
import com.xue.client.designpatterns.builder.traditional.service.ComputerBuilder;

/**
 * 苹果电脑构建者类
 */
public class MacComputerBuilder extends ComputerBuilder {
    private Computer computer;
    public MacComputerBuilder(String cpu, String ram) {
        computer = new Computer(cpu, ram);
    }
    @Override
    public void setUsbCount() {
        computer.setUsbCount(2);
    }
    @Override
    public void setKeyboard() {
        computer.setKeyboard("苹果键盘");
    }
    @Override
    public void setDisplay() {
        computer.setDisplay("苹果显示器");
    }
    @Override
    public Computer getComputer() {
        return computer;
    }
}
