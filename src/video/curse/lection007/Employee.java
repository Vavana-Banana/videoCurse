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
    public Employee(String surname, int id, double salary) {
        this.surname = surname;
        Id = id;
        this.salary = salary;
    }

    //2 дефолт (инт доубл стринг)
    Employee(int id, double salary, String surname) {
        this.surname = surname;
        Id = id;
        this.salary = salary;
    }

    //3 закрыт (доубле инт стринг)
    private Employee(double salary, int id, String surname) {
        this.surname = surname;
        Id = id;
        this.salary = salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee empPub = new Employee("Ivanov", 001, 2000.0);
        empPub.employeeInfo();
        System.out.println(empPub.surname);
        System.out.println(empPub.Id);
      //  System.out.println(empPub.salary);

        Employee empDef = new Employee(002, 3000.0, "Petrov");
        empDef.employeeInfo();
        System.out.println(empDef.surname);
        System.out.println(empDef.Id);
        //System.out.println(empDef.salary);


        //Employee empPriv = new Employee(2500.0, 003, "Galkina");
        // empPriv.employeeInfo();
    }
}
