package video.curse.lection005;

public class Employee {
    String department;
    String surname;

    int Id;
    int age;
    double salary;

    Employee(String department1, String surname1, int Id1, int age1, double salary1){

        department = department1;
        surname = surname1;
        Id = Id1;
        age = age1;
        salary = salary1;
    }
    double salaryWDvoe(){
        salary*=2;
        System.out.println(salary);
        return salary;
    }

    void employeeInfo(){
        System.out.println(" OTDEL " + department + " FAMILIYA " + surname + " ID " + Id + " AGE " + age + " SALARY " + salary);
    }

}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("OSK","Poluhin",16317,39,1700);
        employee1.employeeInfo();
        Employee employee2 = new Employee("OT","Babel",12313,43,2700);
        employee2.employeeInfo();
        employee1.salaryWDvoe();
        employee1.employeeInfo();
        employee2.salaryWDvoe();
        employee2.employeeInfo();
    }
}