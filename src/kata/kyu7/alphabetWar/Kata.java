package kata.kyu7.alphabetWar;

import java.util.HashMap;
import java.util.Map;

public class Kata {

    private static Map<Character, Integer> leftMap = new HashMap();
    private static Map<Character, Integer> rightMap = new HashMap();

    static {
        leftMap.put('w', 4);
        leftMap.put('p', 3);
        leftMap.put('b', 2);
        leftMap.put('s', 1);
        rightMap.put('m', 4);
        rightMap.put('q', 3);
        rightMap.put('d', 2);
        rightMap.put('z', 1);
    }

    public static String alphabetWar(String fight) {
        int left = 0, right = 0;

        for (char ch : fight.toCharArray()) {
            if (leftMap.containsKey(ch)) {
                left += leftMap.get(ch);
            }
            if (rightMap.containsKey(ch)) {
                right += rightMap.get(ch);
            }
        }

        return (left == right) ? "Let's fight again!" : (left < right) ? "Right side wins!" : "Left side wins!";
    }
}