package Programmers.lv0;

public class 숨어있는숫자의덧셈1 {
    class Solution {
        public int solution(String my_string) {
            int answer = 0;
            String edit_string = my_string.toLowerCase().replaceAll("[a-z]", "");
            String[] arr = edit_string.split("");
            for(int i = 0; i<arr.length; i++){
                answer += Integer.parseInt(arr[i]);
            }

            return answer;
        }
    }
}
