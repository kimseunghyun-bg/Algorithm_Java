package hackerrank.algorithm.easy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.IntStream;


public class MinimumDistances {

    // Complete the minimumDistances function below.
    static int minimumDistances(int[] a) {
        Map<Integer, List<Integer>> indexMap = createIndexMap(a);
        int minimum = -1;
        for (Integer key : indexMap.keySet()) {
            List<Integer> list = indexMap.get(key);
            if (minimum != 1) {
                int val = getMinimumDistancesInList(list);
                if (minimum == -1 || (val != -1 && minimum > val)) {
                    minimum = val;
                }
            }
        }
        return minimum;
    }

    static Map<Integer, List<Integer>> createIndexMap(int[] array) {
        Map<Integer, List<Integer>> indexMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
//            if (indexMap.get(array[i]) == null) {
//                indexMap.put(array[i], new ArrayList<Integer>());
//            }
            indexMap.computeIfAbsent(array[i], k -> new ArrayList<>()).add(i);
//            indexMap.get(array[i]).add(i);
        }
        return indexMap;
    }

    static int getMinimumDistancesInList(List<Integer> list) {
//        int minimum = -1;
//        for (int i = list.size() - 1; i > 0; i--) {
//            int difference = list.get(i) - list.get(i - 1);
//            if (minimum == -1 || difference < minimum) {
//                minimum = difference;
//            }
//        }
//        return minimum;
        return IntStream.range(0, list.size() - 1)
                .map(i -> list.get(i + 1) - list.get(i))
                .min().orElse(-1);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = minimumDistances(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
