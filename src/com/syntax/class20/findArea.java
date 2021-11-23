package com.syntax.class20;

public class findArea {

    static void areaOfRectAngel(double length, double width){
        if (length>width || width >length){
        System.out.println("Area of Rectangle is = " +length*width);
    }else{
            System.out.println("You need to select different numbers");
        }
    }

    static void volumeOfSquare(double side){

            System.out.println("The are of square is = " + 2*(side*2));
    }
    static void areaOfBox(double length, double width, double height){
        System.out.println("The are of a box is = " + 4*(length+width+height));
    }
}
