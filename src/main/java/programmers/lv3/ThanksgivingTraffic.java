package programmers.lv3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author Seunghyun Kim
 * @since 2020-05-13
 */
public class ThanksgivingTraffic {
    private final static long MILLISECOND = 1000000;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

    public int solution(String[] lines) {
        // lines를 해당 시간에 + or - SortedMap으로 만들기
        SortedMap<LocalDateTime, Integer> lineMap = new TreeMap<>();

        // line 파싱
        for (String line : lines) {

            // 로그 시작시간 구하기
            LocalDateTime startTime = getStartTime(line);
            // 로그 시작시간 입력 (특정 시간에 로그의 변동 사항 기록)
            lineMap.put(startTime, lineMap.getOrDefault(startTime, 0) + 1);

            // 로그 종료시간 구하기
            LocalDateTime endTime = getEndTime(line);
            // 로그 종료시간 입력 (특정 시간에 로그의 변동 사항 기록)
            lineMap.put(endTime, lineMap.getOrDefault(endTime, 0) - 1);
        }
        int conLogs = 0;
        int max = 0;

        for (Integer logCount : lineMap.values()) {
            conLogs += logCount;
            max = max < conLogs ? conLogs : max;
        }
        int answer = max;
        return answer;
    }

    private LocalDateTime getStartTime(String line) {
        String[] time = line.split("\\s");
        long duration = (long) (durationConvertToDouble(time[2]) * 1000 * MILLISECOND);
        // 시작시간 = 종료시간 - duration + 1 millisecond
        return parseTime(time[0] + " " + time[1]).minusNanos(duration).plusNanos(1 * MILLISECOND);
    }

    private double durationConvertToDouble(String duration) {
        return Double.parseDouble(duration.split("s")[0]);
    }

    private LocalDateTime parseTime(String dateTime) {
        return LocalDateTime.parse(dateTime, formatter);
    }

    private LocalDateTime getEndTime(String line) {
        String[] time = line.split("\\s");
        // 종료시간 = 종료시간 + 1초 (종료된 후 1초가 지나야 동시처리 카운팅에서 소멸되기 때문에)
        return parseTime(time[0] + " " + time[1]).plusNanos(1000 * MILLISECOND);
    }

}
