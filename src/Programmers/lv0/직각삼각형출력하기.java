package Programmers.lv0;

import java.util.Scanner;

public class 직각삼각형출력하기 {
    public class Solution {
        public void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for(int i=0; i<n ; i++){
                for(int j=0; j<=i ; j++){
                    System.out.print("*");
                }
                System.out.println();

            }

        }
    }
}
