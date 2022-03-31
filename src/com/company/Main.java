package com.company;

// Here We are Implementing Inheritance and all the types of inheritance
// Types of inheritance

import java.util.Scanner;

// 1. Single Inheritance
class Box {
    double length;
    double width;
    double height;

    public Box(){}
    public Box (double length,double width,double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public double volume(){
        System.out.print("Volume of the box is: ");
        return length*width*height;
    }
}
class BoxWeight extends Box{
    double weight;
    BoxWeight(double length,double width,double height,double weight){
        // Super Keyword to cloe super class variables.
        super(length, width, height);
        this.weight = weight;
    }
}
public class Main extends Box{

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        Box box = new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        System.out.println(box.volume());
    }
}
