package BaekJoon.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int c = Integer.parseInt(bf.readLine());
        String[] array = new String[0];
        int n = 0;
        float sum = 0;
        float count = 0;


        for (int i = 0; i < c; i++) {
            array = bf.readLine().split(" ");
            n = Integer.parseInt(array[0]);

            for (int j = 1; j <= n; j++) {
                sum += Integer.parseInt(array[j]);
            }
            float arg = sum/n;

            for (int j = 1; j <= n; j++) {
                if (Integer.parseInt(array[j]) > arg){
                    count++;
                }
            }
            float result = (count/n) * 100;
            System.out.println(String.format("%.3f",result));
            sum = 0;
            count = 0;
        }
    }
}
