package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class FairRationsTest {

    static Stream<Arguments> testFairRations() {
        return Stream.of(
                Arguments.of(Arrays.asList(2, 3, 4, 5, 6), "4"),
                Arguments.of(Arrays.asList(1, 2), "NO")
        );
    }

    @ParameterizedTest
    @MethodSource
    void testFairRations(List<Integer> b, String expected) {
        // given

        // when
        String actual = FairRations.fairRations(b);

        // then
        assertThat(actual, is(expected));
    }
}