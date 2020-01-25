package kata.kyu6.numericalsOfAString;

import java.util.Map;
import java.util.HashMap;

public class JomoPipi {
    public static String numericals(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(ch[i])) {
                map.put(ch[i], map.get(ch[i]) + 1);
                sb.append(map.get(ch[i]));
            } else {
                map.put(ch[i], 1);
                sb.append(1);
            }
        }
        return sb.toString();
    }
}
