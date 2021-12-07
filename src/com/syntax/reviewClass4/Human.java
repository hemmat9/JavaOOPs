package com.syntax.reviewClass4;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

public abstract class Human {//every abstract class must participate in the Inheritance otherwise it is pointless

    public String name, lastName;
    static boolean brain;

   public Human(String name, String lastName){
        this.name=name;
        this.lastName=lastName;
    }
    public void printInfo(){
        System.out.println(name+" "+lastName);
    }
    static void sleep(){
        System.out.println("All Human sleep");
    }
    static void eat (){
        System.out.println("All human eat");
    }
    private void live(){
        System.out.println("This method is useless");
    }
     abstract void speak();//we can not have private access modifier with abstract methods
}
    abstract class Teacher extends Human {

    protected double salary;

    public Teacher(String name, String lastName, double salary){
        super(name, lastName);
        this.salary=salary;
    }
    public void teach(){
        System.out.println("Every Teacher teach");
    }
    public void getPaid(){
        System.out.println("Teacher gets paid"+ salary);
    }
    public abstract void takeExam();

        private void hasVocation(){//can not be overridden coz it is privateL
            System.out.println("");
}
}
class MathTeacher extends Teacher{
    String subject;
    MathTeacher(String name, String lastName, double salary, String subject){
        super(name, lastName, salary);
        this.subject=subject;
    }
    public void speak(){
        System.out.println(name+" "+lastName+ " speaks math language");
    }
    public void speak(String language){
        System.out.println(name+" speakes "+language);
    }
    public void takeExam(){
        System.out.println(name+" "+lastName+ " takes exam of "+subject);
    }
    private void hasVacation(){
        System.out.println(name+" "+ lastName+" have 2 weeks vacation");
    }
    /*Rules
    * --1. inheritance
    * --2. same signature (name+parameter) and same return type
    * --3. access modifiers cannot be more restrictive
    * --4. cannot override private because private doesn't participate in inheritance
    * */
    @Override
    public void teach(){
        System.out.println(name+" teaches "+subject);
    }
}
