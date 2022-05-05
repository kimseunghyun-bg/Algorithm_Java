package book.cote2022.part2;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JosephusProblem {
    static int[] josephusProblem(int n, int k) {
        List<Integer> peoples = IntStream.range(1, n + 1).boxed().collect(Collectors.toList());
        int index = 0;
        List<Integer> result = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            index += k - 1;
            index %= peoples.size();
            result.add(peoples.get(index));
            peoples.remove(index);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
