package com.syntax.class24.interfaceDemo4;

public interface I1 {
    int age =10;
    void method();
    static void method2(){
        System.out.println("I am Method2 from Interface  1");
    }
}
interface I2{
    int age =20;
    void method();
    static void method2(){
        System.out.println("I am method2 from Interface 2");
    }
}
class Test implements I1,I2{
    @Override
      public void method() {
        System.out.println(I2.age);//we should specify the name of Interface to execute it if we have same fields in the interfaces
        System.out.println("I will be called for both the the methods from both Interface");
    }

}
class Main{
    public static void main(String[] args) {
        I1 i1 = new Test();
        i1.method();
        I2 i2 = new Test();
        i2.method();
        I1.method2();
        I2.method2();
    }
}
