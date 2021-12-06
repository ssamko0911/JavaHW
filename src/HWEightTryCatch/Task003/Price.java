package HWEightTryCatch.Task003;

import java.util.Comparator;

public class Price implements Comparator<Price> {
    public String titleOfItem;
    public String titleOfShop;
    public double price;

    public Price(String titleOfItem, String titleOfShop, double price) {
        this.titleOfItem = titleOfItem;
        this.titleOfShop = titleOfShop;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Асортимент магазина " + titleOfShop + ": товар - " + titleOfItem + ", цена - " + price + " грн.";
    }

    @Override
    public int compare(Price o1, Price o2) {
        return o1.titleOfShop.compareTo(o2.titleOfShop);
    }
}
