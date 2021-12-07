package com.syntax.class22;

public class StudentTaskTester {

    public static void main(String[] args) {

        StudentTask[]studentTasks={new SyntaxStudent(), new collegeStudents(), new schoolStudent()};
        for (StudentTask studentTask: studentTasks){
            studentTask.study();
            studentTask.doHomeWork();
            studentTask.practice();

            if (studentTask instanceof SyntaxStudent){//to find the methods other than overridden in child class
                ((SyntaxStudent)studentTask).doResearch();
            }
        }

    }
}
