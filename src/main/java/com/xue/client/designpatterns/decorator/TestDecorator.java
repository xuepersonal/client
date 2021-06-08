package com.xue.client.designpatterns.decorator;

import org.junit.Test;

public class TestDecorator {

    @Test
    public void test() {
        //创建componentA，不需要装饰，打印描述。
        Component componentA = new ConcreteComponentA();
        System.out.println("Description: " + componentA.getDescription());

        //创建出一个componentB对象,用ConcreteDecoratorA装饰它,用ConcreteDecoratorB装饰它,用ConcreteDecoratorC装饰它，打印描述。
        Component componentB = new ConcreteComponentB();
        componentB = new ConcreteDecoratorA(componentB);
        componentB = new ConcreteDecoratorB(componentB);
        componentB = new ConcreteDecoratorC(componentB);
        System.out.println("Description: " + componentB.getDescription());
    }
}
