package kata.kyu7.maxDiff;

import java.util.Arrays;

public class Kata {
    public static int maxDiff(int[] lst) {
        return lst.length == 0 ? 0 : Arrays.stream(lst).max().getAsInt() - Arrays.stream(lst).min().getAsInt();
    }
}