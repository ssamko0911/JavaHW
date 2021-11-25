package HWFourAbsAndInterface.Task003;

public class Player implements Playable, Recordable {
    @Override
    public void play() {
        System.out.println("Воспроизвести.");
    }

    @Override
    public void pause() {
        System.out.println("Пауза.");
    }

    @Override
    public void stop() {
        System.out.println("Стоп.");
    }

    @Override
    public void record() {
        System.out.println("Запись.");
    }
}
