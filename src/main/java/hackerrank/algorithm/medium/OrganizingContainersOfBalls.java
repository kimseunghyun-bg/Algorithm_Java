package hackerrank.algorithm.medium;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrganizingContainersOfBalls {

    // Complete the organizingContainers function below.
    static String organizingContainers(int[][] container) {
        List<Integer> typeSums = new ArrayList<>();
        List<Integer> containerSums = new ArrayList<>();
        int standard = container[0][0];

        for (int i = 0; i < container.length; i++) {
            int typeSum = 0;
            int containerSum = 0;
            for (int j = 0; j < container.length; j++) {
                typeSum = typeSum + (container[j][i] - standard);
                containerSum = containerSum + (container[i][j] - standard);
            }
            typeSums.add(typeSum);
            containerSums.add(containerSum);
        }

        for (int i = 0; i < containerSums.size(); i++) {
            for (int j = 0; j < typeSums.size(); j++) {
                if (containerSums.get(i).equals(typeSums.get(j))){
                    typeSums.remove(j);
                    break;
                }
            }
        }

        return typeSums.size() == 0 ? "Possible" : "Impossible";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[][] container = new int[n][n];

            for (int i = 0; i < n; i++) {
                String[] containerRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < n; j++) {
                    int containerItem = Integer.parseInt(containerRowItems[j]);
                    container[i][j] = containerItem;
                }
            }

            String result = organizingContainers(container);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
