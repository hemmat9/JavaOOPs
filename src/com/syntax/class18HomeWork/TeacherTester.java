package com.syntax.class18HomeWork;

public class TeacherTester {
    public static void main(String[] args) {
        PianoTeacher piano = new PianoTeacher();
        piano.name="Smith";
        piano.subject="Piano";
        piano.age=45;
        piano.title="Teacher";
        piano.eat();
        piano.teach();
        piano.play();

        ChemistryTeacher chemis = new ChemistryTeacher();
        chemis.name="Mike";
        chemis.subject="Chemistry";
        chemis.salary=60000;
        chemis.test();

        MathTeacher math = new MathTeacher();
        math.name="Timothy";
        math.age=56;
        math.salary=65000;
        math.practice();





    }
}
