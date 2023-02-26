package ex01decryption;

public class Q1 {
    public static void main(String[] args) {
        String[] text = {
                "   + -- + - + -   ",
                "   + --- + - +   ",
                "   + -- + - + -   ",
                "   + - + - + - +   "
        };

        solution(text);
    }


    public static void solution(String[] text) {
        for (int i = 0; i < text.length; i++) {
            /**
             * 문자열마다 공백 제거 : strip()
             * 문자 대치 : replace
             * 0과 1의 정수로 문자를 바꿈 = 이진수 = parseInt 메소드 사용시 2라는 별도의 인수 추가
             * 얻은 값을 char형으로 변환해 아스키코드로 인코딩
             */
            int n = Integer.parseInt(text[i].strip().replace(" ", "").replace("+", "1").replace("-", "0"), 2);
            text[i] = String.valueOf((char)n);
            System.out.print(text[i]);
        }
    }
}
