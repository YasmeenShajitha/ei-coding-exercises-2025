package com.ei.patterns.creational.factory;

public class ShapeFactory {
    public Shape getShape(String type) {
        if (type.equalsIgnoreCase("circle")) return new Circle();
        if (type.equalsIgnoreCase("rectangle")) return new Rectangle();
        throw new IllegalArgumentException("Unknown shape type");
    }
}
