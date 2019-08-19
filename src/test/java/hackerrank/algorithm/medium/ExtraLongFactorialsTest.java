package hackerrank.algorithm.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigInteger;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExtraLongFactorialsTest {

    static Stream<Arguments> testFactorial() {
        return Stream.of(
                Arguments.of(3, BigInteger.valueOf(6)),
                Arguments.of(4, BigInteger.valueOf(24))
        );
    }


    @MethodSource
    @ParameterizedTest
    void testFactorial(int n, BigInteger expected) {
        BigInteger actual = ExtraLongFactorials.factorial(n);
        assertEquals(expected, actual);
    }
}