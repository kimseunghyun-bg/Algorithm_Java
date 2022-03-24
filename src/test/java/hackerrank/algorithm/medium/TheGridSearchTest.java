package hackerrank.algorithm.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class TheGridSearchTest {

    static Stream<Arguments> testGridSearch() {
        return Stream.of(
                Arguments.of(
                        Arrays.asList(
                                "7283455864",
                                "6731158619",
                                "8988242643",
                                "3830589324",
                                "2229505813",
                                "5633845374",
                                "6473530293",
                                "7053106601",
                                "0834282956",
                                "4607924137"
                        ),
                        Arrays.asList(
                                "9505",
                                "3845",
                                "3530"
                        ), "YES"),
                Arguments.of(
                        Arrays.asList(
                                "400453592126560",
                                "114213133098692",
                                "474386082879648",
                                "522356951189169",
                                "887109450487496",
                                "252802633388782",
                                "502771484966748",
                                "075975207693780",
                                "511799789562806",
                                "404007454272504"
                        ),
                        Arrays.asList(
                                "99",
                                "99"
                        ), "NO"),
                Arguments.of(
                        Arrays.asList(
                                "34889246430321978567",
                                "58957542800420926643",
                                "35502505614464308821",
                                "14858224623252492823",
                                "72509980920257761017",
                                "22842014894387119401",
                                "01112950562348692493",
                                "16417403478999610594",
                                "79426411112116726706",
                                "65175742483779283052",
                                "89078730337964397201",
                                "13765228547239925167",
                                "26113704444636815161",
                                "25993216162800952044",
                                "88796416233981756034",
                                "14416627212117283516",
                                "15248825304941012863",
                                "88460496662793369385",
                                "59727291023618867708",
                                "19755940017808628326"
                        ),
                        Arrays.asList(
                                "1641",
                                "7942",
                                "6517",
                                "8907",
                                "1376",
                                "2691",
                                "2599"
                        ), "NO"),
                Arguments.of(
                        Arrays.asList(
                                "7652157548860692421022503",
                                "9283597467877865303553675",
                                "4160389485250089289309493",
                                "2583470721457150497569300",
                                "3220130778636571709490905",
                                "3588873017660047694725749",
                                "9288991387848870159567061",
                                "4840101673383478700737237",
                                "8430916536880190158229898",
                                "8986106490042260460547150",
                                "2591460395957631878779378",
                                "1816190871689680423501920",
                                "0704047294563387014281341",
                                "8544774664056811258209321",
                                "9609294756392563447060526",
                                "0170173859593369054590795",
                                "6088985673796975810221577",
                                "7738800757919472437622349",
                                "5474120045253009653348388",
                                "3930491401877849249410013",
                                "1486477041403746396925337",
                                "2955579022827592919878713",
                                "2625547961868100985291514",
                                "3673299809851325174555652",
                                "4533398973801647859680907"
                        ),
                        Arrays.asList(
                                "5250",
                                "1457",
                                "8636",
                                "7660",
                                "7848"
                        ), "YES"),
                Arguments.of(
                        Arrays.asList(
                                "1111221111",
                                "1111111111",
                                "1111111111",
                                "2221111111",
                                "1111111222",
                                "1111111111",
                                "1111111111",
                                "1111111111",
                                "1111111111",
                                "1111122111"
                        ),
                        Arrays.asList(
                                "1111",
                                "1111",
                                "1111",
                                "1111",
                                "1111",
                                "1111",
                                "1111",
                                "1111"
                        ), "YES"),
                Arguments.of(
                        Arrays.asList(
                                "999999",
                                "121211"
                        ),
                        Arrays.asList(
                                "99",
                                "11"
                        ), "YES")
        );
    }

    @ParameterizedTest
    @MethodSource
    void testGridSearch(List<String> g, List<String> p, String expected) {
        // given

        // when
        String actual = TheGridSearch.gridSearch(g, p);

        // then
        assertThat(actual, is(expected));
    }

    static Stream<Arguments> testIsPattern() {
        return Stream.of(
                Arguments.of(
                        Arrays.asList(
                                "7283455864",
                                "6731158619",
                                "8988242643",
                                "3830589324",
                                "2229505813",
                                "5633845374",
                                "6473530293",
                                "7053106601",
                                "0834282956",
                                "4607924137"
                        ),
                        4,
                        3,
                        Arrays.asList(
                                "9505",
                                "3845",
                                "3530"
                        ), true),
                Arguments.of(
                        Arrays.asList(
                                "7283455864",
                                "6731158619",
                                "8988242643",
                                "3830589324",
                                "2229505813",
                                "5633845374",
                                "6473530293",
                                "7053106601",
                                "0834282956",
                                "4607924137"
                        ),
                        5,
                        3,
                        Arrays.asList(
                                "9505",
                                "3845",
                                "3530"
                        ), false)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testIsPattern(List<String> g, int lineIdx, int charIdx, List<String> p, boolean expected) {
        // given

        // when
        boolean actual = TheGridSearch.isPattern(g, lineIdx, charIdx, p);

        // then
        assertThat(actual, is(expected));
    }
}