package kata.kyu8.quiteEasySolutions;

import java.util.*;

public class Kata {

    public static int findLongest(final String str) {
        String[] spl = str.split(" ");
        int longest = 0;
        for (String s : spl) {
            if (s.length() > longest) {
                longest = s.length();
            }
        }
        return longest;
    }
}
