package video.curse.lection001;
import video.curse.lection001.numbers;

public class main {
    public static void main(String[] args) {
       /* System.out.println("                РУБАИ");
        System.out.println("Много лет размышлял я над жизнью земной.");
        System.out.println("Непонятного нет для меня под луной.");
        System.out.println("Мне известно, что мне ничего не известно!");
        System.out.println("Вот последняя правда открытая мной.");
        System.out.println("                                О. Хайям");
        char c1 = 0654;
        char c2 = 0655;
      //  char c3 = 0695;
        String s1 ;
     //   s1 = c1;
        System.out.println(c1);*/

        homework02();
        numbers num01 = new numbers();
        num01.setaByte((byte) 23);
        System.out.println(num01.getaByte());
       //num01.homework01();

    }

    public static void homework02(){

        byte b1 = 12;
        byte b2 = 0b1100;
        byte b3 = 0_14;
        byte b4 = 0xc;
        System.out.println(b1 + " " + b2 + " " + b3 + " " + b4  ) ;

        short s1 = -1300;
        short s2 = -0b10100010100;
        short s3 = 0_37777775354;
        short s4 = 0xFFFFFAEC;
        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4  ) ;

        int i1 = 0;
        int i2 = 0b0;
        int i3 = 0_0;
        int i4 = 0x0;
        System.out.println(i1 + " " + i2 + " " + i3 + " " + i4  ) ;


        long l1 = 123456789;
        long l2 = 0b111010110111100110100010101;
        long l3 = 0_726746425;
        long l4 = 0x75BCD15;
        System.out.println(l1 + " " + l2 + " " + l3 + " " + l4  ) ;

        float f1 = 12.2f;
        float f2 = 111.3F;

        double d1 = 212.1;
        double d2 = 111.1;

        boolean boo1 = true;
        boolean boo2 = false;

        System.out.println(" " + f1 + " " + f2);
        System.out.println(" " + d1 + " " + d2);
        System.out.println(" " + boo1 + " " + boo2);


        char c1 = '1';
        char c2 = '\u0012';
        char c3 = 12345;
        System.out.println(c1 + " " + c2 + " " + c3);

    }
}
