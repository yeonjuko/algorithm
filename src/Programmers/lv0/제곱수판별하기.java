package Programmers.lv0;

public class 제곱수판별하기 {
    class Solution {
        public int solution(int n) {
            int answer = (Math.sqrt(n)%1==0)?1:2;
            return answer;
        }
    }
}
