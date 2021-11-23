package com.syntax.class20;
//Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it, then the message "I love programming languages" should be printed.
// If some String is passed to it, then in place of "programming languages" the value variable should be printed. Example,
// if we pass "Java", then "I love Java" should be printed.
public class Programming {

    public Programming(){//to call a constructor type we don't need to create object we just call the constructor
        System.out.println("I love programming languages");
    }
   public Programming(String java){
        System.out.println("I love " + java);
    }
}
