package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
class JumpingOnTheCloudsTest {

    static Stream<Arguments> testJumpingOnClouds(){
        return Stream.of(
                Arguments.of(new int[]{0, 0, 1, 0, 0, 1, 0}, 4),
                Arguments.of(new int[]{0, 0, 0, 0, 1, 0}, 3),
                Arguments.of(new int[]{0, 0, 0, 1, 0, 0}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testJumpingOnClouds(int[] c, int expected) {
        // given
        // when
        int actual = JumpingOnTheClouds.jumpingOnClouds(c);
        // then
        assertThat(actual, is(expected));
    }
}