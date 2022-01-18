package BaekJoon.base;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Q1110 {//더하기 사이클
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();

        int count = 0;
        int a = 0;

        if (Integer.parseInt(num)<10){
            num = Integer.toString(a) + Integer.parseInt(num);
        }

        String[] strs = num.split("");

        while (true){
            int s = Integer.parseInt(strs[0]);
            int f = Integer.parseInt(strs[1]);

            int sum = s+f;
            String summ = Integer.toString(sum);
            String[] summ1;

            if (sum<10){

                summ = Integer.toString(a) + Integer.toString(sum);
                summ1 = summ.split("");
            }else {
                summ1 = Integer.toString(sum).split("");
            }
            String result = Integer.toString(f) + summ1[1];
            strs = result.split("");
            count++;

            if (Integer.parseInt(result) == Integer.parseInt(num)){
                System.out.println(count);
                break;
            }
        }
    }
}