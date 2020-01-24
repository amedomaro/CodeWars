package kata.kyu6.highestScoringWord;

public class Kata {

    public static String high(String s) {
        String[] array = s.split(" ");
        String word = array[0];
        int num = 0, sum = 0;

        for (String str : array) {
            for (Character ch : str.toCharArray()) {
                sum += ch - 96;
            }
            if (sum > num) {
                num = sum;
                word = str;
            }
            sum = 0;
        }
        return word;
    }
}
