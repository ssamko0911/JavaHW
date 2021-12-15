package HW10Generics.Task002;

import java.util.ArrayList;
import java.util.List;

public class MyList<T> {

    List<T> myList = new ArrayList<>();

    public void addElement(T data) {
        myList.add(data);
    }

    public int getIndex(T data) {
        return myList.indexOf(data);
    }

    public int getSize() {
        return myList.size();
    }

    public static void main(String[] args) {
        MyList<Integer> listOne = new MyList<>();

        listOne.addElement(10);
        listOne.addElement(100);
        listOne.addElement(1000);
        System.out.printf("\nУ элемента \"100\" индекс - %d.", listOne.getIndex(100));
        System.out.printf("\nКоличество элементов списка - %d.", listOne.getSize());
    }
}

