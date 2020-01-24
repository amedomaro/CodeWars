package kata.kyu7.strongNumber;

public class StrongNumber {
    public static String isStrongNumber(int num) {
        int digit, result = 0, value = num;

        while(num > 0){
            digit = num % 10;
            result += factorial(digit);
            num = (int) (num * 0.1);
        }

        return (value == result) ? "STRONG!!!!" : "Not Strong !!";
    }

    private static int factorial(int num){
        return (num > 0) ? num * factorial(num - 1) : 1 ;
    }
}
