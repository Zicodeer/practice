package com.myFuture;

public class Test3 {
    public static void main(String[] args){
//        Father father = new Father();
        Child child = new Child();
//        System.out.println(father.getName());
        System.out.println(child.getName());
    }
}
class Father{
    public String getName(){
        return "father";
    }
}
class Child extends Father{
    public String getName(){
        return "child";
    }
}
