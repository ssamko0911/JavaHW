package HWThreeEnhAndOver.Task002;

public class GoodPupil extends Pupil {
    @Override
    public void study() {
        System.out.println("Хорошо учусь");
    }

    @Override
    public void read() {
        System.out.println("Хорошо читаю");
    }

    @Override
    public void write() {
        System.out.println("Хорошо пишу");
    }

    @Override
    public void relax() {
        System.out.println("Часто отдыхаю");
    }

}
