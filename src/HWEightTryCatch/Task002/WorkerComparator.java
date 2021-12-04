package HWEightTryCatch.Task002;

import java.util.Comparator;

public class WorkerComparator implements Comparator<Worker> {
    @Override
    public int compare(Worker o1, Worker o2) {
        return o1.getLastFirstName().compareTo(o2.getLastFirstName());
    }
}
