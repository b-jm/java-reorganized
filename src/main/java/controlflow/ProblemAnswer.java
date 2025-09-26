package controlflow;

import java.util.Scanner;

public class ProblemAnswer {

    public static void main(String[] args) {

        // 문제 1: 3과 5의 배수 찾기 (for, if-else)
        for(int i = 1; i < 101; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }


        // 문제 2: 간단한 ATM 만들기 (while, switch, break)
        Scanner scanner = new Scanner(System.in);

        int credit;
        int withdraw;
        int balance = 0;
        boolean flag = true;

        /* while(true) 활용하는 방법
        while(true) {
            ....
            if(choice == 4) { // 종료 조건을 먼저 확인
                System.out.println("프로그램을 종료합니다.");
                break; // break로 while 루프 자체를 탈출
            }

            switch (choice) {
                case 1, 2, 3은 동일
                case 4는 위 if문에서 처리했으므로 필요 없음
            }
        }
         */

        while(flag) {
            System.out.println("-----------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔액조회 | 4.종료");
            System.out.println("-----------------------------");

            System.out.print("선택> ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("예금액> ");
                    credit = scanner.nextInt();
                    balance += credit;
                    break;

                case 2:
                    System.out.print("출금액> ");
                    withdraw = scanner.nextInt();
                    if (balance >= withdraw) {
                        balance -= withdraw;
                    } else {
                        System.out.println("잔액이 부족합니다.");
                    }
                    break;

                case 3:
                    System.out.printf("잔액> %d\n",  balance);
                    break;

                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    flag = false;
                    break;
            }
        }


        // 문제 3: 숫자 맞추기 게임 (do-while, if, break)
        int randomNum = (int) (Math.random() * 100 + 1);
        int inputNum = 0;

        System.out.println("1부터 100 사이의 숫자를 맞춰보세요.");

        do {
            System.out.print("숫자 입력: ");
            inputNum = scanner.nextInt();

            if(randomNum > inputNum) {
                System.out.println("더 큰 숫자입니다.");
            } else if(randomNum < inputNum) {
                System.out.println("더 작은 숫자입니다.");
            } else {
                System.out.println("정답입니다!");
                break;
            }

        } while (randomNum != inputNum);


        // 문제 4: 짝수 단만 출력하기 (중첩 for, continue)
        for(int dan = 2; dan < 10; dan++) {
            if(dan % 2 != 0) {
                continue;
            }

            System.out.printf("--- %d단 ---\n", dan);
            for(int i = 1; i < 10; i++){
                System.out.printf("%d * %d = %d\n", dan, i, dan * i);
            }
        }
    }
}
