package javabasic;

import java.util.Arrays;
import java.util.Scanner;

public class Example04 {
    public static void main(String[] args) {
//      1
//      10개의 정수 값을 저장할 수 있는 배열을 생성하고,
//      1부터 10까지의 값을 배열에 저장한 후, 이를 출력하세요.
        int[] intArr = new int[10];
        for(int i = 0; i < intArr.length; i ++){
            intArr[i] = i;
            System.out.println(intArr[i]);
        }

//      2
//      사용자로부터 5명의 학생의 점수를 입력받아 배열에 저장한 다음,
//      평균 점수를 계산하여 출력하세요.
        Scanner scanner = new Scanner(System.in);
        int[] score = new int[5];
        int sumScore = 0;
        for (int i = 0; i < score.length; i ++) {
            System.out.println(i+1 + "번째 학생의 점수를 입력해주세요 : ");
            score[i] = scanner.nextInt();
            sumScore += score[i];
        }
        int avgScore = sumScore / score.length;
        System.out.println("학생들의 평균 점수는 " + avgScore + "점 입니다.");

//      3
//      주어진 정수 배열에서 최댓값과 최솟값을 찾아 출력하는 프로그램을 작성하세요.
        Arrays.sort(score);
        System.out.println("제일 높은 점수는 " + score[score.length -1] + "점 입니다.");
        System.out.println("제일 낮은 점수는 " + score[0] + "점 입니다.");
    }
}
