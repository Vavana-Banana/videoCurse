package video.curse.lection002.Task4;

public class StudentTest {
    public static void main(String[] args) {
        double arithmeticMean = 0;

        Student student1 = new Student();
        student1.studentFirstName = "Ivan";
        student1.studentSecondName = "Ivanov";
        student1.studentIDnumber = 110119;
        student1.yearOfStudy = 2004;
        student1.averageRaitingEconomic = 5.0;
        student1.averageRaitingMath = 6.3;
        student1.averageRaitingForeignLang = 7.2;
        System.out.println(student1.studentFirstName);
        arithmeticMean = (student1.averageRaitingEconomic  + student1.averageRaitingMath + student1.averageRaitingForeignLang)/3;
        System.out.println("Средняя арифметическая оценка по 3-м предметам = " + arithmeticMean);
        System.out.println();

        Student student2 = new Student();

        student2.studentFirstName = "Daniil";
        student2.studentSecondName = "Slepakov";
        student2.yearOfStudy = 2006;
        student2.averageRaitingEconomic = 2.8;
        student2.averageRaitingMath = 9.3;
        student2.averageRaitingForeignLang = 4.7;
        student2.studentIDnumber = 110129;

        System.out.println(student2.studentFirstName);

        arithmeticMean = (student2.averageRaitingEconomic  + student2.averageRaitingMath + student2.averageRaitingForeignLang)/3;
        System.out.println("Средняя арифметическая оценка по 3-м предметам = " + arithmeticMean);
        System.out.println();

        Student student3 = new Student();

        student3.studentFirstName = "Irina";
        student3.studentSecondName = "Lugkova";
        student3.studentIDnumber = 110219;
        student3.yearOfStudy = 2002;
        student3.averageRaitingEconomic = 8.0;
        student3.averageRaitingMath = 8.3;
        student3.averageRaitingForeignLang = 6.5;

        System.out.println(student3.studentFirstName);

        arithmeticMean = (student3.averageRaitingEconomic  + student3.averageRaitingMath + student3.averageRaitingForeignLang)/3;
        System.out.println("Средняя арифметическая оценка по 3-м предметам = " + arithmeticMean);
        System.out.println();

    }
}
