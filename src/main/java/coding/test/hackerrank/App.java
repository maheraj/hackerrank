package coding.test.hackerrank;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String[] arr = {"31415926535897932384626433832795", "1", "3", "10", "3", "5"};
        arr = bigSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Complete the bigSorting function below.
    static String[] bigSorting(String[] unsorted) {
        Arrays.sort(unsorted, (o1, o2) -> {
            if (o1.length() != o2.length()) {
                return o1.length() - o2.length();
            } else {
                return o1.compareTo(o2);
            }
        });

        return unsorted;

    }
}
