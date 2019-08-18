package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AppleAndOrangeTest {

    static Stream<Arguments> testCalculateFruitsDistance() {
        return Stream.of(
                Arguments.of(4, new int[]{2, 3, -4}, new int[]{6, 7, 0}),
                Arguments.of(12, new int[]{3, -2, -4}, new int[]{15, 10, 8})
        );
    }

    @ParameterizedTest
    @MethodSource
    void testCalculateFruitsDistance(int treeLocation, int[] fruits, int[] expected) {
        int[] actual = AppleAndOrange.calculateFruitsDistance(treeLocation, fruits);
        assertArrayEquals(expected, actual);
    }

    static Stream<Arguments> testCountFruitsOnHouse() {
        return Stream.of(
                Arguments.of(7, 10, new int[]{6, 7, 0}, 1),
                Arguments.of(7, 10, new int[]{15, 10, 8}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testCountFruitsOnHouse(int houseStartPos, int houseEndPos, int[] fruitsPos, int expected) {
        int actual = AppleAndOrange.countFruitsOnHouse(houseStartPos, houseEndPos, fruitsPos);
        assertEquals(expected, actual);
    }
}