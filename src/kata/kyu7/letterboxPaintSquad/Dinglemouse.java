package kata.kyu7.letterboxPaintSquad;

public class Dinglemouse {

    public static int[] paintLetterboxes(final int start, final int end) {
        int[] result = new int[10];

        for(int i = start; i <= end; i++){
            int num = i;

            while (num > 0){
                result[num % 10] += 1;
                num /= 10;
            }
        }
        return result;
    }
}