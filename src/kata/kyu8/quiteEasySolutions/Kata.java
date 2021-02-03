package kata.kyu8.quiteEasySolutions;

public class Kata {
    public static double[] averages(int[] numbers) {
        if (numbers == null || numbers.length <= 1) {
            return new double[0];
        }
        double[] result = new double[numbers.length - 1];

        for (int i = 1; i < numbers.length; i++) {
            result[i - 1] = (numbers[i - 1] + numbers[i]) / 2.0;
        }

        return result;
    }
}
