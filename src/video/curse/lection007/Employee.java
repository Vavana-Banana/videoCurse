package video.curse.lection007;

public class Employee {
    String department;
    public String surname;

    int Id;
    int age;
    private double salary;

    Employee(String department1, String surname1, int Id1, int age1, double salary1) {

        department = department1;
        surname = surname1;
        Id = Id1;
        age = age1;
        salary = salary1;
    }

    double salaryWDvoe() {
        salary *= 2;
        System.out.println(salary);
        return salary;
    }

    public void employeeInfo() {
        System.out.println(" OTDEL " + department + " FAMILIYA " + surname + " ID " + Id + " AGE " + age + " SALARY " + salary);
    }

    //1 открыт (стринг инт доубле)
    public Employee(String surname) {
        this.surname = surname;

    }

    //2 дефолт (инт доубл стринг)
    Employee(int id) {

        Id = id;

    }

    //3 закрыт (доубле инт стринг)
    private Employee(double salary) {


        this.salary = salary;
    }

    public void getId() {
        System.out.println("ID = " + Id);
    }

    public void getSalary() {
        System.out.println("Salary = " + salary);
    }

    public void getSurname() {
        System.out.println("Surname = " + surname);
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee empPub = new Employee("Ivanov");
        empPub.employeeInfo();
        System.out.println(empPub.surname);
        System.out.println(empPub.Id);
        //  System.out.println(empPub.salary);
        empPub.getId();
        empPub.getSalary();
        empPub.getSurname();

        Employee empDef = new Employee(002);
        empDef.employeeInfo();
        System.out.println(empDef.surname);
        System.out.println(empDef.Id);
        //System.out.println(empDef.salary);
        empDef.getId();
        empDef.getSalary();
        empDef.getSurname();


        // Employee empPriv = new Employee(2500.0);
        // empPriv.employeeInfo();
    }
}
