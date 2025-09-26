package basicgrammar;

import java.util.Scanner;

public class ProblemAnswer {
    
    // 주석을 넣으면서 돌려보시면 편합니다.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
/*
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
*/


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
        System.out.printf("%d시간 %d분 %d초\n", hour, minute, second);



        // 문제 4: 성적 분석 프로그램 (1차원 배열, for)
        int[] score = new int[5];
        int sum = 0;
        double avg = 0;

        for(int i = 0; i < score.length; i++){
            System.out.printf("%d번째 학생의 성적을 입력하세요: ", i + 1);
            score[i] = scanner.nextInt();
        }

        for(int arr : score){
            sum += arr;
        }

        avg = (double)sum / 5;

        System.out.println("");
        System.out.println("--- 성적 분석 결과 ---");
        System.out.printf("총점: %d\n", sum);
        System.out.printf("평균: %.1f\n", avg);



        // 문제 5. 이메일 주소 유효성 검사 (String 메서드)
        System.out.print("이메일 주소를 입력하세요: ");
        String email = scanner.nextLine();

        if(email.contains("@") && email.contains(".")){
            System.out.println("유효한 이메일 형식입니다.");
        } else {
            System.out.println("잘못된 이메일 형식입니다.");
        }



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



        // 문제 7. 게시글 이어붙이기 (StringBuilder)
        StringBuilder sb = new StringBuilder();

        while(true) {
            System.out.print("문장을 입력하세요 (종료는 end): ");
            String answer = scanner.nextLine();

            if(answer.equals("end")) {
                break;
            }

            sb.append(answer).append(" ");
        }

        System.out.println("--- 완성된 문장 ---");
        System.out.println(sb.toString());
    }
}


