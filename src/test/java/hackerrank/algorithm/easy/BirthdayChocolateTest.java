package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BirthdayChocolateTest {

    static Stream<Arguments> testBirthday() {
        return Stream.of(
                Arguments.of(Arrays.asList(1, 2, 1, 3, 2), 3, 2, 2),
                Arguments.of(Arrays.asList(1, 1, 1, 1, 1, 1), 3, 2, 0),
                Arguments.of(Arrays.asList(4), 4, 1, 1)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testBirthday(List<Integer> s, int d, int m, int expected) {
        int actual = BirthdayChocolate.birthday(s, d, m);
        assertEquals(expected, actual);
    }
}