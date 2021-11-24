package HWFourAbsAndInterface.TaskAdditionalTwo;

public class ExpertDocumentWorker extends SoftwareForDocuments {

    @Override
    public void editDocument() {
        System.out.println("Документ отредактирован.");
    }

    @Override
    public void saveDocument() {
        System.out.println("Документ сохранен в новом формате.");
    }
}
