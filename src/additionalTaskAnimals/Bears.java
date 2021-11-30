package additionalTaskAnimals;

public class Bears extends Predators implements TreeClimebeable {

    @Override
    public void climbe() {
        System.out.println("\nМедведи могут лазить только по толстым деревьям.");
    }
}
