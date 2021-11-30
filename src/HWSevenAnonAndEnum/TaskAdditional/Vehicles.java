package HWSevenAnonAndEnum.TaskAdditional;

public enum Vehicles {
    CYCLE(6700, "Red"), CAR(418000, "Black");

    private String color;
    private int priceOfVehicle;

    Vehicles(int priceOfVehicle, String color) {
        this.priceOfVehicle = priceOfVehicle;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Название: " +
                this.name() +
                " , цвет = " + color +
                ", цена = " + priceOfVehicle +
                " грн.";
    }
}
