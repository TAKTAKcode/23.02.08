package com.tak.study;

import java.util.Arrays;
import java.util.Scanner;

public class Answer10818 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //입력한 N만큼의 정수 중 최소값, 최대값 구하기.

        //입력할 정수의 갯수 -> N
        int N = sc.nextInt();

        //정수갯수 N만큼의 배열 선언
        int[] arr = new int[N];

        //반복문 돌려서
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        //순차로 배열하기 위한 -> 오름차순
        Arrays.sort(arr);

        //오름차순으로 정렬 후 -> 첫번째 위치와, 마지막 자릿수 출력!
        System.out.println(arr[0] + " " + arr[N-1]);

    }

}
