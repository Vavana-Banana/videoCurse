package video.curse.lection010.P4;

import video.curse.lection010.P1.P2.B;
import video.curse.lection010.P1.P2.P3.C;
import video.curse.lection010.P1.A;
import video.curse.lection010.P4.P5.E;

public class D {
    public static void main(String[] args) {
        String d;

        A testAinD = new A();

        B.testB("Hello from B");

        C testCinD = new C();

        E testEinD = new E();


        testAinD.testA("Hello from A");

        d = "sometimes";
        testAinD.a = 5;
        testCinD.c = 10;
        testEinD.e = 15;
        B.b = 25;

        System.out.println(d + " " + testAinD.a + " " + testCinD.c + " " + testEinD.e + " " + B.b);

        testCinD.testC("Hello from C");

        testAinD.testA("Hello from A");

        testEinD.testE("Hello from E");



    }

}
