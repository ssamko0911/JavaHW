package HWFiveArrayList.Task002;

import java.util.ArrayList;

public class Zoo {

    public static void main(String[] args) {
        int limitOfAnimals = 8;
        ArrayList<String> zooList = new ArrayList<>();
        for (int i = 0; i < limitOfAnimals; i++) {
            zooList.add(i, "Зверь " + (i + 1));
        }
        System.out.println("Список животных: ");

        for (int i = 0; i < zooList.size(); i++) {
            System.out.println(zooList.get(i));
        }
    }
}


