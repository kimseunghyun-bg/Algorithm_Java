package hackerrank.algorithm.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class GradingStudentsTest {

    static Stream<Arguments> testGradingStudents() {
        return Stream.of(
                Arguments.of(new ArrayList<>(Arrays.asList(73, 67, 38, 33)), new ArrayList<>(Arrays.asList(75, 67, 40, 33)))
        );
    }

    @ParameterizedTest
    @MethodSource
    void testGradingStudents(List<Integer> grades, List<Integer> expected) {
        // given
        // when
        List<Integer> actual = GradingStudents.gradingStudents(grades);
        // then
        assertEquals(expected, actual);
    }
}