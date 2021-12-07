package com.syntax.class23.abstraction;

abstract public class Phone {//when we have an abstract method the class must be abstract too.
    void makePhoneCalls(){
        System.out.println("Making a call");
    }
    void sendText(){
        System.out.println("Sending a text");
    }
    abstract void displayPictures();//we are not providing "{}" body for this abstract method, abstract are like we are just providing the blueprint then experts put their codes here.
    abstract void unlockPhone();
}
class iPhone extends Phone{//we get error here coz we have 2 x abstract methods, therefore the child class also has to be obstract

    @Override
    void displayPictures(){//as soon as we implement the abstract methods the error is gone
        System.out.println("Iphone uses photos app to display the pictures");
    }
    @Override
    void unlockPhone(){
        System.out.println("Iphone uses faceId to unlock the phone");
    }

}
class Samsung extends Phone{

    @Override
    void displayPictures(){//as soon as we implement the abstract methods the error is gone
        System.out.println("Samsung uses gallery to display the pictures");
    }
    @Override
    void unlockPhone(){
        System.out.println("Samsung uses fingerprint to unlock the phone");
    }
}