package hackerrank.algorithm.recursion.medium;

import java.io.*;

public class RecursiveDigitSum {
    /*
     * Complete the 'superDigit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING n
     *  2. INTEGER k
     */

    public static int superDigit(String n, int k) {
        // Write your code here
//        n.chars().forEach(System.out::println);
        if (n.length() == 1) {
            return Integer.parseInt(n);
        }

        n = String.valueOf(n.chars().mapToObj(c -> Long.parseLong(String.valueOf(Character.toChars(c)))).reduce(0L, Long::sum) * k);
        k = 1;
        return superDigit(n, k);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        String n = firstMultipleInput[0];

        int k = Integer.parseInt(firstMultipleInput[1]);

        int result = superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
