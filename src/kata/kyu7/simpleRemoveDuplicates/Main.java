package kata.kyu7.simpleRemoveDuplicates;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {3,4,4,3,6,3};
        Arrays.stream(Solution.solve(arr)).forEach(System.out::print);

        System.out.println("\n__________");

        int[] arr2 = {1,2,3,4};
        Arrays.stream(Solution.solve(arr2)).forEach(System.out::print);

    }
}
