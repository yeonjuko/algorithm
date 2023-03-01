package Programmers.lv0;

public class 개미군단 {
    class Solution {
        public int solution(int hp) {
            int answer = (hp/5) + (hp%5/3) + (hp%5%3);
            return answer;
        }
    }
}
