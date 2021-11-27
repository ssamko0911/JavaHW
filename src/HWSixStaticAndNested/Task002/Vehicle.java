package HWSixStaticAndNested.Task002;

public class Vehicle {

    public static void print() {
        System.out.println("Транспортное средство");
    }

    public class Wheel {
        public static void print() {
            System.out.println("Колесо");
        }
    }

    public class Door {
        public static void print() {
            System.out.println("Дверь");
        }
    }
}
