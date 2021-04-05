package video.curse.lection015;

public class Homework015 {
    static void time() {

        int hour = 0;

        OUTER:
        while (hour < 6) {
            int minute = 0;

            do {
                int second = 0;

                while (second < 60) {
                    System.out.println(hour + " : " + minute + " : " + second);

                    second++;
                    if (second * hour > minute) {
                        second=60;

                    }
                }
                minute++;
                if (hour > 1 && minute >= 10 && minute % 10 == 0) {
                    break OUTER;
                }


            } while (minute < 60);
            hour++;
        }
    }

    public static void main(String[] args) {
        time();
    }
}
