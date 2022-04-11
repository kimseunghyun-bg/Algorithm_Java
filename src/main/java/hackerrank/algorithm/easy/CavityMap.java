package hackerrank.algorithm.easy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CavityMap {

    /*
     * Complete the 'cavityMap' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static List<String> cavityMap(List<String> grid) {
        // Write your code here
        List<String> result = new ArrayList<>();
        for (int i = 0; i < grid.size(); i++) {
            char[] temp = grid.get(i).toCharArray();
            if (i > 0 && i < grid.size() - 1) {
                for (int j = 1; j < grid.get(i).length() - 1; j++) {
                    int target = Integer.parseInt(String.valueOf(grid.get(i).charAt(j)));
                    int upper = Integer.parseInt(String.valueOf(grid.get(i - 1).charAt(j)));
                    int right = Integer.parseInt(String.valueOf(grid.get(i).charAt(j + 1)));
                    int left = Integer.parseInt(String.valueOf(grid.get(i).charAt(j - 1)));
                    int under = Integer.parseInt(String.valueOf(grid.get(i + 1).charAt(j)));

                    if (target > upper && target > right && target > left && target > under) {
                        temp[j] = 'X';
                    }
                }
            }
            result.add(String.valueOf(temp));
        }
        return result;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> grid = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<String> result = cavityMap(grid);

        bufferedWriter.write(
                result.stream()
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}


