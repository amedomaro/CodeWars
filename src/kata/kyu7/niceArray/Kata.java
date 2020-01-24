package kata.kyu7.niceArray;

import java.util.*;

public class Kata{
    public static boolean isNice(Integer[] arr) {
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        if(list.size() == 0){
            return false;
        }
        for (Integer i : arr) {
            if (!list.contains(i + 1)) {
                if (!list.contains(i - 1)) {
                    return false;
                }
            }
        }
        return true;
    }
}
