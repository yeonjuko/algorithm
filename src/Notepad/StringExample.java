package Notepad;

public class StringExample {
    public static void main(String[] args) {
        String text1 = "집에 가고 싶어 ";
        String text2 = "집에 있지만";

        // 1. concat 활용
        String result1 = text1.concat(text2);
        System.out.println("1 : " + result1);

        // 2. + 연산자 활용
        String result2 = text1 + text2;
        System.out.println("2 : " + result2);

        // 3. StringBuffer와 append() 활용
        /**
         * StringBuffer : String 변수의 불변성 때문에 사용
         *  한번 선언된 String 변수는 그 내용이 변하지 않음
         *  내부적으로 새로운 String 객체를 생성해 텍스트를 붙임
         *  (new 객체 선언으로 인한 메모리 낭비)
         *  결과적으로 String 임시 객체로 생성을 방지하고 메모리를 절약하기 위해 사용
         */
        StringBuffer sb = new StringBuffer();
        sb.append(text1).append(text2);
        System.out.println("3 : " + sb);
    }
}
