package kata.kyu6.findTheOddInt;

import java.util.HashMap;
import java.util.Map;

public class FindOdd {
    public static int findIt(int[] a) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : a)
            if (map.containsKey(i))
                map.put(i ,map.get(i) + 1);
            else map.put(i, 1);
        for (Map.Entry<Integer,Integer> pair : map.entrySet()) {
            if (pair.getValue() % 2 != 0)
                return pair.getKey();
        }
        return 0;
    }
}
