package HWFourAbsAndInterface.Task002;

public class Run {

    public static void main(String[] args) {
       AbstractHandler xmlHandler = new XMLHandler();
       xmlHandler.change();
       AbstractHandler txtHandler = new TXTHandler();
       txtHandler.create();
       DOCHandler docHandler = new DOCHandler();
       docHandler.open();
    }
}
