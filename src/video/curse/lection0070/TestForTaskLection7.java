package video.curse.lection0070;

import video.curse.lection007.Employee;

public class TestForTaskLection7 {
    public static void main(String[] args) {
        Employee empPub = new Employee("Ivanov", 001, 2000.0);
        empPub.employeeInfo();
        System.out.println(empPub.surname);
        //System.out.println(empPub.Id);
        // System.out.println(empPub.salary);

        // Employee empDef = new Employee(002, 3000.0, "Petrov");
        //  empDef.employeeInfo();

        //  Employee empPriv = new Employee(2500.0, 003, "Galkina");
        //  empPriv.employeeInfo();
    }
}
