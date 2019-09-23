package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


class BeautifulDaysAtTheMoviesTest {

    static Stream<Arguments> testBeautifulDays() {
        return Stream.of(
                Arguments.of(20, 23, 6, 2)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testBeautifulDays(int i, int j, int k, int expected) {
        // given
        // when
        int actual = BeautifulDaysAtTheMovies.beautifulDays(i, j, k);
        // then
        assertThat(actual, is(expected));
    }
}