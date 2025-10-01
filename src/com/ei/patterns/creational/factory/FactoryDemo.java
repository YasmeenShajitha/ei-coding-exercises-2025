
package com.ei.patterns.creational.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape s1 = factory.getShape("circle");
        s1.draw();

        Shape s2 = factory.getShape("rectangle");
        s2.draw();
    }
}
