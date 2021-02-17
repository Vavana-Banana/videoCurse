package video.curse.lection005;

public class BankAccount {
    int id = 10;
    String name = "Petr";
    double balance = 100;

    double popolnenieScheta(double sumUp) {
        balance += sumUp;
        return balance;
    }

    double snyatieSoScheta(double sumDown) {
        balance -= sumDown;
        return balance;
    }

    void info() {
        System.out.println("ID " + id + "; NAME " + name + "; BALANCE " + balance);
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.balance = 1000.4;
        MyAccount.name = "Vovan";

        MyAccount.info();

        MyAccount.snyatieSoScheta(5);
        System.out.println();
        MyAccount.info();
        System.out.println();
        MyAccount.popolnenieScheta(1200);


        MyAccount.info();

        System.out.println("*****************************************");

        Student student1 = new Student();

        student1.nomerStudBilet = 113;
        student1.firstName = "Lopuskov";
        student1.secondName = "Baselione";
        student1.yearOfEducation = 4;
        student1.srednOcencaMatem = 9.5;
        student1.srednOcencaEconom = 6.7;
        student1.srednOcencaForeghnLang = 8.8;
        student1.studInfo();
        System.out.println("Sred ocenka = " + student1.sredArifmOcenka());

        Student studentWithNull = new Student();
        Student studentWithThree = new Student(15, "Vasya", "Ivanov", 1999);
        Student studentWithAll = new Student(166, "Vanya", "Popov", 2004, 3.5, 7.2, 9.5);

        studentWithNull.studInfo();
        studentWithThree.studInfo();
        studentWithAll.studInfo();

    }
}

class Student {
    int nomerStudBilet;
    String firstName;
    String secondName;
    int yearOfEducation;
    double srednOcencaMatem;
    double srednOcencaEconom;
    double srednOcencaForeghnLang;

    Student(int nomerStudBilet,
            String firstName,
            String secondName,
            int yearOfEducation) {
        this(nomerStudBilet, firstName, secondName, yearOfEducation, 0.0, 0.0, 0.0);
    }

    Student() {

    }

    ;

    Student(int nomerStudBilet,
            String firstName,
            String secondName,
            int yearOfEducation,
            double srednOcencaMatem,
            double srednOcencaEconom,
            double srednOcencaForeghnLang) {
        this.nomerStudBilet = nomerStudBilet;
        this.firstName = firstName;
        this.secondName = secondName;
        this.yearOfEducation = yearOfEducation;
        this.srednOcencaMatem = srednOcencaMatem;
        this.srednOcencaEconom = srednOcencaEconom;
        this.srednOcencaForeghnLang = srednOcencaForeghnLang;
    }

    void studInfo() {
        System.out.println(" ID " + nomerStudBilet + " NAME " + firstName + " SERNAME " + secondName + " YEAR " + yearOfEducation + " MATH " + srednOcencaMatem + " ECON " + srednOcencaEconom + " F_LANG" + srednOcencaForeghnLang);
    }

    double sredArifmOcenka() {
        return (srednOcencaMatem + srednOcencaForeghnLang + srednOcencaForeghnLang) / 3;
    }

}