package hackerrank.algorithm.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class QueensAttack2Test {

    static Stream<Arguments> testQueensAttack() {
        return Stream.of(
                Arguments.of(4, 0, 4, 4, new int[0][2], 9)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testQueensAttack(int n, int k, int r_q, int c_q, int[][] obstacles, int expected) {
        int actual = QueensAttack2.queensAttack(n, k, r_q, c_q, obstacles);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> testVerifyNearestObstacles() {
        return Stream.of(
                Arguments.of(50, 50, new int[]{50, 100}, new int[][]{null, null, null, null, null, null, null, null}, new int[][]{{50, 100}, null, null, null, null, null, null, null}),
                Arguments.of(50, 50, new int[]{50, 0}, new int[][]{{50, 100}, null, null, null, null, null, null, null}, new int[][]{{50, 100}, null, null, null, {50, 0}, null, null, null}),
                Arguments.of(50, 50, new int[]{0, 50}, new int[][]{{50, 100}, null, null, null, {50, 0}, null, null, null}, new int[][]{{50, 100}, null, {0, 50}, null, {50, 0}, null, null, null}),
                Arguments.of(50, 50, new int[]{100, 50}, new int[][]{{50, 100}, null, {0, 50}, null, {50, 0}, null, null, null}, new int[][]{{50, 100}, null, {0, 50}, null, {50, 0}, null, {100, 50}, null}),
                Arguments.of(50, 50, new int[]{1, 99}, new int[][]{{50, 100}, null, {0, 50}, null, {50, 0}, null, {100, 50}, null}, new int[][]{{50, 100}, {1, 99}, {0, 50}, null, {50, 0}, null, {100, 50}, null}),
                Arguments.of(50, 50, new int[]{1, 99}, new int[][]{{50, 100}, {0, 100}, {0, 50}, null, {50, 0}, null, {100, 50}, null}, new int[][]{{50, 100}, {1, 99}, {0, 50}, null, {50, 0}, null, {100, 50}, null}),
                Arguments.of(50, 50, new int[]{1, 1}, new int[][]{{50, 100}, {1, 99}, {0, 50}, null, {50, 0}, null, {100, 50}, null}, new int[][]{{50, 100}, {1, 99}, {0, 50}, {1, 1}, {50, 0}, null, {100, 50}, null}),
                Arguments.of(50, 50, new int[]{1, 1}, new int[][]{{50, 100}, {1, 99}, {0, 50}, {0, 0}, {50, 0}, null, {100, 50}, null}, new int[][]{{50, 100}, {1, 99}, {0, 50}, {1, 1}, {50, 0}, null, {100, 50}, null}),
                Arguments.of(50, 50, new int[]{99, 1}, new int[][]{{50, 100}, {1, 99}, {0, 50}, {1, 1}, {50, 0}, null, {100, 50}, null}, new int[][]{{50, 100}, {1, 99}, {0, 50}, {1, 1}, {50, 0}, {99, 1}, {100, 50}, null}),
                Arguments.of(50, 50, new int[]{99, 1}, new int[][]{{50, 100}, {1, 99}, {0, 50}, {1, 1}, {50, 0}, {100, 0}, {100, 50}, null}, new int[][]{{50, 100}, {1, 99}, {0, 50}, {1, 1}, {50, 0}, {99, 1}, {100, 50}, null}),
                Arguments.of(50, 50, new int[]{99, 99}, new int[][]{{50, 100}, {1, 99}, {0, 50}, {1, 1}, {50, 0}, {99, 1}, {100, 50}, null}, new int[][]{{50, 100}, {1, 99}, {0, 50}, {1, 1}, {50, 0}, {99, 1}, {100, 50}, {99, 99}}),
                Arguments.of(50, 50, new int[]{99, 99}, new int[][]{{50, 100}, {1, 99}, {0, 50}, {1, 1}, {50, 0}, {99, 1}, {100, 50}, {100, 100}}, new int[][]{{50, 100}, {1, 99}, {0, 50}, {1, 1}, {50, 0}, {99, 1}, {100, 50}, {99, 99}}),
                Arguments.of(50, 50, new int[]{50, 50}, new int[][]{null, null, null, null, null, null, null, null}, new int[][]{null, null, null, null, null, null, null, null}),
                Arguments.of(50, 50, new int[]{51, 100}, new int[][]{null, null, null, null, null, null, null, null}, new int[][]{null, null, null, null, null, null, null, null}),
                Arguments.of(50, 50, new int[]{50, 80}, new int[][]{{50, 100}, null, null, null, {50, 0}, null, null, null}, new int[][]{{50, 80}, null, null, null, {50, 0}, null, null, null})
        );
    }

    @ParameterizedTest
    @MethodSource
    void testVerifyNearestObstacles(int r_q, int c_q, int[] obstacle, int[][] nearestObstacles, int[][] expected) {
        int[][] actual = QueensAttack2.verifyNearestObstacles(r_q, c_q, obstacle, nearestObstacles);
        assertArrayEquals(expected, actual);
    }

    static Stream<Arguments> testGetAllNearestObstacles() {
        return Stream.of(
                Arguments.of(50, 50, new int[][]{null}, new int[][]{null, null, null, null, null, null, null, null}),
                Arguments.of(50, 50, new int[][]{{50, 100}, {1, 99}, {0, 50}, {1, 1}, {50, 0}, {99, 1}, {100, 50}, {99, 99}}, new int[][]{{50, 100}, {1, 99}, {0, 50}, {1, 1}, {50, 0}, {99, 1}, {100, 50}, {99, 99}}),
                Arguments.of(4, 4, new int[0][2], new int[][]{null, null, null, null, null, null, null, null})
        );
    }

    @ParameterizedTest
    @MethodSource
    void testGetAllNearestObstacles(int r_q, int c_q, int[][] obstacles, int[][] expected) {
        int[][] actual = QueensAttack2.getAllNearestObstacles(r_q, c_q, obstacles);
        assertArrayEquals(expected, actual);
    }

    static Stream<Arguments> testGetCanAttackNumbers() {
        return Stream.of(
                Arguments.of(3, 1, 1, new int[][]{null, null, null, null, null, null, null, null}, 6),
                Arguments.of(3, 2, 2, new int[][]{null, null, null, null, null, null, null, null}, 8),
                Arguments.of(4, 4, 4, new int[][]{null, null, null, null, null, null, null, null}, 9)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testGetCanAttackNumbers(int n, int r_q, int c_q, int[][] obstacles, int expected) {
        int actual = QueensAttack2.getCanAttackNumbers(n, r_q, c_q, obstacles);
        assertEquals(expected, actual);
    }
}