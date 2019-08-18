package hackerrank.algorithm.easy;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class BetweenTwoSets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        return getCount(getLCM(a), b);
    }

    public static int getGCM(int a, int b) {
        while (a != 0) {
            if (a < b) {
                int temp = b;
                b = a;
                a = temp;
            }
            a = a - b;
        }
        return b;
    }

    public static int getLCM(int x1, int x2) {
        int gcm = getGCM(x1, x2);
        return gcm * x1 / gcm * x2 / gcm;
    }

    public static int getLCM(List<Integer> values) {
        int lcm = values.get(0);
        for (int i = 0; i < values.size() - 1; i++) {
            if (lcm < 0){
                return lcm;
            }
            lcm = getLCM(lcm, values.get(i + 1));
        }
        return lcm;
    }

    public static int getCount(int lcm, List<Integer> values) {
        int count = 0;
        int lowest = values.get(0);
        for (int i = lcm; i <= lowest; i += lcm) {
            count++;
            for (int value : values) {
                if (lowest > value) {
                    lowest = value;
                }
                if (value % i != 0) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }

}


