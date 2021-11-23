package com.syntax.class20;

public class Parent {

    String name ="Kabir";
    void printName(){
        System.out.println("name is "+name);
    }
    void getMarried(){
        System.out.println("Farhad will get married by my choice");
    }
}
class Child extends Parent {
    String name = "Ahmad";
    void printName() {
        String name="Sharif";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

    @Override//this is called annotation , by this we are providing extra information to our compiler.
    void getMarried(){
        System.out.println("But I like someone else");
    }
    void letsDoSomethingCrazy(){
        super.getMarried();
        getMarried();
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.letsDoSomethingCrazy();
    }
  }