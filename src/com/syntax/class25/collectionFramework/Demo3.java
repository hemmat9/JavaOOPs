package com.syntax.class25.collectionFramework;

public class Demo3 {
    //why we use wrapper classes? we use it because we can not use primitive data types inside the collection frameworks they only work with wrapper classes(building classes).
    public static void main(String[] args) {
        int primitiveNumber=10; //If I want to convert it to a class type
        Integer classNumber = primitiveNumber;
        primitiveNumber=classNumber;
        System.out.println(classNumber);
        //primitive Data types with first letter Capitalized is called wrapper classes.
        Integer number = new Integer(10);//this is called boxing putting a primitive inside a wrapper. we can do it as bellow too
        Integer number2=10;//this is called auto inboxing putting a primitive inside a wrapper.
        int another = number.intValue();//unboxing longer way
        int another2 = number2; //auto unboxing shorter way
    }
}
