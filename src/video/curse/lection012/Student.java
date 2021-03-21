package video.curse.lection012;

public class Student {
    String name;
    int course;
    double grade;

    Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;

    }

    static class StudentTest {
        void equalSt(Student st1, Student st2) {
            if (st1.name == st2.name && st1.course == st2.course && st1.grade == st2.grade) {
                System.out.println("Oni ravny");

            } else System.out.println("Ony ne ravny");
        }

        void equalStDetail(Student st1, Student st2) {

            if (st1.name == st2.name) {
                if (st1.course == st2.course) {
                    if (st1.grade == st2.grade) {
                        System.out.println("Studenty ravny");
                    } else System.out.println("Studenty ne ravny ocenki");
                } else System.out.println("Studenty ne ravny cursy");
            } else System.out.println("Studenty ne ravny imena");
        }


        public static void main(String[] args) {
            StudentTest eq = new StudentTest();
            Student st1 = new Student("Ivan", 4, 7.8);
            Student st2 = new Student("Ivan", 4, 8.8);


            eq.equalSt(st1, st2);

            eq.equalStDetail(st1, st2);


        }
    }
}
