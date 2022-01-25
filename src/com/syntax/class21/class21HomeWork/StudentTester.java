package com.syntax.class21.class21HomeWork;

public class StudentTester {
    public static void main(String[] args) {
       /* Student[] students = {new SchoolStudent(), new CollegeStudent(), new SyntaxStudent()};
        for (Student student : students) {
            student.studyHard();
            student.eat();
            student.sleep();
        }*/
        Student schoolStudent = new SchoolStudent();
        schoolStudent.sleep();
        schoolStudent.eat();
        schoolStudent.studyHard();
        SchoolStudent schoolStudent1= (SchoolStudent) schoolStudent;
        schoolStudent1.play();

        Student collegeStudent = new CollegeStudent();
        collegeStudent.studyHard();
        collegeStudent.eat();
        collegeStudent.sleep();
        CollegeStudent collegeStudent1= (CollegeStudent) collegeStudent ;
        collegeStudent1.practice();

        Student syntaxStudent = new SyntaxStudent();
        syntaxStudent.sleep();
        syntaxStudent.studyHard();
        syntaxStudent.eat();
        SyntaxStudent syntaxStudent1= (SyntaxStudent) syntaxStudent;
        syntaxStudent1.vocation();
    }
}