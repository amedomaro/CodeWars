package kata.kyu8.quiteEasySolutions;

public class Kata {
    public static String position(char alphabet) {
        int result = alphabet - 96;
        return String.format("Position of alphabet: %d", result);
    }
}
