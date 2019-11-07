package hackerrank.algorithm.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class EncryptionTest {

    static Stream<Arguments> testEncryption() {
        return Stream.of(
                Arguments.of("haveaniceday", "hae and via ecy"),
                Arguments.of("feedthedog", "fto ehg ee dd"),
                Arguments.of("chillout", "clu hlt io")
        );
    }

    @MethodSource
    @ParameterizedTest
    void testEncryption(String str, String expected) {
        // given
        // when
        String actual = Encryption.encryption(str);
        // then
        assertThat(actual, is(expected));
    }

}