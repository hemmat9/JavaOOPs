package com.syntax.class24.interfaceDemo3;

public interface Interface {

    default void method1(){//it is only to know that we can have these kinds of methods too
        System.out.println(" I am default method in Interface");
    }
    static void method2(){//it is only to know that we can have these kinds of methods too
        System.out.println(" I am a static method in Interface");
    }
}
class Test implements Interface{

}
class Main{
    public static void main(String[] args) {
        Interface.method2();// it is an static method that is why we can call it directly without creating an object of it.
        //Interface.method1();// I can not call this method because I have to create an object out of it.
        Interface interface1 = new Test();
        Interface.method2();
        new Test().method1();

    }
}
