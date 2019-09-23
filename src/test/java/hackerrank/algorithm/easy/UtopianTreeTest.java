package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class UtopianTreeTest {

    static Stream<Arguments> testUtopianTree() {
        return Stream.of(
                Arguments.of(0,1),
                Arguments.of(1,2),
                Arguments.of(4,7)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testUtopianTree(int n, int expected) {
        // given
        // when
        int actual = UtopianTree.utopianTree(n);
        // then
        assertThat(actual, is(expected));
    }
}