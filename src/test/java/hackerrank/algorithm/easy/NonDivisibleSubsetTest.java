package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class NonDivisibleSubsetTest {

    static Stream<Arguments> testNonDivisibleSubset() {
        return Stream.of(
                Arguments.of(3, Arrays.asList(1, 7, 2, 4), 3),
                Arguments.of(7, Arrays.asList(278, 576, 496, 727, 410, 124, 338, 149, 209, 702, 282, 718, 771, 575, 436), 11),
                Arguments.of(4, Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 5)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testNonDivisibleSubset(int k, List<Integer> s, int expected) {
        // given
        // when
        int actual = NonDivisibleSubset.nonDivisibleSubset(k, s);
        // then
        assertThat(actual, is(expected));
    }
}