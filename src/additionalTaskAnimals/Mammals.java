package additionalTaskAnimals;

public class Mammals extends Animals implements Swimable{

    private String typeOfArea; // водные или воздушные;

    public Mammals() {
        System.out.printf("\nCоздан объект класса %s.", this.getClass());
    }

    public String getTypeOfArea() {
        return typeOfArea;
    }

    @Override
    public void printInfo() {
        System.out.println("\nКласс млекопитающие наследует Животных.");
    }
}
