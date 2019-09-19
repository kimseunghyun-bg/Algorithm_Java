package hackerrank.algorithm.easy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        char[] path = s.toCharArray();
        int pos = 0;
        int valley = 0;
        for (char c : path) {
            if (c=='D') {
                pos -= 1;
            } else {
                pos += 1;
                if (pos == 0) {
                    valley += 1;
                }
            }
        }
        return valley;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

