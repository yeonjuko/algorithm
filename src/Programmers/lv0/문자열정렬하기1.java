package Programmers.lv0;

import java.util.Arrays;

public class 문자열정렬하기1 {
    class Solution {
        public int[] solution(String my_string) {
            return Arrays.stream(my_string.split(""))
                    .filter(i -> i.matches("[0-9]"))
                    .mapToInt(Integer::parseInt)
                    .sorted()
                    .toArray();
        }
    }
}