package Programmers.lv0;

public class 특정문자제거하기 {
    class Solution {
        public String solution(String my_string, String letter) {
            String answer = "";
            answer = my_string.replace(letter, "").strip();
            return answer;
        }
    }
}
