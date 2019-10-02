package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class EqualizeTheArrayTest {

    static Stream<Arguments> testEqualizeArray() {
        return Stream.of(
                Arguments.of(new int[]{3, 3, 2, 1, 3}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testEqualizeArray(int[] arr, int expected) {
        // given
        // when
        int actual = EqualizeTheArray.equalizeArray(arr);
        // then
        assertThat(actual, is(expected));
    }
}