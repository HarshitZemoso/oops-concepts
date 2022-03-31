package com.company;
class Animal{
    public void eating(){
        System.out.println("Animal is Eating");
    }

}
class Dog extends Animal{
    public void show(){
        System.out.println("This is a dog class");
    }
}
class GermanShepherd extends Dog{
    public void name(){
        System.out.println("Name of the dog is german shepherd");
    }
}
public class MultiLevelInheritance  extends GermanShepherd{
    public static void main(String[] args){
        GermanShepherd dog = new GermanShepherd();
        dog.name();
        dog.eating();
        dog.show();
    }
}
