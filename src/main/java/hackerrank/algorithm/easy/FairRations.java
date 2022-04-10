package hackerrank.algorithm.easy;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class FairRations {

    /*
     * Complete the 'fairRations' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY B as parameter.
     */

    public static String fairRations(List<Integer> b) {
        // Write your code here
        int result = 0;
        for (int i = 0; i < b.size() - 1; i++) {
            if (b.get(i) % 2 != 0) {
                b.set(i, b.get(i) + 1);
                b.set(i + 1, b.get(i + 1) + 1);
                result += 2;
            }
        }
        if (b.get(b.size() - 1) % 2 != 0) {
            return "NO";
        } else {
            return String.valueOf(result);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> B = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        String result = fairRations(B);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

