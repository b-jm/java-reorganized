package basicgrammar;

import java.util.Scanner;

public class BasicProblem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
    }
}
