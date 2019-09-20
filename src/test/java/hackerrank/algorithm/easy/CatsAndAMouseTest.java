package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class CatsAndAMouseTest {

    static Stream<Arguments> testCatAndMouse() {
        final String CAT_A = "Cat A";
        final String CAT_B = "Cat B";
        final String MOUSE_C = "Mouse C";
        return Stream.of(
                Arguments.of(1, 2, 3, CAT_B),
                Arguments.of(1, 3, 2, MOUSE_C)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testCatAndMouse(int catA, int catB, int mouseC, String expected) {
        // given
        // when
        String actual = CatsAndAMouse.catAndMouse(catA, catB, mouseC);
        // then
        assertThat(actual, is(expected));
    }
}