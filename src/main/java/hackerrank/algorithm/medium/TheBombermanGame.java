package hackerrank.algorithm.medium;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class TheBombermanGame {

    /*
     * Complete the 'bomberMan' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING_ARRAY grid
     */

    public static List<String> bomberMan(int n, List<String> grid) {
        // Write your code here
        List<String> wholeBomberGrid = getWholeBomberGrid(grid);
        if (n % 2 == 0) {
            return wholeBomberGrid;
        } else {
            if (n >= 7) {
                n = ((n - 1) % 4) + 5;
            }

            for (int i = 3; i <= n; i = i + 2) {
                List<String> copiedWholeBomberGrid = new ArrayList<>(wholeBomberGrid);
                for (int j = 0; j < grid.size(); j++) {
                    char[] tempRow = grid.get(j).toCharArray();
                    for (int k = 0; k < tempRow.length; k++) {
                        if (tempRow[k] == 'O') {
                            denoteBomb(copiedWholeBomberGrid, j, k);
                        }
                    }
                }
                grid = copiedWholeBomberGrid;
            }
            return grid;
        }
    }

    static List<String> getWholeBomberGrid(List<String> grid) {
        String allBomber = String.join("", Collections.nCopies(grid.get(0).length(), "O"));
        return Collections.nCopies(grid.size(), allBomber);
    }

    static List<String> denoteBomb(List<String> grid, int row, int column) {
        if (row > 0) {
            char[] temp = grid.get(row - 1).toCharArray();
            temp[column] = '.';
            grid.set(row - 1, String.valueOf(temp));
        }

        if (row < grid.size() - 1) {
            char[] temp = grid.get(row + 1).toCharArray();
            temp[column] = '.';
            grid.set(row + 1, String.valueOf(temp));
        }

        char[] temp = grid.get(row).toCharArray();
        temp[column] = '.';

        if (column > 0) {
            temp[column - 1] = '.';
        }

        if (column < temp.length - 1) {
            temp[column + 1] = '.';
        }
        grid.set(row, String.valueOf(temp));
        return grid;
    }

    static List<String> denoteLeftBomb(List<String> grid, int row, int column) {
        char[] temp = grid.get(row).toCharArray();
        if (column > 0) {
            temp[column - 1] = '.';
        }
        grid.set(row, String.valueOf(temp));
        return grid;
    }

    static List<String> denoteRightBomb(List<String> grid, int row, int column) {
        char[] temp = grid.get(row).toCharArray();
        if (column < temp.length - 1) {
            temp[column + 1] = '.';
        }
        grid.set(row, String.valueOf(temp));
        return grid;
    }

    static List<String> denoteTopBomb(List<String> grid, int row, int column) {
        if (row > 0) {
            char[] temp = grid.get(row - 1).toCharArray();
            temp[column] = '.';
            grid.set(row - 1, String.valueOf(temp));
        }
        return grid;
    }

    static List<String> denoteBottomBomb(List<String> grid, int row, int column) {
        if (row < grid.size() - 1) {
            char[] temp = grid.get(row + 1).toCharArray();
            temp[column] = '.';
            grid.set(row + 1, String.valueOf(temp));
        }
        return grid;
    }

    static List<String> denoteCentreBomb(List<String> grid, int row, int column) {
        char[] temp = grid.get(row).toCharArray();
        temp[column] = '.';
        grid.set(row, String.valueOf(temp));
        return grid;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int r = Integer.parseInt(firstMultipleInput[0]);

        int c = Integer.parseInt(firstMultipleInput[1]);

        int n = Integer.parseInt(firstMultipleInput[2]);

        List<String> grid = IntStream.range(0, r).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<String> result = bomberMan(n, grid);

        bufferedWriter.write(
                result.stream()
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

