package com.cbfacademy.shapes;

public class Rectangle extends Shape {

    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.name = "Rectangle";
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return this.length * this.width;
    }
    
}
