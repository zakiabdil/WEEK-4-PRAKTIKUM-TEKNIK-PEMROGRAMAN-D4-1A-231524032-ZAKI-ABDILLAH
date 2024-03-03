package org.example;

public class Circle extends Shape{
    private double radius;

    Circle(){
        super();
        this.radius = 1.0;
    }

    Circle(double r){
        super();
        this.radius = r;
    }

    Circle(double r, String color, boolean filled){
        super(color, filled);
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter(){
        return this.radius*2*Math.PI;
    }

    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    @Override
    public String toString(){
        return "A Circle with radius="+this.radius+", which is a subclass of "+super.toString();
    }
}
