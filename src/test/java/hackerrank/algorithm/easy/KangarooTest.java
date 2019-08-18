package hackerrank.algorithm.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class KangarooTest {

    static Stream<Arguments> testKangaroo() {
        return Stream.of(
                Arguments.of(0, 3, 4, 2, "YES"),
                Arguments.of(0, 2, 5, 3, "NO")
        );
    }

    @ParameterizedTest
    @MethodSource
    void testKangaroo(int startPosition1, int jumpDistance1, int startPosition2, int jumpDistance2, String expected) {
        String actual = Kangaroo.kangaroo(startPosition1, jumpDistance1, startPosition2, jumpDistance2);
        assertTrue(expected.equals(actual));
    }

    static Stream<Arguments> testIsClosing() {
        return Stream.of(
                Arguments.of(0, 3, 4, 2, true),
                Arguments.of(0, 2, 5, 3, false),
                Arguments.of(0, 3, 5, 3, false)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testIsClosing(int startPosition1, int jumpDistance1, int startPosition2, int jumpDistance2, boolean expected){
        boolean actual = Kangaroo.isClosing(startPosition1, jumpDistance1, startPosition2, jumpDistance2);
        assertEquals(expected, actual);
    }
}