package additionalTaskAnimals;

public interface Meowable {
    default void meow() {
        System.out.println("\nВсе кошки могут мяукать.");
    }
}
