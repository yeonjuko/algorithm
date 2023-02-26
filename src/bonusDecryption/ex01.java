package bonusDecryption;

import java.util.HashMap;

public class ex01 {
    /**
     * 1. 암호학, 암호화, 키
     * 2. 치환암호, 전치암호, 블록암호, 스트림암호
     * 3. 해시함수
     * 4. 스테가노그래피, 워터마크, 핑거프린팅
     */

    public static void main(String[] args) {
        String text = "ABCABCFFDD";
        System.out.println(solution(text));
    }

    public static String solution(String text){
        HashMap<Character, String> map = new HashMap<Character, String>();
        map.put('A', "!");
        map.put('B', "@");
        map.put('C', "%");
        map.put('D', "J");
        map.put('E', "L");
        map.put('F', "K");

        String answer = "";
        for (int i = 0; i < text.length(); i++) {
            answer += map.get(text.charAt(i));
        }

        return answer;
    }




}
