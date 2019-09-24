package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class ViralAdvertisingTest {

    static Stream<Arguments> testViralAdvertising() {
        return Stream.of(
                Arguments.of(3, 9)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testViralAdvertising(int days, int expected) {
        // given
        // when
        int actual = ViralAdvertising.viralAdvertising(days);
        // then
        assertThat(actual, is(expected));
    }
}