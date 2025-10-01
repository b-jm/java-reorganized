package basicgrammar;

import java.util.Scanner;

public class BasicProblem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 문제 4: 성적 분석 프로그램 (1차원 배열, for)
        int[] score = new int[5];
        int sum = 0;
        double avg = 0;

        for(int i = 0; i < score.length; i++){
            System.out.printf("%d번째 학생의 성적을 입력하세요: ", i + 1);
            score[i] = scanner.nextInt();
        }

        for(int arr : score){
            sum += arr;
        }

        avg = (double)sum / 5;

        System.out.println("");
        System.out.println("--- 성적 분석 결과 ---");
        System.out.printf("총점: %d\n", sum);
        System.out.printf("평균: %.1f\n", avg);
    }
}
