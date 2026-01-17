package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    static void main() {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(101, "Alice");
        map.put(102, "Bob");
        map.put(101, "Charlie");
        map.put(null, "ABC");
        map.put(null, "CBA");

        System.out.println(map.get(101));
        System.out.println(map.get(null));

        Iterator iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) iterator.next();
            System.out.println("Key : " + entry.getKey() + " , Value : " + entry.getValue());
        }
    }
}
