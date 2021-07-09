package com.xue.client.designpatterns.builder.traditional;

import com.xue.client.designpatterns.builder.traditional.service.ComputerBuilder;

/**
 * 指导者类（Director）
 */
public class ComputerDirector {
    public void makeComputer(ComputerBuilder builder){
        builder.setUsbCount();
        builder.setDisplay();
        builder.setKeyboard();
    }
}
