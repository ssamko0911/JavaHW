package HW10Generics.Task003;

public class Translation {

    public String value;
    public String translation;

    public Translation(String value, String translation) {
        this.value = value;
        this.translation = translation;
    }

    @Override
    public String toString() {
        return "транскрипция слова: " + value + ", перевод - " + translation + ".";
    }
}
