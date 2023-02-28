package Programmers.lv0;
import java.util.*;
public class 중앙값구하기 {
    class Solution {
        public int solution(int[] array) {
            Arrays.sort(array);
            int answer = array[(array.length)/2];
            return answer;
        }
    }
}
