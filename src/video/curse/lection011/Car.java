package video.curse.lection011;

public class Car {
    String color;
    String motor;
    int countDoors;

    public Car(String color, int countDoors) {
        this.color = color;
        this.countDoors = countDoors;
    }


}

class CarTest {

    public static void changeCountDoors(int a, Car car1) {
        car1.countDoors = a;
    }

    public static void changeColors(Car car1, Car car2) {
        String s;
        s = car1.color;
        car1.color = car2.color;
        car2.color = s;
    }


    public static void main(String[] args) {
        Car car1 = new Car("Yellow", 5);
        Car car2 = new Car("Green", 2);

        System.out.println(car1.color);
        System.out.println(car1.countDoors);
        System.out.println();

        System.out.println(car2.color);
        System.out.println(car2.countDoors);
        System.out.println();


        CarTest.changeCountDoors(4, car1);
        CarTest.changeCountDoors(4, car2);

        CarTest.changeColors(car1, car2);

        System.out.println(car1.color);
        System.out.println(car1.countDoors);
        System.out.println();

        System.out.println(car2.color);
        System.out.println(car2.countDoors);
        System.out.println();
    }
}