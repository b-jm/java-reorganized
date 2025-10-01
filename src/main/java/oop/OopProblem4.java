package oop;

import java.util.Scanner;

public class OopProblem4 {
    // 문제 4: 팩토리얼 계산하기 (재귀 함수)
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("팩토리얼을 계산할 숫자를 입력하세요: ");
        int n = scanner.nextInt();

        long result = factorial(n);
        System.out.printf("%d! = %d\n", n, result);
    }
}
