package basicgrammar;

import java.util.Scanner;

public class BasicProblem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 문제 6. 좌석 예매 시스템 (2차원 배열, 중첩 for)
        char[][] seats = new char[3][5];

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = '□';
            }
        }

        while (true) {
            System.out.println("--- 현재 좌석 상태 ---");

            for (int i = 0; i < seats.length; i++) {
                for (int j = 0; j < seats[i].length; j++) {
                    System.out.print(seats[i][j] + " ");
                }
                System.out.println();
            }
            try {
                System.out.print("예매할 좌석의 행을 입력하세요 (종료는 q): ");
                String row = scanner.nextLine();

                if (row.equals("q")) {
                    System.out.println("예매를 종료합니다.");
                    break;
                }

                System.out.print("예매할 좌석의 열을 입력하세요: ");
                String col = scanner.nextLine();

                int rowNum = Integer.parseInt(row);
                int colNum = Integer.parseInt(col);

                if (rowNum < 1 || rowNum > seats.length || colNum < 1 || colNum > seats[0].length) {
                    System.out.println("잘못된 좌석 번호입니다. 범위 내에서 다시 입력해주세요.");
                    continue; // 다음 반복으로 넘어감
                }

                int rowIndex = rowNum - 1;
                int colIndex = colNum - 1;

                if (seats[rowIndex][colIndex] == '■') {
                    System.out.println("이미 예매된 좌석입니다.");
                } else {
                    seats[rowIndex][colIndex] = '■';
                    System.out.println("예매가 완료되었습니다.");
                }
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
            }
        }
    }
}
