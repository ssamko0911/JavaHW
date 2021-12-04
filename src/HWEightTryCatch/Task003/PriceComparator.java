package HWEightTryCatch.Task003;

import java.util.Comparator;

public class PriceComparator implements Comparator<Price> {
    @Override
    public int compare(Price o1, Price o2) {
        return o1.titleOfShop.compareTo(o2.titleOfShop);
    }
}
