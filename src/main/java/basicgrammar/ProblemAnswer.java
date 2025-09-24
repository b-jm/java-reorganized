package basicgrammar;

import java.util.Scanner;

public class ProblemAnswer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 문제 1: 자기소개 프로그램 만들기
        System.out.print("이름을 입력하세요: ");
        String name = scanner.next();

        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();

        System.out.print("키(cm)를 입력하세요: ");
        double height = scanner.nextDouble();

        System.out.print("당신은 프로그래머입니까? (true/false): ");
        boolean job = scanner.nextBoolean();

        System.out.println("");


        System.out.println("--- 자기소개 ---");
        System.out.printf("이름: %s\n", name);
        System.out.printf("나이: %d\n", age);
        System.out.printf("키: %.2f\n", height);
        System.out.printf("프로그래머 여부: %b\n", job);



        // 문제 2: 영수증 자동 계산 프로그램
        System.out.print("음식 가격을 입력하세요: ");
        int price = scanner.nextInt();

        System.out.print("할인율(%)을 입력하세요: ");
        int discountRate = scanner.nextInt();

        double discountAmount = price * (discountRate / 100.0);
        int finalPrice = price - (int)discountAmount;

        System.out.println("");

        System.out.println("--- 계산 결과 ---");
        System.out.printf("할인받은 금액: %.1f원\n", discountAmount);
        System.out.printf("최종 결제 금액: %d원\n", finalPrice);


        
        // 문제 3: 초(second)를 시/분/초로 변환하기
        System.out.print("시간(초)을 입력하세요: ");
        int totalSecond = scanner.nextInt();

        int second = totalSecond % 60;
        int minute = (totalSecond % 3600) / 60;
        int hour = totalSecond / 3600;

        System.out.println("--- 변환 결과 ---");
        System.out.printf("%d시간 %d분 %d초", hour, minute, second);
    }
}
