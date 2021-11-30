package additionalTaskAnimals;

public class Predators extends Mammals implements TreeClimebeable {

    private double weight; // вес хищника;

    public double getWeight() {
        return weight;
    }

    @Override
    public void printInfo() {
        System.out.println("\nКласс жищников наследует млекопитающих.");
    }

    public void climbe() {
        System.out.println("\nВсе хищники могут лазить по деревьям.");
    }
}
