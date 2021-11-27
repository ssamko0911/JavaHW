package HWSixStaticAndNested.TaskAdditional;

import java.util.Scanner;

public class Run {
    public static Scanner in = new Scanner(System.in);
    public static String[] operationsArray = {"+", "-", "*", "/", "%"};

    public static void main(String[] args) {
        System.out.println("Программа - калькулятор. Проводит рассчёты: +, -, ,*, /, а также - % (остаток от деления).");
        System.out.println("Введите знак операции: ");
        String operationIdentifier = in.next();
        operationIdentifier = rechooseIdentifier();
        double digitOne = getDigit();
        double digitTwo = getDigit();

        switch (operationIdentifier) {
            case ("+"): {
                Calculator.sumDigits(digitOne, digitTwo);
                break;
            }
            case ("-"): {
                Calculator.differenceDigits(digitOne, digitTwo);
                break;
            }
            case ("*"): {
                Calculator.multiplyDigits(digitOne, digitTwo);
                break;
            }
            case ("/"): {
                Calculator.divisionDigits(digitOne, digitTwo);
                break;
            }
            default: {
                System.out.println("Приносим извинения за некорректную работу.");
            }
        }
    }

    public static double getDigit() {
        System.out.println("Введите число для операции: ");
        return in.nextDouble();
    }

    public static String rechooseIdentifier() {
        while (true) {
            System.out.println("Вы указани неверный оператор. Повторите попытку: ");
            String operationIdentifier = in.next();
            for (String stringToCheck : operationsArray) {
                if (stringToCheck.equals(operationIdentifier)) {
                    return operationIdentifier;
                }
            }
        }
    }
}


