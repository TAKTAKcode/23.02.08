package com.tak.study;

import java.util.Scanner;

public class Answer10807 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //첫번째 줄 : 두번째 줄에 입력할 정수의 갯수 (두번째 줄 입력 시 반복할 횟수)
        int a = sc.nextInt();

        //두번째 줄 : 두번째 줄의 정수를 담을 배열
        int arr[] = new int[a];
        //두번째 줄 입력
        for (int i = 0; i < a; i++) {
            arr[i]  = sc.nextInt();
        }

        //세번째 줄 : 두번째 줄의 정수들 중 찾을 정수 입력
        int v = sc.nextInt();
        //세번째 줄에 입력한 정수가 두번째 줄에 몇 개 존재하는지. 담을 변수 선언
        int cnt = 0;
        //세번째 줄 : 두번째 줄에 입력한 정수를 확인을 위해 반복 (세번째 줄에 입력한 찾을 정수와 대조 작업하여 if문(일치시) cnt에 갯수 추가)
        for (int j = 0; j < a; j++) {
            if (arr[j] == v) {
                cnt++;
            }

        }

        //세번째 줄에서 입력한 찾을 정수가 두번째 줄에 몇개 있는지 갯수 출력
        System.out.println(cnt);

    }

}
