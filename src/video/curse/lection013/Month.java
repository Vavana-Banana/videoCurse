package video.curse.lection013;

public class Month {
    public static void monthNumber(int a) {


        switch (a) {
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

    public static void main(String[] args) {

        monthNumber(1);
        monthNumber(0);
        monthNumber(190);
        monthNumber(5);
        monthNumber(2);
    }
}
