package hackerrank.algorithm.easy;


import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class HappyLadybugs {

    /*
     * Complete the 'happyLadybugs' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING b as parameter.
     */

    public static String happyLadybugs(String b) {
        // Write your code here
        boolean result = true;
        boolean hasSpace = false;
        boolean needChange = false;
        Map<String, Integer> bugsSummary = new HashMap<>();
        char[] chars = b.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!hasSpace && chars[i] == '_') {
                hasSpace = true;
            }

            if (!needChange) {
                needChange = !(equalsBefore(chars, i) || equalsAfter(chars, i));
            }

            // count each bugs
            String bug = String.valueOf(chars[i]);
            bugsSummary.merge(bug, 1, (k, v) -> bugsSummary.get(bug) + 1);
        }

        if (needChange) {
            if (!hasSpace) {
                result = false;
            } else {
                // find solo bug
                for (String k : bugsSummary.keySet()) {
                    if (!k.equals("_") && bugsSummary.get(k) == 1) {
                        result = false;
                    }
                }
            }
        }

        return result ? "YES" : "NO";
    }

    public static boolean equalsBefore(char[] target, int index) {
        return index > 0 && target[index - 1] == target[index];
    }

    public static boolean equalsAfter(char[] target, int index) {
        return index < target.length - 1 && target[index] == target[index + 1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, g).forEach(gItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                String b = bufferedReader.readLine();

                String result = happyLadybugs(b);

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
