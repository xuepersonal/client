package com.xue.client.designpatterns.decorator;

/**
 * 具体装饰类B
 */
public class ConcreteDecoratorB extends Decorator{

    //被装饰者
    Component component;

    public ConcreteDecoratorB(Component component){
        this.component = component;
    }

    @Override
    public String getDescription() {
        return component.getDescription() + ",decoratorBContext";
    }
}
