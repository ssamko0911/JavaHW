package additionalTaskAnimals;

public interface Runable {
    default void run() {
        System.out.println("\nВсе животные могут бегать. Значит - все наследники (Млекопитающие, Хищники, Коты, Медведи, Псы) тоже.");
    }
}
