package com.syntax.class26.Tasks;
//Create a Set collection that will hold Objects of Student Type.
//In this set we do not care about the insertion order.
//Each student object should have name and studentID. Display name of each student.

public class Student {
    String name;
    String studentID;

    public Student (String name, String studentID){
        this.name=name;
        this.studentID=studentID;
    }
    void printName(){
        System.out.println(name);
    }

}
