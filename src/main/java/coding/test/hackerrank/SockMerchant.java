package coding.test.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class SockMerchant {

    // Complete the sockMerchant function below.
    //BEST SOLUTION
    static int sockMerchant(int n, int[] ar) {
        int[] r = new int[1001];
        for(int i = 0; i < n; i++) {
            r[ar[i]]++;
        }
        int pair = 0;
        for(int i = 0; i < r.length; i++) {
            pair += r[i]/2;
        }
        return pair;
    }
    //SECOND BEST SOLUTION
    static int sockMerchant2(int n, int[] ar) {
        Arrays.sort(ar);
        int pair = 0;
        int el = ar[0];
        int count = 1;
        for(int i = 1; i < n; i++) {
            if(ar[i] == el) {
                count++;
                if(i == n-1) {
                    pair += count/2;
                }
            } else {
                pair += count/2;
                el = ar[i];
                count = 1;
            }
        }
        return pair;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
