package video.curse.lection014;

public class Homework014 {

    static void time() {
        OUTER:
        for (int hour = 0; hour < 6; hour++) {
            for (int minut = 0; minut < 60; minut++) {
                if (hour > 1 && minut >= 10 && minut % 10 == 0) {
                    break OUTER;
                }
                for (int second = 0; second < 60; second++) {

                    if (second * hour > minut) {
                        continue;
                    }
                    String s = "0";
                    if (second < 10) {
                        s = s + second;
                    } else s = Integer.toString(second);
                    System.out.println(" < " + hour + " : " + minut + " : " + s + " > ");
                }
            }
        }
    }

    public static void main(String[] args) {
        time();
    }
}
