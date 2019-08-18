package hackerrank.algorithm.warmup;

import java.util.Scanner;

public class MiniMaxSum {

    static int getMax(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            max = max < i ? i : max;
        }
        return max;
    }

    static int getMin(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            min = min > i ? i : min;
        }
        return min;
    }

    static int getSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        int max = getMax(arr);
        int min = getMin(arr);
        long sum = getSum(arr);

        System.out.println((sum-max)+" "+(sum-min));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}