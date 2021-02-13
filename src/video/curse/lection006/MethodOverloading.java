package video.curse.lection006;

public class MethodOverloading {
    void show(int i1){
        System.out.println(i1);

    }
    void show(boolean b1){
        System.out.println(b1);

    }

    void show(String s1){
        System.out.println(s1);

    }
}

class MethodOveloadingTest{
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        int a = 100;
        mO.show(a);
        boolean b = true;
        mO.show(b);
        String s = "Hello world";
        mO.show(s);
    }
}
