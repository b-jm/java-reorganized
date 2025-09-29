package oop;

import java.util.Scanner;

public class ProblemAnswer {

    public static void printGreeting(String name, int age) {
        System.out.printf("안녕하세요, %s님! 올해 %d살이시군요.", name, age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 문제 1: 인사말 출력 메서드 (정의, 호출, 매개변수)
        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();

        printGreeting(name, age);
    }
}
