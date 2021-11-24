package HWThreeEnhAndOver.Task003;

public class Ship extends Vehicle {
    private int quantityOfPassengers;
    private String port;

    public Ship(double priceOfVehicle, int speedOfVehicle, int yeafOfManufacturing, int quantityOfPassengers, String port) {
        super(priceOfVehicle, speedOfVehicle, yeafOfManufacturing);
        this.quantityOfPassengers = quantityOfPassengers;
        this.port = port;
        showInfo();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.printf("\nКоличество пассажиров: %d чел.", quantityOfPassengers);
        System.out.printf("\nПорт приписки: %s м.", port);
    }
}
