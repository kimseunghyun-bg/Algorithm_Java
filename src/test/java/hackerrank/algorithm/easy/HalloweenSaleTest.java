package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class HalloweenSaleTest {

    static Stream<Arguments> testHowManyGames() {
        return Stream.of(
                Arguments.of(20, 3, 6, 80, 6),
                Arguments.of(20, 3, 6, 85, 7)
        );
    }

    @MethodSource
    @ParameterizedTest
    void testHowManyGames(int p, int d, int m, int s, int expected) {
        // given
        // when
        int actual = HalloweenSale.howManyGames(p, d, m, s);
        // then
        assertThat(actual, is(expected));
    }
}