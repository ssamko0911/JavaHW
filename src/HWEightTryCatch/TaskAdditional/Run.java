package HWEightTryCatch.TaskAdditional;

import java.util.Scanner;

public class Run {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Программа - калькулятор. Проводит рассчёты: +, -, ,*, /.");
        System.out.println("Введите знак операции: ");
        String operationIdentifier = in.next();
        int digitOne = getDigit();
        int digitTwo = getDigit();

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

    public static int getDigit() {
        System.out.println("Введите число для операции: ");
        return in.nextInt();
    }
}


