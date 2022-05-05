package book.cote2022.part2;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class JosephusProblemTest {

    static Stream<Arguments> testJosephusProblem() {
        return Stream.of(
                Arguments.of(7, 3, new int[]{3, 6, 2, 7, 5, 1, 4})
        );
    }

    @ParameterizedTest
    @MethodSource
    void testJosephusProblem(int n, int k, int[] expected) {
        // given
        // when
        int[] actual = JosephusProblem.josephusProblem(n, k);
        // then
        assertThat(actual, is(expected));
    }

}