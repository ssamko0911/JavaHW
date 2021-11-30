package additionalTaskAnimals;

public interface Swimable {
    default void swim() {
        System.out.println("\nВсе млекопитающие умеют плавать.");
    }
}
