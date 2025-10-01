package basicgrammar;

import java.util.Scanner;

public class BasicProblem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 문제 5. 이메일 주소 유효성 검사 (String 메서드)
        System.out.print("이메일 주소를 입력하세요: ");
        String email = scanner.nextLine();

        if(email.contains("@") && email.contains(".")){
            System.out.println("유효한 이메일 형식입니다.");
        } else {
            System.out.println("잘못된 이메일 형식입니다.");
        }
    }
}
