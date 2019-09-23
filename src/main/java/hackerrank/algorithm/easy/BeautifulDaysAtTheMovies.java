package hackerrank.algorithm.easy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BeautifulDaysAtTheMovies {

    // Complete the beautifulDays function below.
    static int beautifulDays(int start, int end, int k) {
        int beautifulDay = 0;
        for (int i = start; i <= end; i++) {
            String day = Integer.toString(i);
            String reverseDayStr = "";
            for (int j = day.toCharArray().length-1; j >= 0; j--) {
                reverseDayStr += day.toCharArray()[j];
            }
            Integer reverseDay = Integer.valueOf(reverseDayStr);
            if (Math.abs(i - reverseDay) % k == 0) {
                beautifulDay += 1;
            }
        }
        return beautifulDay;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

