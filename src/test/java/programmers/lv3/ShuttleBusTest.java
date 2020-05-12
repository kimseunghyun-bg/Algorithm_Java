package programmers.lv3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalTime;
import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author Seunghyun Kim
 * @since 2020-05-12
 */
class ShuttleBusTest {

    static Stream<Arguments> testSolution() {
        return Stream.of(
                Arguments.of(1, 1, 5, new String[]{"24:00"}, "09:00"),
                Arguments.of(1, 1, 5, new String[]{"08:00", "08:01", "08:02", "08:03"}, "09:00"),
                Arguments.of(2, 10, 2, new String[]{"09:10", "09:09", "08:00"}, "09:09"),
                Arguments.of(2, 1, 2, new String[]{"09:00", "09:00", "09:00", "09:00"}, "08:59"),
                Arguments.of(1, 1, 5, new String[]{"00:01", "00:01", "00:01", "00:01", "00:01"}, "00:00"),
                Arguments.of(1, 1, 1, new String[]{"23:59"}, "09:00"),
                Arguments.of(10, 60, 45, new String[]{"23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59"}, "18:00")
        );
    }

    @ParameterizedTest
    @MethodSource
    void testSolution(int n, int t, int m, String[] timetable, String expected) {
        // given
        // when
        ShuttleBus shuttleBus = new ShuttleBus();
        String actual = shuttleBus.solution(n, t, m, timetable);
        // then
        assertThat(expected, is(actual));
    }

    static Stream<Arguments> testSetBusInfoList() {
        return Stream.of(
                Arguments.of(2, 10, 2, LocalTime.of(9, 10)),
                Arguments.of(2, 1, 2, LocalTime.of(9, 1)),
                Arguments.of(1, 1, 1, LocalTime.of(9, 0)),
                Arguments.of(10, 60, 45, LocalTime.of(18, 0))
        );
    }

    @ParameterizedTest
    @MethodSource
    void testSetBusInfoList(int times, int interval, int seats, LocalTime expectedLastBus) {
        // given
        ShuttleBus shuttleBus = new ShuttleBus();
        // when
        shuttleBus.setBusInfoList(times, interval, seats);
        // then
        List<Bus> busInfoList = shuttleBus.busInfoList;
        assertThat(busInfoList.size(), is(times));
        assertThat(busInfoList.get(busInfoList.size() - 1).getRemainSeats(), is(seats));
        assertThat(busInfoList.get(busInfoList.size() - 1).getDepartureTime(), is(expectedLastBus));
    }

    static Stream<Arguments> testConvertAndSortingTimeTable() {
        return Stream.of(
                Arguments.of(new String[]{"09:10", "09:09", "08:00"}, new LocalTime[]{LocalTime.of(8,0), LocalTime.of(9,9), LocalTime.of(9,10)})
        );
    }

    @ParameterizedTest
    @MethodSource
    void testConvertAndSortingTimeTable(String[] timeTable, LocalTime[] expected) {
        // given
        // when
        ShuttleBus shuttleBus = new ShuttleBus();
        LocalTime[] actaul = shuttleBus.convertAndSortingTimeTable(timeTable);
        // then
        assertThat(expected, is(actaul));
    }
}