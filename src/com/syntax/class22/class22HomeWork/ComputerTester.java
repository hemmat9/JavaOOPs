package com.syntax.class22.class22HomeWork;

public class ComputerTester {
    public static void main(String[] args) {

        Computer []computers = {new Apple("MacBook"), new Dell("Dell"), new Lenovo("Lenovo"), new HP("HP")};

        for (Computer computer:computers){
            computer.operatingSystem();

            if (computer instanceof Dell){//for printing the specific methods
                ((Dell)computer).services();
                if (computer instanceof Computer){
                    ((Computer)computer).playVideo();
                    if (computer instanceof HP){
                        ((HP)computer).printGraphic();
                    }
                }
            }
        }
    }
}
