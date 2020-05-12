package programmers.lv1;

/**
 * @author Seunghyun Kim
 * @since 2020-05-13
 */
public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            String arr1str = Integer.toBinaryString(arr1[i]);
            while (arr1str.length() < n) {
                arr1str = "0" + arr1str;
            }
            char[] arr1Char = arr1str.toCharArray();

            String arr2str = Integer.toBinaryString(arr2[i]);
            while (arr2str.length() < n) {
                arr2str = "0" + arr2str;
            }
            char[] arr2Char = arr2str.toCharArray();

            answer[i] = "";
            for (int j = 0; j < arr1Char.length; j++) {
                if (arr1Char[j] == '1' || arr2Char[j] == '1') {
                    answer[i] = answer[i] + "#";
                } else {
                    answer[i] = answer[i] + " ";
                }
            }
        }
        return answer;
    }
}
