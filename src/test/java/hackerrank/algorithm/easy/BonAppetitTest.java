package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BonAppetitTest {

    static Stream<Arguments> testCalCostPerPerson(){
        return Stream.of(
                Arguments.of(Arrays.asList(3, 10, 2, 9), 1, 7)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testCalCostPerPerson(List<Integer> bill, int exceptIdx, int expected) {
        int actual = BonAppetit.calCostPerPerson(bill, exceptIdx);
        assertEquals(expected, actual);
    }
}