package Programmers.lv0;

public class 암호해독 {
        class Solution {
            public String solution(String cipher, int code) {
                String answer = "";
                for(int i=code-1; i<cipher.length(); i+=code){
                    answer += cipher.substring(i, i+1);
                }
                return answer;
            }
        }
    }

