package HWFourAbsAndInterface.TaskAdditionalTwo;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        System.out.println("Программа предоставляет доступ для работы с документами. " +
                "\nВведите номер ключа (при отсутствии укажите любое число): ");
        Scanner in = new Scanner(System.in);
        int enteredKey = in.nextInt();

        if (enteredKey == Keys.getKeyIdPro()) {
            SoftwareForDocuments proSoftware = new ProDocumentWorker();
            System.out.println("Вам доступна версия ПРО.");
        } else if (enteredKey == Keys.getKeyIdExpert()) {
            SoftwareForDocuments expertSoftware = new ProDocumentWorker();
            System.out.println("Вам доступна версия ПРО.");
        } else {
            SoftwareForDocuments basicSoftware = new DocumentWorker();
            System.out.println("Вам доступна базовая версия программы.");
        }
    }
}
