package com.xue.client.designpatterns.builder;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author QSNP253
 */
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
@ToString(of = {"cpu","ram","usbCount","keyboard","display"},exclude = {"display"})
public class ComputerWithBuilder {
    private String cpu;
    private String ram;
    private int usbCount;
    private String keyboard;
    private String display;

    private ComputerWithBuilder(Builder builder){
        this.cpu=builder.cpu;
        this.ram=builder.ram;
        this.usbCount=builder.usbCount;
        this.keyboard=builder.keyboard;
        this.display=builder.display;
    }
    public static class Builder{
        private final String cpu;
        private final String ram;
        private int usbCount;
        private String keyboard;
        private String display;

        public Builder(String cup,String ram){
            this.cpu=cup;
            this.ram=ram;
        }

        public Builder setUsbCount(int usbCount) {
            this.usbCount = usbCount;
            return this;
        }
        public Builder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }
        public Builder setDisplay(String display) {
            this.display = display;
            return this;
        }
        public ComputerWithBuilder build(){
            return new ComputerWithBuilder(this);
        }
    }
}
