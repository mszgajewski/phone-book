import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] countOccurrences(int[] first, int[] second) {

        int[] counts = new int[first.length];
        Arrays.fill(counts, 0);

        for (int i = 0; i < first.length; ++i) {
            for (int j = 0; j < second.length; ++j) {
                if (first[i] == second[j]) {
                    ++counts[i];
                }
            }
        }

        return counts;
    }


    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int[] first = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        final int[] second = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        final String result = Arrays.toString(countOccurrences(first, second))
                .replace(", ", " ")
                .replace("[", "")
                .replace("]", "");
        System.out.println(result);
    }
}