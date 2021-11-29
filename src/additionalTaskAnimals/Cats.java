package additionalTaskAnimals;

public class Cats extends Predators implements Meowable {

    private boolean isTail; // наличие хвоста;

    public boolean isTail() {
        return isTail;
    }

    @Override
    public void printInfo() {
        System.out.println("\nВид кошачьи.");
    }

    @Override
    public void climbe() {
        System.out.println("\nКощки могут лазить по всем деревьям.");
    }
}
