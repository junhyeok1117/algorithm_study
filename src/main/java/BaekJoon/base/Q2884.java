package BaekJoon.base;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Q2884 {
    public static void main(String[] args) {//알람시계
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int m = scan.nextInt();

        if (h<=23 && m<=59){
            m = m-45;
            if(m<0){
                h = h-1;
                m = 60-abs(m);
                if (h<0){
                    h = 23;
                }
            }
            System.out.println(h +" "+ abs(m));
        }
    }
}
