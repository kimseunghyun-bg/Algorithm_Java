package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


class ElectronicsShopTest {

    static Stream<Arguments> testGetMoneySpent() {
        return Stream.of(
                Arguments.of(new int[]{3, 1}, new int[]{5, 2, 8}, 10, 9),
                Arguments.of(new int[]{5}, new int[]{4}, 5, -1)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testGetMoneySpent(int[] keyboards, int[] drives, int b, int expected) {
        // given
        // when
        int actual = ElectronicsShop.getMoneySpent(keyboards, drives, b);
        // then
        assertThat(actual, is(expected));
    }
}