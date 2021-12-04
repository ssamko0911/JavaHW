package HWSixStaticAndNested.Task003;

public class Distance {

    double distance;

    public void print() {
        // что должен делать этот метод, если должен?
    }

    public static class Converter {
        public void convertToKilometers(double someDistanceInMeters) {
            System.out.printf("\nДистанция в километрах составляет - %.2f км.", someDistanceInMeters * 0.001);
        }

        public void convertToMiles(double someDistanceInKm) {
            System.out.printf("\nДистанция в милях составляет - %.2f миль.", someDistanceInKm / 1.62137);
        }
    }
}
