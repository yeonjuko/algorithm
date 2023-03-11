package Programmers.lv0;

import java.util.Arrays;

public class n의배수고르기 {

    class Solution {
        public int[] solution(int n, int[] numList) {
            return Arrays.stream(numList).filter(value -> value % n == 0).toArray();
        }
    }
}
