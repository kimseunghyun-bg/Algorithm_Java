package hackerrank.algorithm.easy;

import java.util.Scanner;

public class ModifiedKaprekarNumbers {

    // Complete the kaprekarNumbers function below.
    static void kaprekarNumbers(int p, int q) {
        boolean hasKaprekarNumber = false;
        for (int i = p; i <= q; i++) {
            if (iskaprekarNumbers(i) && !hasKaprekarNumber){
                hasKaprekarNumber = true;
            }
        }

        if (!hasKaprekarNumber) {
            System.out.println("INVALID RANGE");
        }
    }

    static boolean iskaprekarNumbers(int num) {
        int numDigit = String.valueOf(num).length();
        String squared = String.valueOf((long) num * num);
        String left  = squared.substring(0, squared.length() - numDigit > 0 ? squared.length() - numDigit : 0);
        String right = squared.substring(squared.length() - numDigit);
        int numL = (left.isEmpty())  ? 0 : Integer.parseInt(left);
        int numR = (right.isEmpty()) ? 0 : Integer.parseInt(right);
        if (numL + numR == num) {
            System.out.print(num + " ");
            return true;
        } else {
            return false;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        kaprekarNumbers(p, q);

        scanner.close();
    }
}