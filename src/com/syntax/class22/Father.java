package com.syntax.class22;

public class Father {

    String name;

    Father(String name) {
        this.name = name;
    }

    void sleep() {
        System.out.println(name + " i like to sleep 8 hours");
    }

    void eat() {
        System.out.println(name + " I like to eat Veggie");
    }
}

class Son extends Father {
    Son(String name) {
        super(name);
    }

    void sleep() {
        System.out.println(name + " like to sleep 10 hours");
    }

    void eat() {
        System.out.println(name + " like to eat kabob");
    }
    void playVideoGames(){
        System.out.println(name + " likes to play video Games");
    }
}

class Son2 extends Father {
    Son2(String name) {
        super(name);
    }

    void eat() {
        System.out.println(name + " like to eat Fish");
    }
}