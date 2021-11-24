package HWFiveArrayList.Task003;

import java.util.ArrayList;

public class ZooRemove {
    public static void main(String[] args) {
        int limitOfAnimals = 8;
        ArrayList<String> zooList = new ArrayList<>();

        for (int i = 0; i < limitOfAnimals; i++) {
            zooList.add(i, "Зверь " + (i + 1));
        }

        zooList.remove("Зверь 3");
        zooList.remove("Зверь 5");
        zooList.remove("Зверь 7");
        System.out.printf("\nРазмер списка: %d.", zooList.size());
    }
}
