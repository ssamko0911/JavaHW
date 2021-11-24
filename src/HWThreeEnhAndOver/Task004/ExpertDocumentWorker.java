package HWThreeEnhAndOver.Task004;

public class ExpertDocumentWorker extends ProDocumentWorker {

    @Override
    public void editDocument() {
        super.editDocument();
    }

    @Override
    public void saveDocument() {
        System.out.println("Документ сохранен в новом формате.");
    }
}
