package HWTwoClassObject.Task003;

public class Car {

    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car() {

    }

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
    }

    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void showCarInfo() {
        System.out.printf("\nИнформация про выбранное авто:");
        System.out.printf("\nГод выпуска: %d.", this.year);
        System.out.printf("\nСкорость: %.2f км.", this.speed);
        System.out.printf("\nВес: %d кг.", this.weight);
        System.out.printf("\nЦвет: %s.", this.color);
    }
}
