package HWFiveArrayList.Task004;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        // заполнение целыми числами;
        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * (100 - 10) + 10));
        }
        System.out.println("Значения списка: ");
        // вывод для фиксации значений чисел;
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + "\t");
        }
        // итератор;
        ListIterator<Integer> listIterator = numbers.listIterator();
        System.out.println("\nПроверка новых значений: ");
        while (listIterator.hasNext()) {
            Integer integer = listIterator.next();
            listIterator.set(integer++);
            System.out.print(integer + "\t");
        }
    }
}
