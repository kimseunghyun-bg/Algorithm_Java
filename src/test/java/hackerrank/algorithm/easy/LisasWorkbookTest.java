package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class LisasWorkbookTest {

    static Stream<Arguments> testWorkbook() {
        return Stream.of(
                Arguments.of(5, 3, Arrays.asList(4, 2, 6, 1, 10), 4),
                Arguments.of(10, 5, Arrays.asList(3, 8, 15, 11, 14, 1, 9, 2, 24, 31), 8)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testWorkbook(int n, int k, List<Integer> arr, int expected) {
        // given

        // when
        int actual = LisasWorkbook.workbook(n, k, arr);

        // then
        assertThat(actual, is(expected));
    }
}