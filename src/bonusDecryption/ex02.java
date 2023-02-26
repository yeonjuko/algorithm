package bonusDecryption;

import java.util.HashMap;

public class ex02 {
    public static void main(String[] args) {
        String text = "!@%!@%KKJJ";
        System.out.println(solution(text));
    }

    public static String solution(String text){
        HashMap<Character, String> map = new HashMap<>();
        map.put('!', "A");
        map.put('@', "B");
        map.put('%', "C");
        map.put('J', "D");
        map.put('L', "E");
        map.put('K', "F");

        String answer = "";
        for(int i = 0; i<text.length(); i++){
            answer += map.get(text.charAt(i));
        }

        return answer;
    }
}
