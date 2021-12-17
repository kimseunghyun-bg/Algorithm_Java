package hackerrank.algorithm.easy;

import java.util.Scanner;
public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double positiveCnt = 0;
        double negativeCnt = 0;
        double zeroCnt = 0;
        for(int i : arr){
            if(i == 0) {
                zeroCnt++;
            }else if(i>0){
                positiveCnt++;
            }else {
                negativeCnt++;
            }
        }

        System.out.println(positiveCnt/arr.length);
        System.out.println(negativeCnt/arr.length);
        System.out.println(zeroCnt/arr.length);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}

