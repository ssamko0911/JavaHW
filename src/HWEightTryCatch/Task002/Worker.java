package HWEightTryCatch.Task002;

import java.util.Comparator;

public class Worker {
    private String lastFirstName;
    private String jobTitle;
    private int yearOfStartWorking;

    public Worker(String lastFirstName, String jobTitle, int yearOfStartWorking) {
        this.lastFirstName = lastFirstName;
        this.jobTitle = jobTitle;
        this.yearOfStartWorking = yearOfStartWorking;
    }

    public String getLastFirstName() {
        return lastFirstName;
    }

    public void setLastFirstName(String lastFirstName) {
        this.lastFirstName = lastFirstName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getYearOfStartWorking() {
        return yearOfStartWorking;
    }

    public void setYearOfStartWorking(int yearOfStartWorking) {
        this.yearOfStartWorking = yearOfStartWorking;
    }

    @Override
    public String toString() {
        return "\nДанные по сотруднику: 1) ФИО: " + this.lastFirstName + "; 2) Должность: " + this.jobTitle
                + "; 3) Год приёма на работу: " + this.yearOfStartWorking + " г.";
    }
}

