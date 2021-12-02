package HWEightTryCatch.Task003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Run {

    public static void main(String[] args) throws IOException {

        Price[] prices = new Price[2];
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < prices.length; i++) {
            System.out.println("Введите название товара: ");
            String titleOfItem = in.readLine();
            System.out.println("Введите название магазина: ");
            String titleOfShop = in.readLine();
            System.out.println("Введите цену: ");
            double price = Double.parseDouble(in.readLine());
            prices[i] = new Price(titleOfItem, titleOfShop, price);
        }

        Arrays.sort(prices, new Comparator<>() {
            @Override
            public int compare(Price o1, Price o2) {
                return o1.titleOfShop.compareTo(o2.titleOfShop);
            }
        });

        for (Price somePrice : prices) {
            System.out.println(somePrice);
        }

        System.out.println("\nВведите название магазина: ");
        boolean isInList = false;
        String askedShop = in.readLine();
        for (Price price : prices) {
            if (askedShop.equals(price.titleOfShop)) {
                isInList = true;
                System.out.println(price);
            }
        }
        try {
            if (!isInList) throw new Exception();
        } catch (Exception exception) {
            System.err.println("Такого магазина нет в списке!");
        }
    }
}






