package video.curse.lection0070;

import video.curse.lection007.Employee;

public class TestForTaskLection7 {
    public static void main(String[] args) {
        video.curse.lection007.Employee empPub = new Employee("Ivanov");
        empPub.employeeInfo();
        System.out.println(empPub.surname);
        //System.out.println(empPub.Id);
        // System.out.println(empPub.salary);

        empPub.getSurname();
        empPub.getSalary();
        empPub.getId();


        //video.curse.lection007.Employee empDef = new Employee(002);
        //  empDef.employeeInfo();

       // video.curse.lection007.Employee empPriv = new Employee(2500.0);
        //  empPriv.employeeInfo();
    }
}
