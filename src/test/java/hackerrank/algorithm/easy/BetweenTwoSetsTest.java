package hackerrank.algorithm.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BetweenTwoSetsTest {

    static Stream<Arguments> testLCM() {
        return Stream.of(
                Arguments.of(Arrays.asList(2, 4), 4),
                Arguments.of(Arrays.asList(2, 3), 6),
                Arguments.of(Arrays.asList(2, 6, 8), 24),
                Arguments.of(Arrays.asList(1), 1),
                Arguments.of(Arrays.asList(2, 3, 6),6)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testLCM(List<Integer> values, int expected) {
        int actual = Result.getLCM(values);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> testLCMTwoInteger() {
        return Stream.of(
                Arguments.of(2, 4, 4),
                Arguments.of(2, 3, 6),
                Arguments.of(6, 8, 24)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testLCMTwoInteger(int x1, int x2, int expected) {
        int actual = Result.getLCM(x1, x2);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> getCount() {
        return Stream.of(
//                Arguments.of(4, Arrays.asList(4, 8, 12), 1),
//                Arguments.of(4, Arrays.asList(8, 16, 32), 2),
                Arguments.of(1, Arrays.asList(72, 48), 8)
        );
    }

    @ParameterizedTest
    @MethodSource
    void getCount(int lcm, List<Integer> values, int expected) {
        int actual = Result.getCount(lcm, values);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> testGetTotalX() {
        return Stream.of(
                Arguments.of(Arrays.asList(2, 4), Arrays.asList(16, 32, 96), 3),
                Arguments.of(Arrays.asList(1), Arrays.asList(72, 48), 8),
                Arguments.of(Arrays.asList(100, 99, 98, 97, 96, 95, 94, 93, 92, 91), Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 0),
                Arguments.of(Arrays.asList(2, 3, 6), Arrays.asList(42, 84), 2)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testGetTotalX(List<Integer> a, List<Integer> b, int expected) {
        int actual = Result.getTotalX(a, b);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> testGetGCM() {
        return Stream.of(
                Arguments.of(2, 4, 2),
                Arguments.of(3, 2, 1),
                Arguments.of(12345, 1234, 1)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testGetGCM(int a, int b, int expected) {
        int actual = Result.getGCM(a, b);
        assertEquals(expected, actual);
    }

}