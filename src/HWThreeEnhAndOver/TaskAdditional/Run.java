package HWThreeEnhAndOver.TaskAdditional;

public class Run {

    public static void main(String[] args) {

        System.out.println("В программе реализовано несколько классов-наследников с разноцветными выводами.\n");

        Printer green = new PrintGreen();
        green.print("У этого наследника данна строка выводится на печать зелёным!");

        Printer red = new PrintRed();
        red.print("У вот этого наследника данная строка выводится на печать красным!");

        Printer printer = new Printer();
        printer.print("Строка печати родителя с базовым цветом.");
    }

}
