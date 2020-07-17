package kata.kyu7.simpleRemoveDuplicates;

import java.util.*;

public class Solution {

    public static int[] solve(int[] arr) {

        //return Arrays.stream(arr).distinct().toArray();

        List<Integer> list = new LinkedList<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (!(list.contains(arr[i]))) {
                list.add(0, arr[i]);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
