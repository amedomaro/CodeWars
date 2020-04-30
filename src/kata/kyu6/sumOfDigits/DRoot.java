package kata.kyu6.sumOfDigits;

public class DRoot {

    public static int digital_root(int n) {
        int sum = 0;

        while (n * 0.1 != 0) {
            sum += (n % 10);
            n = (int) (n * 0.1);
        }

        if ((int)(sum * 0.1) != 0) {
            return digital_root(sum);
        }
        return sum;
    }
}
