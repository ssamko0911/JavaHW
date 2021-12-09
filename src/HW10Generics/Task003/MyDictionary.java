package HW10Generics.Task003;

import java.util.HashMap;
import java.util.Map;

public class MyDictionary<TKey, TValue> {

    Map<TKey, TValue> map = new HashMap<>();

    public void addPairs(TKey key, TValue value) {
        map.put(key, value);
    }

    public TValue getIndex(TKey key) {
        return map.get(key);
    }

    public int getSize() {
        return map.size();
    }

    public static void main(String[] args) {
        System.out.println("Программа-переводчик.");
        MyDictionary<String, Translation> listOfMonitors = new MyDictionary<>();
        listOfMonitors.addPairs("Diamond", new Translation("[ˈdaɪəmənd]", "бриллиант"));
        listOfMonitors.addPairs("Tiny", new Translation("[ˈtaɪni]", "крошечный"));
        listOfMonitors.addPairs("Item", new Translation("[ˈaɪtəm]", "штука"));

        System.out.printf("\nКоличество пар значений (слово - перевод) в словаре: %d.", listOfMonitors.getSize());
        System.out.printf("\nСлово для перевода: %s - %s", "Money", listOfMonitors.getIndex("Money")); // проверка;
        System.out.printf("\nСлово для перевода: %s - %s", "Tiny", listOfMonitors.getIndex("Tiny"));
    }
}
