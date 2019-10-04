package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class ACMICPCTeamTest {

    static Stream<Arguments> testAcmTeam() {
        return Stream.of(
                Arguments.of(new String[]{"10101", "11100", "11010", "00101"}, new int[]{5, 2}),
                Arguments.of(new String[]{"11101", "10101", "11001", "10111", "10000", "01110"}, new int[]{5, 6})
        );
    }

    @ParameterizedTest
    @MethodSource
    void testAcmTeam(String[] topic, int[] expected) {
        // given
        // when
        int[] actual = ACMICPCTeam.acmTeam(topic);
        // then
        assertThat(actual, is(expected));
    }
}