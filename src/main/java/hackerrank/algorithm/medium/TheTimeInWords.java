package hackerrank.algorithm.medium;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class TheTimeInWords {

    // Complete the timeInWords function below.
    static String timeInWords(int h, int m) {
        // modify minute
        int minute = modifyMinuteToString(m);
        // get minute String
        String minuteStr = generateMinutesString(minute);
        // get prePosition String
        String preposition = buildPreposition(m);
        // modify hour
        int hour = modifyHourToString(h, m);
        // get hour String
        String hourStr = generateHourString(hour);
        // get o` clock String
        String oclock = generateOclockString(m);

        String result = minuteStr + " " + preposition + " " + hourStr + " " + oclock;
        return result.trim();
    }

    static String buildPreposition(int m) {
        if (m == 0) {
            return "";
        } else if (1 <= m && m <= 30) {
            return "past";
        } else {
            return "to";
        }
    }

    static String generateHourString(int h) {
        String[] hourStrings = {"twelve", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve"};
        return hourStrings[h];
    }

    static String generateMinutesString(int m) {
        final String[] numNames = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen", "eighteen", "nineteen",
                "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine",
                "half"};

        String minute = "";

        if (m == 1) {
            minute = " minute";
        } else if (m % 15 > 0) {
            minute = " minutes";
        }

        return numNames[m] + minute;
    }

    static String generateOclockString(int m) {
        return m == 0 ? "o' clock" : "";
    }

    static int modifyMinuteToString(int m) {
        if (30 < m) {
            m = 60 - m;
        }
        return m;
    }

    static int modifyHourToString(int h, int m) {
        if (m > 30) {
            h++;
        }
        return h % 12;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
