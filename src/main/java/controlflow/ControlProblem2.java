package controlflow;

import java.util.Scanner;

public class ControlProblem2 {
    public static void main(String[] args) {
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
    }
}
