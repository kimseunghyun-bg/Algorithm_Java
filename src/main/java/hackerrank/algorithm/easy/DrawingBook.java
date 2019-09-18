package hackerrank.algorithm.easy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DrawingBook {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        n = n % 2 == 0 ? n : n - 1;
        p = p % 2 == 0 ? p : p - 1;
        return n-p < p ? (n-p)/2 : p/2;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

