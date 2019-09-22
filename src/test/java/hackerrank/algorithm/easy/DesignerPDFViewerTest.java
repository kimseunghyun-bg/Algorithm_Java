package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class DesignerPDFViewerTest {

    static Stream<Arguments> testDesignerPdfViewer() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5}, "abc", 9),
                Arguments.of(new int[]{1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7}, "zaba", 28)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testDesignerPdfViewer(int[] h, String word, int expected) {
        // given
        // when
        int actual = DesignerPDFViewer.designerPdfViewer(h, word);
        // then
        assertThat(actual, is(expected));
    }
}