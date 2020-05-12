package programmers.lv1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author Seunghyun Kim
 * @since 2020-05-13
 */
class SecretMapTest {

    static Stream<Arguments> testSolution() {
        return Stream.of(
                Arguments.of(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28}, new String[]{"#####", "# # #", "### #", "#  ##", "#####"}),
                Arguments.of(6, new int[]{46, 33, 33, 22, 31, 50}, new int[]{27, 56, 19, 14, 14, 10}, new String[]{"######", "###  #", "##  ##", " #### ", " #####", "### # "})
        );
    }

    @ParameterizedTest
    @MethodSource
    void testSolution(int n, int[] arr1, int[] arr2, String[] expected) {
        // given
        // when
        SecretMap secretMap = new SecretMap();
        String[] actual = secretMap.solution(n, arr1, arr2);
        // then
        assertThat(expected, is(actual));
    }
}