package HWThreeEnhAndOver.Task002;

public class BadPupil extends Pupil {

    @Override
    public void study() {
        System.out.println("Плохо учусь");
    }

    @Override
    public void read() {
        System.out.println("Плохо читаю");
    }

    @Override
    public void write() {
        System.out.println("Плохо пишу");
    }

    @Override
    public void relax() {
        System.out.println("Постоянно отдыхаю");
    }
}
