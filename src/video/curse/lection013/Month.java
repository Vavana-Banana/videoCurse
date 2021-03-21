package video.curse.lection013;

public class Month {
    public static int monthNumber(int a) {
        if (a > 0 && a < 13) {
            System.out.println("Month " + a);
            return a;

        } else return 0;
    }

    public static void main(String[] args) {

        switch (monthNumber(2)) {
            case 1:

            case 3:

            case 5:

            case 7:

            case 8:

            case 10:

            case 12:
                System.out.println("Month has 31 days");
                break;
            case 4:

            case 6:

            case 9:

            case 11:
                System.out.println("Month has 30 days");
                break;
            case 2:
                System.out.println("Month has 28 days");
                break;
            default:
                System.out.println("This month not exist");
                break;
        }
    }
}
