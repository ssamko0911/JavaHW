package HWTwoClassObject.Task002;

public class Main {
    public static void main(String[] args) {
        Car carOne = new Car();
        Car carTwo = new Car(2019);
        Car carThree = new Car(2018, "White");
        Car carFour = new Car(2011);
        Car carFive = new Car();
        Car carSix = new Car(2016, "Red");

        System.out.println(carSix.getYear());
        System.out.println(carSix.getColor());
        System.out.println(carOne.getColor());
        carOne.setColor("Green");
        System.out.println(carOne.getColor());
        System.out.printf("The color of my car is %s", carThree.getColor());
    }
}
