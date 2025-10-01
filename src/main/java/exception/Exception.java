package exception;

import java.io.IOException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        // try … catch
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);  // 범위 벗어남 → 예외
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 범위를 벗어났습니다: " + e.getMessage());
        }

/*
        // finally
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            int x = sc.nextInt();
            System.out.println("입력한 값: " + x);
        } catch (Exception e) {
            System.out.println("잘못된 입력입니다.");
        } finally {
            if (sc != null) {
                sc.close();
            }
            System.out.println("Scanner가 닫혔습니다.");
        }
*/

        // throw
        int age = 0;
        if (age < 0) {
            throw new IllegalArgumentException("나이는 음수일 수 없습니다.");
        }
    }
}
