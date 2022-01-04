package BaekJoon.base;

import java.util.Scanner;

public class Q2588 {//세 자리수 곱 연산 순대로 출력
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        String B = scan.next();

        String[] str = new String[B.length()];

        for(int i= str.length -1;i>=0;i--){
            str[i]=Character.toString(B.charAt(i));
            int result = Integer.parseInt(str[i]);
            System.out.println(A * result);
        }
        System.out.println(A * Integer.parseInt(B));
    }
}
