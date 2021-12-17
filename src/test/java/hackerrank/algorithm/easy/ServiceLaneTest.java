package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class ServiceLaneTest {

    static Stream<Arguments> testServiceLane() {
        return Stream.of(
                Arguments.of(8,
                        Arrays.asList(2, 3, 1, 2, 3, 2, 3, 3),
                        Arrays.asList(Arrays.asList(0, 3), Arrays.asList(4, 6),
                                Arrays.asList(6, 7), Arrays.asList(3, 5), Arrays.asList(0, 7)),
                        Arrays.asList(1, 2, 3, 2, 1))
        );
    }

    @ParameterizedTest
    @MethodSource
    void testServiceLane(int n, List<Integer> width, List<List<Integer>> cases, List<Integer> expected) {
        // given

        // when
        List<Integer> actual = ServiceLane.serviceLane(n, width, cases);

        // then
        assertThat(actual, is(expected));
    }
}