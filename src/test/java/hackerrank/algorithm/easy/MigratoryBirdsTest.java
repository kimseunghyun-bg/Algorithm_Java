package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MigratoryBirdsTest {

    static Stream<Arguments> testMigratoryBirds() {
        return Stream.of(
                Arguments.of(Arrays.asList(1, 4, 4, 4, 5, 3), 4),
                Arguments.of(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4), 3),
                Arguments.of(Arrays.asList(1, 4, 4, 4, 5, 3, 3, 3), 3)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testMigratoryBirds(List<Integer> arr, int expected) {
        int actual = MigratoryBirds.migratoryBirds(arr);
        assertEquals(expected, actual);
    }
}