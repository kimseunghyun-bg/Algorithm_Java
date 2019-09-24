package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class CircularArrayRotationTest {

    static Stream<Arguments> testCircularArrayRotation() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, 2, new int[]{0,1,2}, new int[]{2,3,1})
        );
    }

    @ParameterizedTest
    @MethodSource
    void testCircularArrayRotation(int[] a, int k, int[] queries, int[] expected) {
        // given
        // when
        int[] actual = CircularArrayRotation.circularArrayRotation(a, k, queries);
        // then
        assertThat(actual, is(expected));
    }
}