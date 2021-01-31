package kata.kyu8.larioAndMuigiPipeProblem;

public class Kata {
    public static int[] pipeFix(int[] numbers) {
        int [] result = new int[(numbers[numbers.length-1] - numbers[0]) + 1];
        for (int i = 0, j = numbers[0]; i < result.length; i++, j++){
            result[i] = j;
        }
        return result;
    }
}
