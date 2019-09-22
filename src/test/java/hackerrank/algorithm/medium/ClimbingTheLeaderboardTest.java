package hackerrank.algorithm.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class ClimbingTheLeaderboardTest {

    static Stream<Arguments> testClimbingLeaderboard() {
        return Stream.of(
                Arguments.of(new int[]{100, 100, 50, 40, 40, 20, 10}, new int[]{5, 25, 50, 120}, new int[]{6, 4, 2, 1}),
                Arguments.of(new int[]{100, 90, 90, 80, 75, 60}, new int[]{50, 65, 77, 90, 102}, new int[]{6, 5, 4, 2, 1})
        );
    }

    @ParameterizedTest
    @MethodSource
    void testClimbingLeaderboard(int[] scores, int[] alice, int[] expected) {
        // given
        // when
        int[] actual = ClimbingTheLeaderboard.climbingLeaderboard(scores, alice);
        // then
        assertThat(actual, is(expected));
    }
}