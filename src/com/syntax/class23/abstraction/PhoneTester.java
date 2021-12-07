package com.syntax.class23.abstraction;

public class PhoneTester {
    public static void main(String[] args) {
        //Phone phone = new Phone();// we cannot create objects of this class because it is abstract

        /*iPhone iphone = new iPhone();//but we can create objects when we implement those abstract methods
        iphone.displayPictures();
        iphone.unlockPhone();
        iphone.makePhoneCalls();
        iphone.sendText();

        Samsung samsung = new Samsung ();
        samsung.displayPictures();
        samsung.unlockPhone();
        samsung.makePhoneCalls();
        samsung.sendText();*/

        Phone [] phones ={ new iPhone(), new Samsung()};//this is polymorphism

        for (Phone ph:phones){//with the help of for loop we can access all the methods
            ph.displayPictures();
            ph.unlockPhone();
            ph.makePhoneCalls();
            ph.sendText();
        }
    }
}
