package com.company;

class Person{
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public int getAge(int a,int b){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setName(String newname){
        name = newname;
    }
    public void setAge(int curAge)
    {age = curAge;}
}
class Gender extends Person{
    private String gender;
    public Gender(String name, int age,String id) {
        super(name, age);
        setGender(id);
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String id){
        gender = id;
    }
}
public class Polymorphism{
    public static void main(String[] args){
            Gender g = new Gender("Harshit",21,"M");
            Person p = new Gender("Akshita",22,"F");

    }
}


