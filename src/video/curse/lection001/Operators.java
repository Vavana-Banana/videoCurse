package video.curse.lection001;

public class Operators {

    public static void main(String[] args) {
        int i1 = 5;
        int i2 = 11;

        double d1 = 5.5;
        double d2 = 1.3;

        long L = 20L;
        double result = 0;
        result = i2 / d1 + d2 % i1 - L;
        System.out.println("Answer " + result);

        //        11  /  5,5  + 1,3 %  5  - 20
        //                2       +     1,3   - 20 = -16,7
        int a, b;
        a = 5;
        result = a-- - --a + ++a + a++ + a;
        System.out.println("Answer " + result);
//5 -     3 +   4  +  4 +  5 =  15
//        4       3     4     5

        b = 8;
        result = ++b - b++ + ++b - --b;
        System.out.println("Answer " + result);
        //9  -  9  +  11  - 10      = 1
//         9     10    11    10
    }
}
