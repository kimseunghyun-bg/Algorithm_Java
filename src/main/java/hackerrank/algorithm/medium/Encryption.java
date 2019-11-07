package hackerrank.algorithm.medium;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Encryption {

    // Complete the encryption function below.
    static String encryption(String s) {
        s = s.trim();

        int row = (int)Math.floor(Math.sqrt(s.length()));
        int column = (int)Math.ceil(Math.sqrt(s.length()));
        if (row * column < s.length()) {
            row++;
        }

        char[][] rewritenGrid = new char[row][column];
        int j = 0;
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i != 0 && i % column == 0) {
                j++;
                k = 0;
            }
            rewritenGrid[j][k] = s.toCharArray()[i];
            k++;
        }

        String result = "";
        for (int i = 0; i < row*column; i++) {
            if ( i != 0 && i % row == 0){
                result += " ";
            }
            char c = rewritenGrid[i % row][i / row];
            if (97 <= c && c <= 122) {
                result += c;
            }
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
