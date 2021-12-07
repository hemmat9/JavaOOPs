package com.syntax.class19;

public class EmployeeTester {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.age=25;
        employee.baseNoDayOff=10;
        employee.printSalary();
        employee.printNoDaysOff();
        employee.printAge();
    }
}