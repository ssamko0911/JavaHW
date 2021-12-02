package HWEightTryCatch.Task003;

public class Price {
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
}
