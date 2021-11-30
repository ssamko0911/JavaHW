package additionalTaskAnimals;

public class Run {
    public static void main(String[] args) {

        System.out.println("Проверки реализации: ");

        Animals animalOne = new Mammals();
        animalOne.printInfo();
        animalOne.run();
        //animalOne.swim();
        System.out.println("_".repeat(50));

        Mammals animalTwo = new Mammals();
        animalTwo.printInfo();
        animalTwo.run();
        animalTwo.swim();
        System.out.println("_".repeat(50));

        Cats animalThree = new Cats();
        animalThree.printInfo();
        animalThree.run();
        animalThree.meow();
        animalThree.climbe();
        System.out.println("_".repeat(50));

        Mammals animalFour = new Predators();
        animalFour.printInfo();
        animalFour.swim();
        //animalFour.climbe();
        System.out.println("_".repeat(50));

        Bears animalFive = new Bears();
        animalFive.printInfo();
        animalFive.run();
        animalFive.climbe();
        System.out.println("_".repeat(50));

        Dogs animalSix = new Dogs();
        animalSix.printInfo();
        animalSix.run();
        animalSix.climbe();
        System.out.println("_".repeat(50));
    }
}
