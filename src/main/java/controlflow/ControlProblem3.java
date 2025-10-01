package controlflow;

import java.util.Scanner;

public class ControlProblem3 {
    public static void main(String[] args) {
        // 문제 3: 숫자 맞추기 게임 (do-while, if, break)
        Scanner scanner = new Scanner(System.in);

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
    }
}
