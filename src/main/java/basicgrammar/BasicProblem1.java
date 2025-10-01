package basicgrammar;

import java.util.Scanner;

public class BasicProblem1 {
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
    }
}
