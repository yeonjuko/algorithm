package Programmers.lv0;

public class 대문자와소문자 {
    class Solution {
        public String solution(String my_string) {
            String answer = "";
            for(int i=0; i<my_string.length(); i++){
                if(Character.isUpperCase(my_string.charAt(i))){
                    answer += Character.toLowerCase(my_string.charAt(i));
                }else{
                    answer += Character.toUpperCase(my_string.charAt(i));
                }
            }
            return answer;
        }
    }
}
