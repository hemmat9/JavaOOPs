package com.syntax.reviewClass10;

public interface Drawable {
    //final void draw(); added by the compiler automatically we can't use final with
    //private void draw(); private and protected access modifiers are not allowed
    //static void draw(); static keyword is also not allowed because statics belong to the classes not interfaces.
   //int paperSize; we can not leave the fields as uninitialized coz every field in interface are final, and they must have a value.
    //abstract int paperSize=12; abstract with the fields are not allowed anywhere(not in classes) coz they don't have a body
    //public static final int paperSize=12;// all the field in the interface are public static final by default
    // we can't have protected and private keywords with fields as well
    //we can not have constructors in the interfaces because there are no instance fields
    int paperSize=12;
    void draw();
    static void staticMethod(){
        System.out.println("I am a static method inside an interface");
    }
    default void defaultMethod(){
        System.out.println("I am a default method inside an interface");
    }
}
class Rectangle implements Drawable{
    @Override
    public void draw(){//we should decrease the visibility(make it public)
        System.out.println("Drawing a rectangle");
    }
}
class Circle implements Drawable{
    @Override
    public void draw(){
        System.out.println("Drawing a Circle");
    }
}
