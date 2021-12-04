package HWSixStaticAndNested.Task003;

public class Main {

    public static void main(String[] args) {
        System.out.print("Программа конвертирует метры в километры и километры в мили.");
        Distance.Converter distanceOne = new Distance.Converter();
        distanceOne.convertToKilometers(100);
        Distance.Converter distanceTwo = new Distance.Converter();
        distanceTwo.convertToMiles(700);
    }
}
