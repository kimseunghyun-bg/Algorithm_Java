package hackerrank.algorithm.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class SamDSurfaceAreaTest {

    static Stream<Arguments> testSurfaceArea() {
        return Stream.of(
                Arguments.of(Collections.singletonList(
                        Collections.singletonList(1)
                ), 6),
                Arguments.of(Arrays.asList(
                        Arrays.asList(1, 3, 4),
                        Arrays.asList(2, 2, 3),
                        Arrays.asList(1, 2, 4)
                ), 60)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testSurfaceArea(List<List<Integer>> a, int expected) {
        // given

        // when
        int actual = SamDSurfaceArea.surfaceArea(a);

        // then
        assertThat(actual, is(expected));
    }

    static Stream<Arguments> testGetSurfaceSingleBlock() {
        return Stream.of(
                Arguments.of(1, 6),
                Arguments.of(2, 10),
                Arguments.of(3, 14)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testGetSurfaceSingleBlock(int height, int expected) {
        // given

        // when
        int actual = SamDSurfaceArea.getSurfaceSingleBlock(height);

        // then
        assertThat(actual, is(expected));
    }

    static Stream<Arguments> testGetOverlappedSurfaceSingleBlock() {
        return Stream.of(
                Arguments.of(1, 0, 0, 0),
                Arguments.of(1, 2, 0, 2),
                Arguments.of(4, 3, 5, 14)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testGetOverlappedSurfaceSingleBlock(int height, int backsideHeight, int sideHeight, int expected) {
        // given

        // when
        int actual = SamDSurfaceArea.getOverlappedSurfaceSingleBlock(height, backsideHeight, sideHeight);

        // then
        assertThat(actual, is(expected));
    }
}