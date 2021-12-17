package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolveMeFirstTest {


//    @SuppressWarnings("unused")
//    private Object[] parametersForTestSolveMeFirst() {
//        return new Object[]{
//                new Object[]{0, 0, 0},
//                new Object[]{2, 3, 5}
//        };
//    }

    private static Stream<Arguments> testSolveMeFirst() {
        return Stream.of(
                Arguments.of(0, 0, 0),
                Arguments.of(2, 3, 5)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testSolveMeFirst(int param1, int param2, int expected) {
        // given
        // when
        int actualResult = SolveMeFirst.solveMeFirst(param1, param2);

        // then
        assertEquals(expected, actualResult);
//        assertThat(actualResult, is(expectedValue));
    }
}