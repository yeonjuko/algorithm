package Programmers.lv0;

public class 세균증식 {
    class Solution {
        public int solution(int n, int t) {
            int answer = n * (int)Math.pow(2, t);
            return answer;
        }
    }
}
