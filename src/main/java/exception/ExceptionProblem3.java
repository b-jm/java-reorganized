package exception;

import java.lang.Exception;
import java.util.Scanner;

public class ExceptionProblem3 {
    // 문제 3: 나이 검사기 (throws)
    public static void checkAge(int age) throws Exception{
        if (age < 19) {
            throw new Exception("미성년자는 접근할 수 없습니다.");
        } else {
            System.out.println("성인 인증이 완료되었습니다.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        try {
            checkAge(age);
        } catch(Exception e) {
            System.out.println("오류: " + e.getMessage());
        }
    }
}
