package HWFourAbsAndInterface.TaskAdditionalTwo;

public abstract class SoftwareForDocuments {
    public void openDocument(){
        System.out.println("Документ открыт.");
    }

    public abstract void editDocument();

    public abstract void saveDocument();
}
