package HWSixStaticAndNested.Task002;

public class Run {

    public static void main(String[] args) {
        Vehicle.Wheel someVehicleOne = new Vehicle().new Wheel();
        Vehicle.Door someVehicleTwo = new Vehicle().new Door();
        someVehicleOne.print();
        someVehicleTwo.print();
    }
}
