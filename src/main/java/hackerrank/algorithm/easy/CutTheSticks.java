package hackerrank.algorithm.easy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class CutTheSticks {

    // Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr) {
        List<Integer> sticksCuts = new ArrayList<>();
        Map<Integer, Integer> inputMap = new TreeMap<>(Comparator.naturalOrder());
        Arrays.stream(arr).forEach(i -> inputMap.put(i, 1+Optional.ofNullable(inputMap.get(i)).orElse(0)));

        int len = arr.length;
        for (Integer i : inputMap.keySet()) {
            sticksCuts.add(len);
            len -= inputMap.get(i);
        }

        return sticksCuts.stream().mapToInt(i -> i).toArray();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = cutTheSticks(arr);

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
