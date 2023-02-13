package com.tak.study;

import java.util.Scanner;

public class Answer2562 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //9번 반복.
        //[자릿수]와 [자릿수의 값] 구하기
        int[] arr = new int[9];

        int a = 0;

        for (int i = 1; i <= 9; i++) {

            arr[i] = sc.nextInt();

            if (a < arr[i]) {

                a = arr[i];
            }
        }


        System.out.println(a);


    }

}
