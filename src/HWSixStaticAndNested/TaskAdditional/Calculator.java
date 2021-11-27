package HWSixStaticAndNested.TaskAdditional;

public class Calculator {

    public static void sumDigits(double operandOne, double operandTwo) {
        System.out.printf("Сумма чисел равна: %.2f", operandOne + operandTwo);
    }

    public static void differenceDigits(double operandOne, double operandTwo) {
        System.out.printf("Разница чисел равна: %.2f", operandOne - operandTwo);
    }

    public static void multiplyDigits(double operandOne, double operandTwo) {
        System.out.printf("Произведение чисел равно: %.2f", operandOne * operandTwo);
    }

    public static void divisionDigits(double operandOne, double operandTwo) {
        System.out.printf("Результат деления чисел равен: %s",
                operandTwo == 0 ? "отмена, делить на нуль нельзя." : operandOne / operandTwo);
    }
}
