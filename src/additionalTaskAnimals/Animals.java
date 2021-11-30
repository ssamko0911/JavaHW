package additionalTaskAnimals;

public abstract class Animals implements Runable{

    private String name;

    public Animals() {

    }

    public Animals(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("\nКласс верхнего уровня - Животные.");
    }
}
