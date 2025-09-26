package controlflow;

public class ControlFlow {

    public static void main(String[] args) {

        // if / if-else / else
        // score = 85이므로 "우수: B"가 출력
        int score = 85;

        if (score >= 90) {
            System.out.println("수우미양가: A");
        } else if (score >= 80) {
            System.out.println("우수: B");
        } else if (score >= 70) {
            System.out.println("보통: C");
        } else {
            System.out.println("노력 필요");
        }

        // switch / case
        // day = 3이므로 dayName = "수요일" 출력
        int day = 3;
        String dayName;

        switch (day) {
            case 1:
                dayName = "월요일";
                break;
            case 2:
                dayName = "화요일";
                break;
            case 3:
                dayName = "수요일";
                break;
            default:
                dayName = "알 수 없는 요일";
                break;
        }

        System.out.println(dayName);

        // for
        // 1, 2, 3, 4, 5까지 반복하면서 "반복 번호: i"를 출력
        for (int i = 1; i <= 5; i++) {
            System.out.println("반복 번호: " + i);
        }

        // while
        int i = 1;
        while (i <= 5) {
            System.out.println("while 반복: " + i);
            i++;  // 증감 안 하면 무한 루프 됨!
        }

        // do-while
        int i2 = 1;
        do {
            System.out.println("do-while 반복: " + i2);
            i2++;
        } while (i2 <= 5);

        // break
        for (int i3 = 1; i3 <= 10; i3++) {
            if (i3 == 5) {
                break;  // i가 5일 때 반복문 종료
            }
            System.out.println(i3);
        }
        // 결과: 1 2 3 4

        // continue
        for (int i4 = 1; i4 <= 10; i4++) {
            if (i4 % 2 == 0) {
                continue;  // 짝수면 아래 줄 건너뛰고 다음 반복
            }
            System.out.println(i4);  // i가 홀수일 때만 출력
        }
        // 결과: 1 3 5 7 9
    }

    // return
    public static int sum(int a, int b) {
        if (a < 0 || b < 0) {
            return -1;  // 잘못된 값이면 바로 종료
        }
        return a + b;
    }
}
