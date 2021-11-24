package HWFourAbsAndInterface.Task002;

public class DOCHandler extends AbstractHandler{
    @Override
    public void open() {
        System.out.println("Открыть документ.");
    }

    @Override
    public void create() {
        System.out.println("Создать документ.");
    }

    @Override
    public void change() {
        System.out.println("Изменить документ.");
    }

    @Override
    public void save() {
        System.out.println("Сохранить документ.");
    }
}
