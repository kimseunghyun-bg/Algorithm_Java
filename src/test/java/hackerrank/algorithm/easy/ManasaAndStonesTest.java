package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class ManasaAndStonesTest {

    static Stream<Arguments> testStones() {
        return Stream.of(
                Arguments.of(3, 1, 2, Arrays.asList(2, 3, 4)),
                Arguments.of(4, 10, 100, Arrays.asList(30, 120, 210, 300))
        );
    }

    @ParameterizedTest
    @MethodSource
    void testStones(int n, int a, int b, List<Integer> expected) {
        // given

        // when
        List<Integer> actual = ManasaAndStones.stones(n, a, b);

        // then
        assertThat(actual, is(expected));
    }
}