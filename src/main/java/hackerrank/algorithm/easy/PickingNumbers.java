package hackerrank.algorithm.easy;

import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class PickingNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    static int pickingNumbers(List<Integer> a) {
        Map<Integer, Integer> numberMap = new TreeMap<>();
        for (Integer i : a) {
            if (numberMap.containsKey(i)) {
                numberMap.put(i, numberMap.get(i) + 1);
            } else {
                numberMap.put(i, 1);
            }
        }
        int maxCnt = 0;
        for (int i : numberMap.keySet()) {
            int c = numberMap.get(i) + Optional.ofNullable(numberMap.get(i - 1)).orElse(0);
            if (maxCnt < c) {
                maxCnt = c;
            }
        }
        return maxCnt;
    }
}
