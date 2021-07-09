package com.xue.client.designpatterns.builder.traditional.pojo;

import lombok.ToString;

/**
 * @author QSNP253
 */
@ToString
public class Computer {
    /**
     * 必须
     */
    private String cpu;
    private String ram;
    /**
     * 可选
     */
    private int usbCount;
    private String keyboard;
    private String display;


    public Computer(String cpu, String ram) {
        this.cpu = cpu;
        this.ram = ram;
    }
    public void setUsbCount(int usbCount) {
        this.usbCount = usbCount;
    }
    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }
    public void setDisplay(String display) {
        this.display = display;
    }
}
