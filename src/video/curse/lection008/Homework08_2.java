package video.curse.lection008;

public class Homework08_2 {
    static final double PI = 3.14;

    //method 1 plochad
    public void met1(double radius1) {
        double s = PI * radius1 * radius1;
        System.out.println("Ploschad kruga = " + s);

    }
    //method 2 dlina okr

    public static void met2(double radius2) {
        double c = 2 * PI * radius2;
        System.out.println("Dlina okrugnosty = " + c);
    }

    //method 3 radius plochad dlina okr

    public void met3(double radius3) {
        System.out.println("Radius okrugnosty = " + radius3);
        Homework08_2 obj1 = new Homework08_2();
        obj1.met1(radius3);
        Homework08_2.met2(radius3);

    }
}

class Homework08_Test {
    public static void main(String[] args) {
        Homework08_2 hom1 = new Homework08_2();
        hom1.met1(5);
        System.out.println(" ");
        Homework08_2.met2(15);
        System.out.println(" ");
        hom1.met3(20);

    }

}