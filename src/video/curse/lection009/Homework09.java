package video.curse.lection009;
import java.lang.*;
public class Homework09 {
    String name;
    static int counter;
    int numberElement;

    Homework09(String name) {
        this.name = name;
        counter++;
        numberElement = counter;

    }

    public void info() {
        System.out.println(numberElement);

    }
}

class Test1 {


    int a = 1;

    // static int a=2;
    void abc(int a) {
        System.out.println(a);
        System.out.println(this.a);
    }
}

class Test2 {
    int a = 1;
    static int b = 2;

    static void abc(final int a) {
        System.out.println(a);
        System.out.println(Test2.b);
    }

    public static void main(String[] args) {
        abc(5);
    }
}

class Test3 {
    int a =1;
    static int b =2;
     void abc(int a){
         System.out.println(b);
         System.out.println(a);
         System.out.println(this.a);
         System.out.println(Test3.b);
     }

    public static void main(String[] args) {
        Test3 t = new Test3();
        t.abc(4);
    }
}


class Main {
    public static void main(String[] args) {
        Homework09 h1 = new Homework09("1");
        Homework09 h2 = new Homework09("2");
        Homework09 h3 = new Homework09("3");
        Homework09 h4 = new Homework09("4");
        Homework09 h5 = new Homework09("5");
        Homework09 h6 = new Homework09("6");
        Homework09 h7 = new Homework09("7");
        Homework09 h8 = new Homework09("8");

        h8.info();

        h1 = null;
        h2 = null;
        h3 = null;
        h4 = null;
        h5 = null;
        // h1.info();


        //Проверка усьного счета вывода кода
        Test1 t = new Test1();
        t.abc(3);

    }

}
