package hackerrank.algorithm.medium;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FormingAMagicSquare {

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
        int[][] magicSqures = new int[][]{
                {2, 7, 6, 9, 5, 1, 4, 3, 8},
                {2, 9, 4, 7, 5, 3, 6, 1, 8},
                {4, 3, 8, 9, 5, 1, 2, 7, 6},
                {4, 9, 2, 3, 5, 7, 8, 1, 6},
                {6, 1, 8, 7, 5, 3, 2, 9, 4},
                {6, 7, 2, 1, 5, 9, 8, 3, 4},
                {8, 1, 6, 3, 5, 7, 4, 9, 2},
                {8, 3, 4, 1, 5, 9, 6, 7, 2}
        };
        List<Integer> linerS = new ArrayList<>();
        for (int[] ints : s) {
            for (int anInt : ints) {
                linerS.add(anInt);
            }
        }

        Integer minDiff = null;
        for (int[] magicSqure : magicSqures){
            int diff = 0;
            for (int i = 0; i < magicSqure.length; i++) {
                diff += Math.abs(magicSqure[i] - linerS.get(i));
            }
            if (minDiff != null || minDiff > diff) {
                minDiff = diff;
            }
        }
        return minDiff;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
