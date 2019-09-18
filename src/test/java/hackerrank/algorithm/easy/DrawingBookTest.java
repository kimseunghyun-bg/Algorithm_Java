package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class DrawingBookTest {


    public static Stream<Arguments> testPageCount() {
        return Stream.of(
                Arguments.of(6, 2, 1),
                Arguments.of(5, 4, 0)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testPageCount(int n, int p, int expected) {
        // given
        // when
        int actual = DrawingBook.pageCount(n, p);
        // then
        assertThat(actual,is(expected));
    }

}