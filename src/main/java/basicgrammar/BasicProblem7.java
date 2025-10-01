package basicgrammar;

import java.util.Scanner;

public class BasicProblem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
