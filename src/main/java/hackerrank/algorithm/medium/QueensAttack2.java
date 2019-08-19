package hackerrank.algorithm.medium;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class QueensAttack2 {

    // Complete the queensAttack function below.
    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
        int[][] nearObstacles = getAllNearestObstacles(r_q, c_q, obstacles);
        return getCanAttackNumbers(n, r_q, c_q, nearObstacles);
    }

    static int[][] verifyNearestObstacles(int r_q, int c_q, int[] obstacle, int[][] nearestObstacles) {
        if (obstacle[0] == r_q && c_q < obstacle[1] && (nearestObstacles[0] == null || obstacle[1] < nearestObstacles[0][1])) {
            nearestObstacles[0] = obstacle;
        } else if (obstacle[0] == r_q && c_q > obstacle[1] && (nearestObstacles[4] == null || obstacle[1] > nearestObstacles[4][1])) {
            nearestObstacles[4] = obstacle;
        } else if (obstacle[1] == c_q && r_q > obstacle[0] && (nearestObstacles[2] == null || obstacle[0] > nearestObstacles[2][0])) {
            nearestObstacles[2] = obstacle;
        } else if (obstacle[1] == c_q && r_q < obstacle[0] && (nearestObstacles[6] == null || obstacle[0] < nearestObstacles[6][0])) {
            nearestObstacles[6] = obstacle;
        } else if (r_q > obstacle[0] && c_q < obstacle[1] && Math.abs(obstacle[0] - r_q) == Math.abs(obstacle[1] - c_q) && (nearestObstacles[1] == null || (obstacle[0] > nearestObstacles[1][0] && obstacle[1] < nearestObstacles[1][1]))) {
            nearestObstacles[1] = obstacle;
        } else if (r_q > obstacle[0] && c_q > obstacle[1] && Math.abs(obstacle[0] - r_q) == Math.abs(obstacle[1] - c_q) && (nearestObstacles[3] == null || (obstacle[0] > nearestObstacles[3][0] && obstacle[1] > nearestObstacles[3][1]))) {
            nearestObstacles[3] = obstacle;
        } else if (r_q < obstacle[0] && c_q > obstacle[1] && Math.abs(obstacle[0] - r_q) == Math.abs(obstacle[1] - c_q) && (nearestObstacles[5] == null || (obstacle[0] < nearestObstacles[5][0] && obstacle[1] > nearestObstacles[5][1]))) {
            nearestObstacles[5] = obstacle;
        } else if (r_q < obstacle[0] && c_q < obstacle[1] && Math.abs(obstacle[0] - r_q) == Math.abs(obstacle[1] - c_q) && (nearestObstacles[7] == null || (obstacle[0] < nearestObstacles[7][0] && obstacle[1] < nearestObstacles[7][1]))) {
            nearestObstacles[7] = obstacle;
        }
            return nearestObstacles;
        }

        static int[][] getAllNearestObstacles ( int r_q, int c_q, int[][] obstacles){
            int[][] nearestObstacles = {null, null, null, null, null, null, null, null};
            if (obstacles == null) {
                return nearestObstacles;
            }
            for (int[] obstacle : obstacles) {
                if (obstacle != null) {
                    nearestObstacles = verifyNearestObstacles(r_q, c_q, obstacle, nearestObstacles);
                }
            }
            return nearestObstacles;
        }

        static int getCanAttackNumbers ( int n, int r_q, int c_q, int[][] nearObstacles){
            return (nearObstacles[0] != null ? (nearObstacles[0][1] - 1) - c_q : n - c_q)
                    + (nearObstacles[1] != null ? (nearObstacles[1][1] - 1) - c_q : (n - c_q < r_q - 1 ? n - c_q : r_q - 1))
                    + (nearObstacles[2] != null ? (r_q - 1) - nearObstacles[2][0] : r_q - 1)
                    + (nearObstacles[3] != null ? (c_q - 1) - nearObstacles[3][1] : (c_q - 1 < r_q - 1 ? c_q - 1 : r_q - 1))
                    + (nearObstacles[4] != null ? (c_q - 1) - nearObstacles[4][1] : c_q - 1)
                    + (nearObstacles[5] != null ? (c_q - 1) - nearObstacles[5][1] : (c_q - 1 < n - r_q ? c_q - 1 : n - r_q))
                    + (nearObstacles[6] != null ? (nearObstacles[6][0] - 1) - r_q : n - r_q)
                    + (nearObstacles[7] != null ? (nearObstacles[7][1] - 1) - c_q : (n - c_q < n - r_q ? n - c_q : n - r_q));
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main (String[]args) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            String[] r_qC_q = scanner.nextLine().split(" ");

            int r_q = Integer.parseInt(r_qC_q[0]);

            int c_q = Integer.parseInt(r_qC_q[1]);

            int[][] obstacles = new int[k][2];

            for (int i = 0; i < k; i++) {
                String[] obstaclesRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < 2; j++) {
                    int obstaclesItem = Integer.parseInt(obstaclesRowItems[j]);
                    obstacles[i][j] = obstaclesItem;
                }
            }

            int result = queensAttack(n, k, r_q, c_q, obstacles);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedWriter.close();

            scanner.close();
        }
    }

