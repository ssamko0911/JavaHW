package HWThreeEnhAndOver.Task003;

public class Plane extends Vehicle {
    private int height;
    private int quantityOfPassengers;

    public Plane(double priceOfVehicle, int speedOfVehicle, int yearOfManufacturing, int height, int quantityOfPassengers) {
        super(priceOfVehicle, speedOfVehicle, yearOfManufacturing);
        this.height = height;
        this.quantityOfPassengers = quantityOfPassengers;
        showInfo();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.printf("\nВысота: %d м.", height);
        System.out.printf("\nКоличество пассажиров: %d чел.", quantityOfPassengers);
    }
}


