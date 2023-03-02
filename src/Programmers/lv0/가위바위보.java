package Programmers.lv0;

public class 가위바위보 {
    class Solution {
        public String solution(String rsp) {
            String answer = "";
            String[] arr = rsp.split("");
            String[] ans = new String[rsp.length()];
            for(int i = 0; i < arr.length; i++){
                if(arr[i].equals("2")){
                    ans[i] = "0";
                }else if(arr[i].equals("0")){
                    ans[i] = "5";
                }else if(arr[i].equals("5")) {
                    ans[i] = "2";
                }
            }

            answer = String.join("", ans);
            return answer;
        }
    }
}
