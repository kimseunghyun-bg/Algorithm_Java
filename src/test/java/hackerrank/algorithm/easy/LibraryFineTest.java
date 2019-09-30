package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class LibraryFineTest {

    static Stream<Arguments> testLibraryFine() {
        return Stream.of(
                Arguments.of(9, 6, 2015, 6, 6, 2015, 45)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testLibraryFine(int d1, int m1, int y1, int d2, int m2, int y2, int expected) {
        // given
        // when
        int actual = LibraryFine.libraryFine(d1, m1, y1, d2, m2, y2);
        // then
        assertThat(actual, is(expected));
    }
}