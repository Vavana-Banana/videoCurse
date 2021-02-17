package video.curse.lection006;

public class MethodOverloading {
    void show(int i1) {
        System.out.println(i1);

    }

    void show(boolean b1) {
        System.out.println(b1);

    }

    void show(String s1) {
        System.out.println(s1);

    }
}

class MethodOveloadingTest {
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        int a = 100;
        mO.show(a);
        boolean b = true;
        mO.show(b);
        String s = "Hello world";
        mO.show(s);

        Summa test5 = new Summa();
        int summma = test5.summaFiveNambers(2, 3, 4, 5, 6);
        System.out.println(summma);
        summma = test5.summaFourNumbers(3, 4, 5, 6);
        System.out.println(summma);
        summma = test5.summaThreeNumbers(10, 20, 30);
        System.out.println(summma);
        summma = test5.summaTwoNambers(10, 15);
        System.out.println(summma);
        summma = test5.summaOneNumber(1);
        System.out.println(summma);
        summma = test5.summaNullNumbers();
        System.out.println(summma);

    }
}

class Summa {
    int a, b, c, d, e;

    int summaFiveNambers(int a, int b, int c, int d, int e) {
        int output;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;


        output = a + b + c + d + e;
        System.out.println(output);
        return output;

    }

    int summaFourNumbers(int b, int c, int d, int e) {
        this.summaFiveNambers(0, b, c, d, e);
        int output;
        output = b + c + d + e;
        System.out.println(output);
        return output;
    }

    int summaThreeNumbers(int a, int b, int c) {
        int output;
        output = a + b + c;
        return output;
    }

    int summaTwoNambers(int a, int b) {
        int output;
        output = a + b;
        return output;
    }

    int summaOneNumber(int a) {
        int output;
        output = a;
        return output;
    }
    int summaNullNumbers(){
        return 0;
    }
}
