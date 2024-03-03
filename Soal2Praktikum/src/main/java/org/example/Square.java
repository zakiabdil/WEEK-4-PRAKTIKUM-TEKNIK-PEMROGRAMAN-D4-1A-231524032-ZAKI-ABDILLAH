package org.example;

public class Square extends Rectangle{
    Square(){
        super();
    }

    Square(double side){
        super(side,side);
    }

    Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }

    public double getSide(){
        return super.getLength();
    }

    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setLength(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString(){
        return "A Square with side="+this.getSide()+", which is a subclass of "+super.toString();
    }
}
