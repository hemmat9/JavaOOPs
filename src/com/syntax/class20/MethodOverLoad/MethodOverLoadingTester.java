package com.syntax.class20.MethodOverLoad;

public class MethodOverLoadingTester {

    public static void main(String[] args) {
        MethodOverLoading.add(10,10);//if I want to call the method with mentioning the class name then methods should be Static
        MethodOverLoading.addDouble(10.5,10.5);
        MethodOverLoading.addIntDouble(10,10.5);
        MethodOverLoading.addAddInt(10,10,10);
        MethodOverLoading.addIntDouble(10,10.5);
        MethodOverLoading.multi3Numbers(3,4,6);
        MethodOverLoading.multiNumber(2,5);
        int [] arr={10,10,10,1045,78,56,78,98,65,48,6352};
        MethodOverLoading.addArray(arr);
    }
}
