package BaekJoon.base;

import java.io.*;


public class Q10871 {//x보다 작은 수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strs = br.readLine().split(" ");
        int n = Integer.parseInt(strs[0]);
        int x = Integer.parseInt(strs[1]);

        String[] array = br.readLine().split(" ");

        for (int i = 0;i< n;i++) {
            if(Integer.parseInt(array[i])<x){
                System.out.print(array[i]);
            }
        }
    }
}