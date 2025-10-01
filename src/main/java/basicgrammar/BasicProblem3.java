package basicgrammar;

import java.util.Scanner;

public class BasicProblem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 문제 3: 초(second)를 시/분/초로 변환하기
        System.out.print("시간(초)을 입력하세요: ");
        int totalSecond = scanner.nextInt();

        int second = totalSecond % 60;
        int minute = (totalSecond % 3600) / 60;
        int hour = totalSecond / 3600;

        System.out.println("--- 변환 결과 ---");
        System.out.printf("%d시간 %d분 %d초\n", hour, minute, second);
    }
}
