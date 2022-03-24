package hackerrank.algorithm.medium;

import java.io.*;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class LarrysArray {

    /*
     * Complete the 'larrysArray' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY A as parameter.
     */

    public static String larrysArray(List<Integer> a) {

        for (int i = 0; i < a.size() - 1; i++) {
            for (int j = 0; j < a.size() - i - 2; j++) {
                arrange(a, j);
            }
        }
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) != i + 1) {
                return "NO";
            }
        }
        return "YES";
    }

    public static void arrange(List<Integer> a, int index) {
        int first = a.get(index);
        int second = a.get(index + 1);
        int third = a.get(index + 2);

        if (second < first && third < first) {
            a.set(index, second);
            a.set(index + 1, third);
            a.set(index + 2, first);
        } else if (first < second && third < second) {
            a.set(index, third);
            a.set(index + 1, first);
            a.set(index + 2, second);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> A = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                String result = larrysArray(A);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
