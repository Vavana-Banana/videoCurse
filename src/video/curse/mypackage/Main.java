//package video.curse.mypackage;



    class Cat {
        String name;
        String info1;
        Integer age;
        Integer id;
        Byte numberOfLives = 9;
        Byte hungry = 100;

        Box box = new Box(10,20,30);

        void info(){
            System.out.println("Cat name: " + name + " - " + " Cat age: " +
                    age + " - " + " Cat Identificator: " + id + " - " + " Current Lives: " +
                    numberOfLives + " Level of hungry: " + hungry + " BOX " + box.height + " " +
                    box.weight + " " +  box.length);
            // info1 = box.boxInfo;
            box.boxInfo();
        }

        byte jump(byte numberOfJump){
            hungry = (byte)(hungry - (byte)(numberOfJump * 10));
            return  hungry;
        }

    }

    class Box {
        Integer height;
        Integer weight;
        Integer length;

        Box(int h, int w, int l){
            height = h;
            weight = w;
            length = l;
        }
        public void boxInfo(){
            System.out.print(" VisotaTA " + height);
            System.out.print(" DlinaTA " + length);
            System.out.print(" ShirinaTA " + weight);
            System.out.println();
        }
    }

    public class Main {
        public static void main(String args[]) {

            Cat cat1 = new Cat();



            cat1.info();

            cat1.name = "Vasya";
            cat1.age = 1;
            cat1.id = 100;
            cat1.jump((byte)5);

            cat1.box.boxInfo();
            cat1.box = new Box(10, 20, 15);
            cat1.info();

        }
    }
