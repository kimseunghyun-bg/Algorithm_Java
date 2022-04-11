package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class CavityMapTest {

    static Stream<Arguments> testCavityMap() {
        return Stream.of(
                Arguments.of(Arrays.asList("989", "191", "111"), Arrays.asList("989", "1X1", "111")),
                Arguments.of(Arrays.asList("1112", "1912", "1892", "1234"), Arrays.asList("1112", "1X12", "18X2", "1234"))
        );
    }

    @ParameterizedTest
    @MethodSource
    void testCavityMap(List<String> grid, List<String> expected) {
        // given

        // when
        List<String> actual = CavityMap.cavityMap(grid);

        // then
        assertThat(actual, is(expected));
    }
}