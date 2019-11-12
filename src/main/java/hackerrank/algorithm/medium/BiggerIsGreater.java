package hackerrank.algorithm.medium;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class BiggerIsGreater {

    // Complete the biggerIsGreater function below.
    static String biggerIsGreater(String w) {
        char[] wChars = w.toCharArray();
        int pos = -1;
        for (int i = wChars.length - 1; i >= 0; i--) {
            for (int j = wChars.length - 1; j > i; j--) {
                if (wChars[i] < wChars[j]) {
                    char temp = wChars[i];
                    wChars[i] = wChars[j];
                    wChars[j] = temp;
                    pos = i;
                    break;
                }
            }
            if (pos != -1){
                break;
            }
        }

        if (pos == -1){
            return "no answer";
        }

        char[] charsHeadPart = Arrays.copyOfRange(wChars, 0, pos+1);
        char[] charsTailPart = Arrays.copyOfRange(wChars, pos+1, wChars.length);
        Arrays.sort(charsTailPart);

        return new String(charsHeadPart)+new String(charsTailPart);
    }

    static void charsSort(char[] chars) {
        Arrays.sort(chars);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int TItr = 0; TItr < T; TItr++) {
            String w = scanner.nextLine();

            String result = biggerIsGreater(w);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

