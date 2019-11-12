package hackerrank.algorithm.medium;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class BiggerIsGreaterTest {

    static Stream<Arguments> testBiggerIsGreater() {
        return Stream.of(
                Arguments.of("ab", "ba"),
                Arguments.of("bb", "no answer"),
                Arguments.of("hefg", "hegf"),
                Arguments.of("dhck", "dhkc"),
                Arguments.of("dkhc", "hcdk"),
                Arguments.of("zyyxwwtrrnmlggfeb", "no answer"),
                Arguments.of("zzyyxxxxxwwwwwvvvvutttttsssssrrrrqqqppponnnnmmmmllkkjjjjiiggffffffeedddddbbbbbba", "no answer"),
                Arguments.of("dmsym", "dmyms")
        );
    }

    @MethodSource
    @ParameterizedTest
    void testBiggerIsGreater(String w, String expected) {
        // given
        // when
        String actual = BiggerIsGreater.biggerIsGreater(w);
        // then
        assertThat(actual, is(expected));
    }

    @Test
    void testBiggerIsGreater2() throws IOException {
        // given
        File inputFile = new File("./src/test/resources/hackerrank/algorithm/medium/BiggerIsGreater/input01.txt");
        BufferedReader inputFileBufferedReader = new BufferedReader(new FileReader(inputFile));
        File outputFile = new File("./src/test/resources/hackerrank/algorithm/medium/BiggerIsGreater/output01.txt");
        BufferedReader outputFileBufferedReader = new BufferedReader(new FileReader(outputFile));

        String w;
        String expected;
        while ((w = inputFileBufferedReader.readLine()) != null) {
            expected = outputFileBufferedReader.readLine();
            // when
            String actual = BiggerIsGreater.biggerIsGreater(w);
            // then
            assertThat(actual, is(expected));
        }
    }

    static Stream<Arguments> testCharsSort() {
        return Stream.of(
                Arguments.of("ba".toCharArray(), "ab".toCharArray()),
                Arguments.of("badcgfekhji".toCharArray(), "abcdefghijk".toCharArray())
        );
    }

    @MethodSource
    @ParameterizedTest
    void testCharsSort(char[] chars, char[] expected) {
        // given
        // when
        BiggerIsGreater.charsSort(chars);
        // then
        assertThat(chars, is(expected));
    }
}