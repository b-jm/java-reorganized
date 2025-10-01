package exception;

import java.util.Scanner;

public class ExceptionProblem1 {
    public static void main(String[] args) {
        // 문제 1: 0으로 나누기 (기본 try-catch)
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        try {
            int num3 = num1 / num2;
            System.out.println("결과: " + num3);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
    }
}
