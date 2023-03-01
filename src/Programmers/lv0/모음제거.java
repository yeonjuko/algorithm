package Programmers.lv0;

public class 모음제거 {
    class Solution {
        public String solution(String my_string) {
            String answer = "";
            answer = my_string.replaceAll("a|e|i|o|u", "");
            return answer;
        }
    }
}
