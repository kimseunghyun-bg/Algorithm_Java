package programmers.lv2;

public class CompressString {
    public int solution(String s) {
        int answer = s.length();

        for (int i = 0; i < s.length() / 2 + 1; i++) {
            String[] split = s.split("(?<=\\G.{" + i + "})");
            String compressRslt = "";
            int count = 1;
            String std = "";
            for (String value : split) {
                if (std.isEmpty() || !std.equals(value)) {
                    String preStr = (count > 1 ? String.valueOf(count) : "") + std;
                    compressRslt += preStr;
                    std = value;
                    count = 1;
                } else {
                    count++;
                }
            }
            String preStr = (count > 1 ? String.valueOf(count) : "") + std;
            compressRslt += preStr;
            answer = Math.min(answer, compressRslt.length());
        }
        return answer;
    }
}
