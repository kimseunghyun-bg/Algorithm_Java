package programmers.lv3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Seunghyun Kim
 * @since 2020-05-12
 */

/*
셔틀버스
카카오에서는 무료 셔틀버스를 운행하기 때문에 판교역에서 편하게 사무실로 올 수 있다. 카카오의 직원은 서로를 '크루'라고 부르는데, 아침마다 많은 크루들이 이 셔틀을 이용하여 출근한다.

이 문제에서는 편의를 위해 셔틀은 다음과 같은 규칙으로 운행한다고 가정하자.

셔틀은 09:00부터 총 n회 t분 간격으로 역에 도착하며, 하나의 셔틀에는 최대 m명의 승객이 탈 수 있다.
셔틀은 도착했을 때 도착한 순간에 대기열에 선 크루까지 포함해서 대기 순서대로 태우고 바로 출발한다. 예를 들어 09:00에 도착한 셔틀은 자리가 있다면 09:00에 줄을 선 크루도 탈 수 있다.
일찍 나와서 셔틀을 기다리는 것이 귀찮았던 콘은, 일주일간의 집요한 관찰 끝에 어떤 크루가 몇 시에 셔틀 대기열에 도착하는지 알아냈다. 콘이 셔틀을 타고 사무실로 갈 수 있는 도착 시각 중 제일 늦은 시각을 구하여라.

단, 콘은 게으르기 때문에 같은 시각에 도착한 크루 중 대기열에서 제일 뒤에 선다. 또한, 모든 크루는 잠을 자야 하므로 23:59에 집에 돌아간다. 따라서 어떤 크루도 다음날 셔틀을 타는 일은 없다.

입력 형식
셔틀 운행 횟수 n, 셔틀 운행 간격 t, 한 셔틀에 탈 수 있는 최대 크루 수 m, 크루가 대기열에 도착하는 시각을 모은 배열 timetable이 입력으로 주어진다.

0 ＜ n ≦ 10
0 ＜ t ≦ 60
0 ＜ m ≦ 45
timetable은 최소 길이 1이고 최대 길이 2000인 배열로, 하루 동안 크루가 대기열에 도착하는 시각이 HH:MM 형식으로 이루어져 있다.
크루의 도착 시각 HH:MM은 00:01에서 23:59 사이이다.

https://programmers.co.kr/learn/courses/30/lessons/17678
 */
public class ShuttleBus {

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
    List<Bus> busInfoList;
    int curBusIndex = 0;

    public String solution(int n, int t, int m, String[] timetable) {
        // 콘은 00:00에 나와서 줄 서야 한다. - 초기화
        String answer = "00:00";
        // 버스 타임테이블 초기화
        setBusInfoList(n, t, m);
        // 크루 타임테이블 localTime 변환 및 내림차순 정렬
        LocalTime[] crewTimetable = convertAndSortingTimeTable(timetable);
        // n번째 셔틀버스의 시간을 확인한다. - 버스 초기화


        for (LocalTime crewTime : crewTimetable) {
            // 크루가 나온 시간과 버스 출발시간, 자리 비교
            if (!getCurrentBus().getDepartureTime().isBefore(crewTime) && getCurrentBus().getRemainSeats() > 0) {
                // n번째 탑승하는 크루의 시간을 확인하고 1분 먼저 기다린다.
                answer = crewTime.minusMinutes(1).format(formatter);
                // n번째 버스에 크루를 태운다.
                getCurrentBus().occupySeat();
            } else {
                while (hasNextBus()) {
                    nextBux();
                    if (!getCurrentBus().getDepartureTime().isBefore(crewTime)){
                        // n번째 탑승하는 크루의 시간을 확인하고 1분 먼저 기다린다.
                        answer = crewTime.minusMinutes(1).format(formatter);
                        // n번째 버스에 크루를 태운다.
                        getCurrentBus().occupySeat();
                        break;
                    }
                }
            }
        }

        // crew를 다 소모하고 마지막 버스가 있는지 확인한다.
        if (getCurrentBus().getRemainSeats() > 0) {
            answer = getCurrentBus().getDepartureTime().format(formatter);
        }

        while (hasNextBus()) {
            answer = nextBux().getDepartureTime().format(formatter);
        }
        return answer;
    }

    Bus nextBux() {
        curBusIndex++;
        return busInfoList.get(curBusIndex);
    }

    void setBusInfoList(int times, int interval, int seats) {
        busInfoList = new ArrayList<>();
        LocalTime firstBusTime = LocalTime.of(9, 0);
        for (int i = 0; i < times; i++) {
            busInfoList.add(new Bus(firstBusTime.plusMinutes(interval * i), seats));
        }
    }

    LocalTime[] convertAndSortingTimeTable(String[] timeTable) {
        LocalTime[] array = Arrays.stream(timeTable).filter(time -> !time.equals("24:00")).map(time -> LocalTime.parse(time)).toArray(LocalTime[]::new);
        Arrays.sort(array);
        return array;
    }

    boolean hasNextBus() {
        return curBusIndex + 1 < busInfoList.size();
    }

    Bus getCurrentBus() {
        return busInfoList.get(curBusIndex);
    }

}

class Bus {
    private int seats;
    private LocalTime departureTime;
    private int occupiedSeats = 0;

    public Bus(LocalTime departureTime, int seats) {
        this.departureTime = departureTime;
        this.seats = seats;
    }

    public void occupySeat() {
        occupiedSeats++;
    }

    public int getRemainSeats() {
        return seats - occupiedSeats;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }
}