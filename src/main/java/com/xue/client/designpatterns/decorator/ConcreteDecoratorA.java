package com.xue.client.designpatterns.decorator;

/**
 * 具体装饰类A
 * @author QSNP253
 */
public class ConcreteDecoratorA extends Decorator{

    /**
     * 被装饰者
     */
    Component component;

    public ConcreteDecoratorA(Component component){
        this.component = component;
    }

    @Override
    public String getDescription() {
        return component.getDescription() + ",decoratorAContext";
    }
}
