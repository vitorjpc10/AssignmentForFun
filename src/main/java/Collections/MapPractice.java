package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPractice {

    public Object findValueOf(Map map, Object key) {
        return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {
        Map<String, String> currentMap = map;
        List<String> keys = new ArrayList<String>();

        for (Map.Entry<String, String> entry : currentMap.entrySet()) {
            // System.out.println(currentMap.entrySet());
            // System.out.println("entry is: " + entry);

            if (entry.getValue() == value) {
                keys.add(entry.getKey());
            }
        }

        // System.out.println("\n" + keys);

        Object[] output = new Object[keys.size()];

        for (int i = 0; i < keys.size(); i++) {
            output[i] = keys.get(i);
        }

        return output;
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int n1 = 0;
        int n2 = 1;
        int n3;

        for (int i = 0; i < size; i++) {

            if (i == 0) {
                map.put(i + 1, 1);
                // System.out.println("map is: " + map + " and i is: " + i);
            } else {
                map.put(i + 1, n1 + n2);

                // System.out.println("map is: " + map + " and i is: " + i);

                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            }

        }

        return map;
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        if (size == 0) {
            return map;
        } else if (size == 1) {
            map.put(1, first);
        } else if (size == 2) {
            map.put(1, first);
            map.put(2, second);
        } else {

            map.put(1, first);
            map.put(2, second);

            for (int i = 3; i < size + 1; i++) {

                map.put(i, map.get(i - 2) + map.get(i - 1));
            }

        }

        return map;
    }
}
