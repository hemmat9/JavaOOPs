package com.syntax.class22;

public class StudentTask {

    void study(){
        System.out.println("Students must study");
    }
    void doHomeWork(){
        System.out.println("Students must do homework");
    }
    void practice (){
        System.out.println("Students must practice");
    }
}
class SyntaxStudent extends StudentTask{

    void study(){
        System.out.println("Students must study 25 hours a week");
    }
    void doHomeWork(){
        System.out.println("Students must solve repls");
    }
    void doResearch(){
        System.out.println("Syntax student must do additional research");
    }
}
class collegeStudents extends StudentTask {

    void doHomeWork() {
        System.out.println("College students must do homework");
    }
}
class schoolStudent extends StudentTask{

}