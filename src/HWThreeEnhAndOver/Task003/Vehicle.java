package HWThreeEnhAndOver.Task003;

public class Vehicle {
    private double priceOfVehicle;
    private int speedOfVehicle;
    private int yearOfManufacturing;

    public Vehicle(double priceOfVehicle, int speedOfVehicle, int yearOfManufacturing) {
        this.priceOfVehicle = priceOfVehicle;
        this.speedOfVehicle = speedOfVehicle;
        this.yearOfManufacturing = yearOfManufacturing;
    }

    public void showInfo() {
        System.out.printf("\nЦена: %.2f USD.", priceOfVehicle);
        System.out.printf("\nСкорость: %d км\\час.", speedOfVehicle);
        System.out.printf("\nГод выпуска: %d.", yearOfManufacturing);
    }
}
