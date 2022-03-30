package hackerrank.algorithm.medium;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class SamDSurfaceArea {

    public static int surfaceArea(List<List<Integer>> a) {
        // Write your code here
        int surface = 0;
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.get(i).size(); j++) {
                int size = a.get(i).get(j);
                int backsideHeight = j + 1 == a.get(i).size() ? 0 : a.get(i).get(j + 1);
                int sideHeight = i + 1 == a.size() ? 0 : a.get(i + 1).get(j);
                surface += getSurfaceSingleBlock(size) -
                        getOverlappedSurfaceSingleBlock(size, backsideHeight, sideHeight);
            }
        }
        return surface;
    }

    public static int getSurfaceSingleBlock(int height) {
        int bottom = 1;
        int top = 1;
        return height * 4 + bottom + top;
    }

    public static int getOverlappedSurfaceSingleBlock(int height, int backsideHeight, int sideHeight) {
        return Math.min(height, backsideHeight) * 2 + Math.min(height, sideHeight) * 2;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int H = Integer.parseInt(firstMultipleInput[0]);

        int W = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> A = new ArrayList<>();

        IntStream.range(0, H).forEach(i -> {
            try {
                A.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = surfaceArea(A);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
