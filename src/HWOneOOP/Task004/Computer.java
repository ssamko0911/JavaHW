package HWOneOOP.Task004;

public class Computer {// Создать класс Computer

    int biosSerialNumber;

    public Computer(int biosSerialNumber) {
        this.biosSerialNumber = biosSerialNumber;
    }

    public static void main(String[] args) {
        Computer[] computers = new Computer[5];
        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer((i + 1) * (int) (Math.random() * (1000000 - 100000) + 100000));
            System.out.printf("Серийный номер ПК: %d.\n", computers[i].biosSerialNumber);
        }

    }
}