package hackerrank.algorithm.easy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendAndDelete {

    // Complete the appendAndDelete function below.
    static String appendAndDelete(String s, String t, int k) {
        int sameStringLength = getSameStringLength(s, t);
        int sourceDiff = s.length() - sameStringLength;
        int targetDiff = t.length() - sameStringLength;

        if (k - sourceDiff - targetDiff >= 0 && (k - s.length() - t.length() >= 0 || (k - sourceDiff - targetDiff) % 2 == 0)) {
            return "Yes";
        } else {
            return "No";
        }
    }

    static int getSameStringLength(String source, String target) {
        char[] sourceArray = source.toCharArray();
        char[] targetArray = target.toCharArray();
        int result = 0;
        for (int i = 0; i < sourceArray.length && i < targetArray.length; i++) {
            if (sourceArray[i] == targetArray[i]) {
                result = i + 1;
            } else {
                break;
            }
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String t = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
