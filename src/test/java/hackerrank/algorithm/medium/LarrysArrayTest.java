package hackerrank.algorithm.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class LarrysArrayTest {

    static Stream<Arguments> testLarrysArray() {
        return Stream.of(
                Arguments.of(Arrays.asList(3, 1, 2), "YES"),
                Arguments.of(Arrays.asList(1, 3, 4, 2), "YES"),
                Arguments.of(Arrays.asList(1, 2, 3, 5, 4), "NO")
        );
    }

    @ParameterizedTest
    @MethodSource
    void testLarrysArray(List<Integer> a, String expected) {
        // given

        // when
        String actual = LarrysArray.larrysArray(a);

        // then
        assertThat(actual, is(expected));
    }

    static Stream<Arguments> testArrange() {
        return Stream.of(
                Arguments.of(Arrays.asList(3, 1, 2), 0, Arrays.asList(1, 2, 3)),
                Arguments.of(Arrays.asList(1, 3, 4, 2), 1, Arrays.asList(1, 2, 3, 4)),
                Arguments.of(Arrays.asList(1, 2, 3, 5, 4), 2, Arrays.asList(1, 2, 4, 3, 5))
        );
    }

    @ParameterizedTest
    @MethodSource
    void testArrange(List<Integer> actual, int index, List<Integer> expected) {
        // given

        // when
        LarrysArray.arrange(actual, index);

        // then
        assertThat(actual, is(expected));
    }
}