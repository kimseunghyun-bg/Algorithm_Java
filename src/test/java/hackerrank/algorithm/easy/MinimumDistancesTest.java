package hackerrank.algorithm.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class MinimumDistancesTest {

    static Stream<Arguments> testMinimumDistances() {
        return Stream.of(
                Arguments.of(new int[]{7, 1, 3, 4, 1, 7}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testMinimumDistances(int[] a, int expected) {
        // given
        // when
        int actual = MinimumDistances.minimumDistances(a);
        // then
        assertThat(actual, is(expected));
    }

    @Test
    void testCreateIndexMap() {
        // given
        Map<Integer, List<Integer>> expected = new HashMap<>();
        expected.put(7, Arrays.asList(0, 5));
        expected.put(1, Arrays.asList(1, 4));
        expected.put(3, Arrays.asList(2));
        expected.put(4, Arrays.asList(3));
        // when
        Map actual = MinimumDistances.createIndexMap(new int[]{7, 1, 3, 4, 1, 7});
        // then
        assertThat(actual, is(expected));
    }

    static Stream<Arguments> getMinimumDistanceInList() {
        return Stream.of(
                Arguments.of(Arrays.asList(0, 2, 5, 6, 9), 1)
        );
    }

    @ParameterizedTest
    @MethodSource
    void getMinimumDistanceInList(List<Integer> list, int expected){
        // given
        // when
        int actual = MinimumDistances.getMinimumDistancesInList(list);
        // then
        assertThat(actual, is(expected));
    }
}