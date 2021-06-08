package com.xue.client.designpatterns.decorator;

/**
 * 具体装饰类C
 */
public class ConcreteDecoratorC extends Decorator{

    //被装饰者
    Component component;

    public ConcreteDecoratorC(Component component){
        this.component = component;
    }

    @Override
    public String getDescription() {
        return component.getDescription() + ",decoratorCContext";
    }
}
