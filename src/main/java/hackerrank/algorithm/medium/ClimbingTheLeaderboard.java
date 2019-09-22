package hackerrank.algorithm.medium;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class ClimbingTheLeaderboard {

    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        Set<Integer> scoreSet = Arrays.stream(scores).boxed().collect(Collectors.toSet());
        List<Integer> scoreList = new ArrayList<>(scoreSet);
        scoreList.sort(Comparator.reverseOrder());

        List<Integer> ranks = new ArrayList<>();
        for (int i : alice) {
            ranks.add(getRank(scoreList, i));
        }

        return ranks.stream().mapToInt(i -> i).toArray();
    }

    static int getRank(List<Integer> score, int alice) {
        int last = score.size() - 1;
        int first = 0;
        int mid = 0;
        while (first <= last && alice != score.get(mid)) {
            mid = (first + last) / 2;
            if (alice < score.get(mid)) {
                first = mid + 1;
                if(first > last){
                    mid = first;
                }
            } else {
                last = mid - 1;
                if(last > first){
                    mid = last;
                }
            }
        }
        return mid + 1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
