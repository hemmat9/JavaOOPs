package com.syntax.class22;

public class PersonTester {
    public static void main(String[] args) {
       Person person= new Teacher("Asghar");
        //person.eat();

        //Teacher teacher = new Person("Person"); all persons are not teacher

        //Person person2=new Student("Farhad");//this is allowed coz all students are person

        //this is how we use polymorphism
        Person[]persons={new Employee("Asghar"), new Teacher("Moazzam"), new Student("Farhad")};
        for (Person per:persons){
            per.eat();
            per.performDailyTask();

            if (per instanceof Teacher){
                ((Teacher)per).designClasses();
            }

        }
    }
}
