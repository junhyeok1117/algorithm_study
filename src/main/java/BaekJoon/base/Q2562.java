package BaekJoon.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2562 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        List<Integer> array = new ArrayList<Integer>();

        int max = 0;
        int index = 0;
        int count = 0;

        for (int i=0;i<9;i++) {
            int num = scan.nextInt();
            count++;

            array.add(num);

            if (num > max) {
                max = num;
                index = count;
            }

        }
        System.out.println(max);
        System.out.println(index);
    }
}
