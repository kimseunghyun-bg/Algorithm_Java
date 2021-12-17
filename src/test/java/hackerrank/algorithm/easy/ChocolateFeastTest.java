package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class ChocolateFeastTest {

    static Stream<Arguments> testChocolateFeast() {
        return Stream.of(
                Arguments.of(15, 3, 2, 9),
                Arguments.of(10, 2, 5, 6),
                Arguments.of(12, 4, 4, 3),
                Arguments.of(6, 2, 2, 5)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testChocolateFeast(int n, int c, int m, int expected) {
        // given

        // when
        int actual = ChocolateFeast.chocolateFeast(n, c, m);

        // then
        assertThat(actual, is(expected));
    }
}