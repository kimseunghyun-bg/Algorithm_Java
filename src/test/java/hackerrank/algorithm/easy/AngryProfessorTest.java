package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class AngryProfessorTest {

    static Stream<Arguments> testAngryProfessor() {
        return Stream.of(
                Arguments.of(3, new int[]{-1, -3, 4, 2}, "YES"),
                Arguments.of(2, new int[]{0, -1, 2, 1}, "NO")
        );
    }

    @ParameterizedTest
    @MethodSource
    void testAngryProfessor(int k, int[] a, String expected) {
        // given
        // when
        String actual = AngryProfessor.angryProfessor(k, a);
        // then
        assertThat(actual, is(expected));
    }
}