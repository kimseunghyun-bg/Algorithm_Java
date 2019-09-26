package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class JumpingOnTheCloudsRevisitedTest {

    static Stream<Arguments> testJumpingOnClouds(){
        return Stream.of(
                Arguments.of(new int[]{0, 0, 1, 0, 0, 1, 1, 0}, 2, 92),
                Arguments.of(new int[]{1, 1, 1, 0, 1, 1, 0, 0, 0, 0}, 3, 80)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testJumpingOnClouds(int[] c, int k, int expected) {
        // given
        // when
        int actual = JumpingOnTheCloudsRevisited.jumpingOnClouds(c, k);
        // then
        assertThat(actual, is(expected));
    }
}