package exception;

import java.lang.Exception;

public class ExceptionProblem2 {
    public static void main(String[] args) {
        // 문제 2: 자원 정리 보장하기 (try-catch-finally)
        try {
            System.out.println("자원을 엽니다.");
            System.out.println("데이터를 처리합니다.");

            throw new Exception("데이터 처리 중 오류 발생!");
        } catch (Exception e) {
            System.out.println("예외 발생: " + e.getMessage());

        } finally {
            System.out.println("자원을 닫습니다.");
        }
    }
}
