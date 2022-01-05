package BaekJoon.base;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Q8393 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int sum = 0;

        if (1<=n && n<=10000){
            for (int i = 0;i<=n;i++){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
