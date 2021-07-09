package com.xue.client.designpatterns.builder.traditional.service;

import com.xue.client.designpatterns.builder.traditional.pojo.Computer;

/**
 * 抽象构建者类
 * @author QSNP253
 */
public abstract class ComputerBuilder {
    public abstract void setUsbCount();
    public abstract void setKeyboard();
    public abstract void setDisplay();

    public abstract Computer getComputer();
}
