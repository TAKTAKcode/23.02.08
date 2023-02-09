package com.tak.study;

import java.util.Scanner;

public class Answer10871 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //입력할 것 : 정수 N 자리
        //기준이 되는 수 : num
        int N = sc.nextInt();

        //입력한 N만큼 반복되는 배열
        int[] arr = new int[N];

        //기준이 되는 수 num
        int num = sc.nextInt();

        //입력한 N만큼 반복하는 반복문
        for (int i = 0; i < N; i++) {

            //N의 자리에 입력받은 값을 넣는다.
            arr[i] = sc.nextInt();

        }

        //입력한 값 출력
        for (int i = 0; i < N; i++) {
            //if : 기준보다 입력한 수가 더 크면 출력
            if (num > arr[i]) {
                System.out.println(arr[i]);
            }
        }
    }

}
