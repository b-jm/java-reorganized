package oop;

import java.util.Scanner;

public class OopProblem2 {
    // 문제 2: 사각형 넓이 계산기 (반환값)
    // 가로, 세로 길이를 받아 넓이를 계산하고 double 타입으로 반환하는 메서드
    public static double calculateRectangleArea(double width, double height) {
        double area = width * height;

        return area;    // 1. 계산된 넓이(double)를 반환
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("사각형의 가로 길이를 입력하세요: ");
        double width = scanner.nextDouble();

        System.out.print("사각형의 세로 길이를 입력하세요: ");
        double height = scanner.nextDouble();

        // 2. 메서드를 호출하고, 반환된 값을 'result' 변수에 저장
        double result = calculateRectangleArea(width, height);

        // 3. main 메서드에서 저장된 값을 출력
        System.out.printf("사각형의 넓이: %.1f\n", result);

        scanner.close();
    }
}
