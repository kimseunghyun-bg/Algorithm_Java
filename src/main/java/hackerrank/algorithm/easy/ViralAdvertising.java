package hackerrank.algorithm.easy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ViralAdvertising {

    // Complete the viralAdvertising function below.
    static int viralAdvertising(int n) {
        int sumLikedPeople = 0;
        for (int i = 1; i <= n; i++) {
            sumLikedPeople += getLikedPeopleAtDay(i);
        }
        return sumLikedPeople;
    }

    static int getLikedPeopleAtDay(int day) {
        if (day == 1) {
            return 2;
        } else {
            return (int) Math.floor(getLikedPeopleAtDay(day - 1)*3 / 2);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = viralAdvertising(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

