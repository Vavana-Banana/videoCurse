package video.curse.lection008;

public class Homework08 {
    //first method
    public static double met1(double a1, double b1, double c1) {
        return a1 * b1 * c1;
    }


    //second method
    public static void met2(int a2, int b2) {
        int c2 = a2 / b2;
        int d2 = a2 % b2;
        System.out.println("Celoe = " + c2);
        System.out.println("Chastnoe = " + b2);
        System.out.println("Ostatok = " + d2);
    }


}

class Homework08Test {
    public static void main(String[] args) {
        System.out.println((Homework08.met1(3, 5, 10)));
        System.out.println((Homework08.met1(16, 8, 15)));

        //
        Homework08.met2(12, 4);
        System.out.println(" ");
        Homework08.met2(32, 6);
        System.out.println(" ");

        Homework08 hom08 = new Homework08();
        hom08.met2(124, 8);


    }
}
