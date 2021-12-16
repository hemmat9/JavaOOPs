package com.syntax.class26.Tasks;

import java.util.HashSet;
import java.util.Set;

public class Task8 {
    public static void main(String[] args) {
        Set<Student> students= new HashSet<>();
        students.add(new Student("Farhad", "123"));
        students.add(new Student("Sharif", "12345"));
        students.add(new Student("Yusuf", "dd123"));
        students.add(new Student("Ibrahim", "dd12345"));
        students.add(new Student("Farid", "adf123"));
        students.add(new Student("Ayesha", "ddddd12345"));

        for (Student student:students) {
            student.printName();
        }
    }
}
