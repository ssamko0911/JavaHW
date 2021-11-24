package HWTwoClassObject.Task004;

public class Main {

    public static void main(String[] args) {
        Car carOne = new Car();
        Car carTwo = new Car(2018);
        Car carThree = new Car(2017, 210.0);
        Car carFour = new Car(2018, 198.6, 2000);
        Car carFive = new Car(2020, 220.7, 2500, "синий");

        System.out.printf("Год выпуска второго автомобля - %d.", carTwo.getYear());
        System.out.printf("\nЦвет пятого автомобиля - %s.", carFive.getColor());
        carFour.setColor("Зелёный");
        System.out.printf("\nМы покрасили четвёртый автомобиль, его цвет - %s.", carFour.getColor());

        System.out.println();
        carOne.showCarInfo();
        System.out.println();
        carThree.showCarInfo();
    }

}
