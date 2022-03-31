package com.company;

abstract class Figure{
    double len,width;
    // Concrete Method
    Figure(double a,double b){
        len = a;
        width = b;
    }
    abstract double findArea();

}
class Triangle extends Figure{
    Triangle(double a,double b){
        super(a,b);
    }
    double findArea(){
        return (len*width)/2;
    }
}
abstract class A{
    abstract void callme();
    void callHarshit(){
        System.out.println("Calling Harshit");
    }
}
class B extends A{
    void callme(){
    System.out.println("Abstract Class Method");
    }
}
public class Abstarction {
    public static void main(String[] args){
        B b = new B();
        b.callHarshit();b.callme();
        Triangle obj = new Triangle(10,8);
        Figure figure;
        figure = obj;

        System.out.println("Area of Triangle is: "+figure.findArea());
    }
}


