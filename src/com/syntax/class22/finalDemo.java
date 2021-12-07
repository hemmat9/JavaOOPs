package com.syntax.class22;

 class Parent{//we can also use final keyword with a class to make it non-reachable even to subclasses.

     final double GRAVITY;//if you want a variable constant and not to be changed then use the keyword final with it.

    Parent(double gravity){
    this.GRAVITY=gravity;
}

   final void printGravity(){
        //gravity=10.2;//we can not change or reassign the value of variable gravity coz it is final.
        System.out.println(GRAVITY);
    }
}
class Child extends Parent{
    double gravity=10;// we can declare it here and give it a value
    Child(double gravity){
        super(gravity);
    }
    //void printGravity(){//we can not override the method because it is final.


    }
