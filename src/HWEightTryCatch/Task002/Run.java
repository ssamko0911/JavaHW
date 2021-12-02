package HWEightTryCatch.Task002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Run {

    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Worker[] workers = new Worker[5];

        for (int i = 0; i < workers.length; i++) {
            System.out.println("Введите ФИО: ");
            String lastFirstName = in.readLine();
            System.out.println("Введите должность: ");
            String jobTitle = in.readLine();
            System.out.println("Введите год поступления на работу: ");
            int yearOfStartWorking = Integer.parseInt(in.readLine());
            try {
                if (yearOfStartWorking < 2010) throw new Exception(); // допустим, 2010 год - год основания предприятия.
            } catch (Exception e) {
                System.err.println("Указанный год не возможен. Предприятией функционирует с 2010 года.");
                yearOfStartWorking = 2010;
            }
            workers[i] = new Worker(lastFirstName, jobTitle, yearOfStartWorking);
        }

        Arrays.sort(workers, new Comparator<>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                return o1.getLastFirstName().compareTo(o2.getLastFirstName());
            }
        });

        for (Worker worker : workers) {
            System.out.println(worker.toString());
        }

        final int CURRENT_YEAR = 2021;
        System.out.println("\nВведите стаж: ");
        int receivedNumberOfYear = Integer.parseInt(in.readLine());
        for (Worker worker : workers) {
            int workingPeriod = CURRENT_YEAR - worker.getYearOfStartWorking();
            if (workingPeriod > receivedNumberOfYear) {
                System.out.println(worker.getLastFirstName());
            }
        }
    }
}
