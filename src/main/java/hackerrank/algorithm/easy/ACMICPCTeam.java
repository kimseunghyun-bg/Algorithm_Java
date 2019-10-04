package hackerrank.algorithm.easy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ACMICPCTeam {

    // Complete the acmTeam function below.
    static int[] acmTeam(String[] topic) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < topic.length; i++) {
            for (int j = i + 1; j < topic.length; j++) {
                int topicCount = 0;
                for (int k = 0; k < topic[i].length(); k = k + 63) {
                    int endIdx = topic[i].length() - k <= 63 ? topic[i].length() : k + 63;
                    topicCount += Long.bitCount(Long.parseLong(topic[i].substring(k, endIdx), 2) | Long.parseLong(topic[j].substring(k, endIdx), 2));
                }
                if (topicCount == max) {
                    count++;
                } else if (topicCount > max) {
                    max = topicCount;
                    count = 1;
                }
            }
        }
        return new int[]{max, count};
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        String[] topic = new String[n];

        for (int i = 0; i < n; i++) {
            String topicItem = scanner.nextLine();
            topic[i] = topicItem;
        }

        int[] result = acmTeam(topic);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
