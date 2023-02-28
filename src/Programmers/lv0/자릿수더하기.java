package Programmers.lv0;
import java.util.*;

public class 자릿수더하기 {
    /**
     * 자바 int 자릿수 구하기
     * 1. 나눗셈 연산을 이용해서 구하는 방법
     * 2. 문자열로 변환해서 구하는 방법
     * 3. Stream을 이용한 방법
     */

    class Solution {
        public int solution(int n) {
            int answer = 0;
            String temp = Integer.toString(n);
            int[] arr = new int[temp.length()];
            for(int i = 0; i<temp.length(); i++){
                arr[i] = temp.charAt(i) - '0';
            }
            answer = Arrays.stream(arr).sum();
            return answer;
        }
    }

}
