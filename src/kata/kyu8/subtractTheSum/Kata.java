package kata.kyu8.subtractTheSum;

public class Kata {

    private static final String[] fruits = {"kiwi", "pear", "kiwi", "banana", "melon", "banana", "melon", "pineapple",
            "apple", "pineapple", "cucumber", "pineapple", "cucumber", "orange", "grape", "orange", "grape", "apple",
            "grape", "cherry", "pear", "cherry", "pear", "kiwi", "banana", "kiwi", "apple", "melon", "banana", "melon",
            "pineapple", "melon", "pineapple", "cucumber", "orange", "apple", "orange", "grape", "orange", "grape",
            "cherry", "pear", "cherry", "pear", "apple", "pear", "kiwi", "banana", "kiwi", "banana", "melon",
            "pineapple", "melon", "apple", "cucumber", "pineapple", "cucumber", "orange", "cucumber", "orange", "grape",
            "cherry", "apple", "cherry", "pear", "cherry", "pear", "kiwi", "pear", "kiwi", "banana", "apple", "banana",
            "melon", "pineapple", "melon", "pineapple", "cucumber", "pineapple", "cucumber", "apple", "grape", "orange",
            "grape", "cherry", "grape", "cherry", "pear", "cherry", "apple", "kiwi", "banana", "kiwi", "banana",
            "melon", "banana", "melon", "pineapple", "apple", "pineapple"};

    private static String getFruit(int n) {
        return fruits[n - 1];
    }

    private static int sumNum(int n) {
        int sum = 0, firstNum = n;

        while (n * 0.1 != 0) {
            sum += (n % 10);
            n = (int) (n * 0.1);
        }
        return firstNum - sum;
    }

    public static String subtractSum(int n) {

        do {
            n = Kata.sumNum(n);
        } while (!(n > 0 && n <= 100));

        return Kata.getFruit(n);
    }
}
