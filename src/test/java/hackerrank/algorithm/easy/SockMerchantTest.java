package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class SockMerchantTest {

    static Stream<Arguments> testSockMerchant() {
        return Stream.of(
                Arguments.of(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testSockMerchant(int sockCnt, int[] socks, int expected) {
        // given
        // when
        int actual = SockMerchant.sockMerchant(sockCnt, socks);
        // then
        assertThat(actual, is(expected));
    }
}