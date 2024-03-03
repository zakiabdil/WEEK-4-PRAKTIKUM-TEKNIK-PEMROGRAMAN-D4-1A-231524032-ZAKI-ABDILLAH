package org.example;

public class Rectangle extends Shape{
    private double width;
    private double length;

    Rectangle(){
        super();
        this.length = 1.0;
        this.width = 1.0;
    }

    Rectangle(double width, double height){
        super();
        this.width = width;
        this.length = height;
    }

    Rectangle(double width, double height, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getPerimeter(){
        return 2*(this.width+this.length);
    }

    public double getArea(){
        return this.width*this.length;
    }

    @Override
    public String toString(){
        return "A Rectangle with width="+this.width+" and length="+this.length +", which is a subclass of "+super.toString();
    }
}
