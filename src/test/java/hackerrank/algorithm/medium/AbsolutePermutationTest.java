package hackerrank.algorithm.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class AbsolutePermutationTest {

    static Stream<Arguments> testAbsolutePermutation() {
        return Stream.of(
                Arguments.of(2, 1, Arrays.asList(2, 1)),
                Arguments.of(3, 0, Arrays.asList(1, 2, 3)),
                Arguments.of(3, 2, Collections.singletonList(-1)),
                Arguments.of(6, 1, Arrays.asList(2, 1, 4, 3, 6, 5))
        );
    }

    @ParameterizedTest
    @MethodSource
    void testAbsolutePermutation(int n, int k, Object expected) {
        // given

        // when
        List<Integer> actual = AbsolutePermutation.absolutePermutation(n, k);

        // then
        assertThat(actual, is(expected));
    }
}