package HWThreeEnhAndOver.TaskAdditional;

public class PrintRed extends Printer {

    @Override
    void print(String value) {
        super.print("\u001B[31m" + value + "\u001B[0m");
    }
}
