package hackerrank.algorithm.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class TheBombermanGameTest {

    static Stream<Arguments> testBomberMan() {
        return Stream.of(
                Arguments.of(3, Arrays.asList(
                                ".......",
                                "...O...",
                                "....O..",
                                ".......",
                                "OO.....",
                                "OO....."),
                        Arrays.asList(
                                "OOO.OOO",
                                "OO...OO",
                                "OOO...O",
                                "..OO.OO",
                                "...OOOO",
                                "...OOOO"
                        )),
                Arguments.of(2, Arrays.asList(
                                ".......",
                                "...O...",
                                "....O..",
                                ".......",
                                "OO.....",
                                "OO....."),
                        Arrays.asList(
                                "OOOOOOO",
                                "OOOOOOO",
                                "OOOOOOO",
                                "OOOOOOO",
                                "OOOOOOO",
                                "OOOOOOO"
                        )),
                Arguments.of(5, Arrays.asList(
                                ".......",
                                "...O.O.",
                                "....O..",
                                "..O....",
                                "OO...OO",
                                "OO.O..."),
                        Arrays.asList(
                                ".......",
                                "...O.O.",
                                "...OO..",
                                "..OOOO.",
                                "OOOOOOO",
                                "OOOOOOO"
                        ))
        );
    }

    @ParameterizedTest
    @MethodSource
    void testBomberMan(int n, List<String> grid, Object expected) {
        // given

        // when
        List<String> actual = TheBombermanGame.bomberMan(n, grid);

        // then
        assertThat(actual, is(expected));
    }

    static Stream<Arguments> testGetWholeBomberGrid() {
        return Stream.of(
                Arguments.of(
                        Arrays.asList(
                                ".......",
                                "...O...",
                                "....O..",
                                ".......",
                                "OO.....",
                                "OO....."),
                        Arrays.asList(
                                "OOOOOOO",
                                "OOOOOOO",
                                "OOOOOOO",
                                "OOOOOOO",
                                "OOOOOOO",
                                "OOOOOOO")
                ),
                Arguments.of(
                        Arrays.asList(
                                ".......",
                                "...O..."),
                        Arrays.asList(
                                "OOOOOOO",
                                "OOOOOOO")
                )
        );
    }

    @ParameterizedTest
    @MethodSource
    void testGetWholeBomberGrid(List<String> grid, List<String> expected) {
        // given

        // when
        List<String> actual = TheBombermanGame.getWholeBomberGrid(grid);

        // then
        assertThat(actual, is(expected));
    }

    static Stream<Arguments> testDenoteLeftBomb() {
        return Stream.of(
                Arguments.of(
                        Arrays.asList(
                                "OOO",
                                "OOO",
                                "OOO"), 0, 0,
                        Arrays.asList(
                                "OOO",
                                "OOO",
                                "OOO")),
                Arguments.of(
                        Arrays.asList(
                                "OOO",
                                "OOO",
                                "OOO"), 0, 1,
                        Arrays.asList(
                                ".OO",
                                "OOO",
                                "OOO")),
                Arguments.of(
                        Arrays.asList(
                                "OOO",
                                "OOO",
                                "OOO"), 1, 1,
                        Arrays.asList(
                                "OOO",
                                ".OO",
                                "OOO"))
        );
    }

    @ParameterizedTest
    @MethodSource
    void testDenoteLeftBomb(List<String> grid, int row, int column, List<String> expected) {
        // given

        // when
        List<String> actual = TheBombermanGame.denoteLeftBomb(grid, row, column);

        // then
        assertThat(actual, is(expected));
    }

    static Stream<Arguments> testDenoteRightBomb() {
        return Stream.of(
                Arguments.of(
                        Arrays.asList(
                                "OOO",
                                "OOO",
                                "OOO"), 0, 2,
                        Arrays.asList(
                                "OOO",
                                "OOO",
                                "OOO")),
                Arguments.of(
                        Arrays.asList(
                                "OOO",
                                "OOO",
                                "OOO"), 1, 1,
                        Arrays.asList(
                                "OOO",
                                "OO.",
                                "OOO")),
                Arguments.of(
                        Arrays.asList(
                                "OOO",
                                "OOO",
                                "OOO"), 2, 2,
                        Arrays.asList(
                                "OOO",
                                "OOO",
                                "OOO"))
        );
    }

    @ParameterizedTest
    @MethodSource
    void testDenoteRightBomb(List<String> grid, int row, int column, List<String> expected) {
        // given

        // when
        List<String> actual = TheBombermanGame.denoteRightBomb(grid, row, column);

        // then
        assertThat(actual, is(expected));
    }

    static Stream<Arguments> testDenoteTopBomb() {
        return Stream.of(
                Arguments.of(
                        Arrays.asList(
                                "OOO",
                                "OOO",
                                "OOO"), 0, 0,
                        Arrays.asList(
                                "OOO",
                                "OOO",
                                "OOO")),
                Arguments.of(
                        Arrays.asList(
                                "OOO",
                                "OOO",
                                "OOO"), 1, 1,
                        Arrays.asList(
                                "O.O",
                                "OOO",
                                "OOO")),
                Arguments.of(
                        Arrays.asList(
                                "OOO",
                                "OOO",
                                "OOO"), 2, 2,
                        Arrays.asList(
                                "OOO",
                                "OO.",
                                "OOO"))
        );
    }

    @ParameterizedTest
    @MethodSource
    void testDenoteTopBomb(List<String> grid, int row, int column, List<String> expected) {
        // given

        // when
        List<String> actual = TheBombermanGame.denoteTopBomb(grid, row, column);

        // then
        assertThat(actual, is(expected));
    }

    static Stream<Arguments> testDenoteBottomBomb() {
        return Stream.of(
                Arguments.of(
                        Arrays.asList(
                                "OOO",
                                "OOO",
                                "OOO"), 2, 2,
                        Arrays.asList(
                                "OOO",
                                "OOO",
                                "OOO")),
                Arguments.of(
                        Arrays.asList(
                                "OOO",
                                "OOO",
                                "OOO"), 1, 1,
                        Arrays.asList(
                                "OOO",
                                "OOO",
                                "O.O")),
                Arguments.of(
                        Arrays.asList(
                                "OOO",
                                "OOO",
                                "OOO"), 0, 0,
                        Arrays.asList(
                                "OOO",
                                ".OO",
                                "OOO"))
        );
    }

    @ParameterizedTest
    @MethodSource
    void testDenoteBottomBomb(List<String> grid, int row, int column, List<String> expected) {
        // given

        // when
        List<String> actual = TheBombermanGame.denoteBottomBomb(grid, row, column);

        // then
        assertThat(actual, is(expected));
    }

    static Stream<Arguments> testDenoteCentreBomb() {
        return Stream.of(
                Arguments.of(
                        Arrays.asList(
                                "OOO",
                                "OOO",
                                "OOO"), 2, 2,
                        Arrays.asList(
                                "OOO",
                                "OOO",
                                "OO.")),
                Arguments.of(
                        Arrays.asList(
                                "OOO",
                                "OOO",
                                "OOO"), 1, 1,
                        Arrays.asList(
                                "OOO",
                                "O.O",
                                "OOO")),
                Arguments.of(
                        Arrays.asList(
                                "OOO",
                                "OOO",
                                "OOO"), 0, 0,
                        Arrays.asList(
                                ".OO",
                                "OOO",
                                "OOO"))
        );
    }

    @ParameterizedTest
    @MethodSource
    void testDenoteCentreBomb(List<String> grid, int row, int column, List<String> expected) {
        // given

        // when
        List<String> actual = TheBombermanGame.denoteCentreBomb(grid, row, column);

        // then
        assertThat(actual, is(expected));
    }

    static Stream<Arguments> testDenoteBomb() {
        return Stream.of(
                Arguments.of(
                        Arrays.asList(
                                "OOO",
                                "OOO",
                                "OOO"), 2, 2,
                        Arrays.asList(
                                "OOO",
                                "OO.",
                                "O..")),
                Arguments.of(
                        Arrays.asList(
                                "OOO",
                                "OOO",
                                "OOO"), 1, 1,
                        Arrays.asList(
                                "O.O",
                                "...",
                                "O.O")),
                Arguments.of(
                        Arrays.asList(
                                "OOO",
                                "OOO",
                                "OOO"), 0, 0,
                        Arrays.asList(
                                "..O",
                                ".OO",
                                "OOO"))
        );
    }

    @ParameterizedTest
    @MethodSource
    void testDenoteBomb(List<String> grid, int row, int column, List<String> expected) {
        // given

        // when
        List<String> actual = TheBombermanGame.denoteBomb(grid, row, column);

        // then
        assertThat(actual, is(expected));
    }
}