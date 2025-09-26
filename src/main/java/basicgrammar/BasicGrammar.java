package basicgrammar;

import java.util.Scanner;

public class BasicGrammar {

    public static void main(String[] args) {

        // 변수의 선언과 초기화
        // 선언
        int age;
        String name;

        // 초기화
        int Age = 25;
        String Name = "홍길동";

        // 선언 후 나중에 초기화
        int height;
        height = 175;

        // 리터럴은 무엇인가? -> 위의 height에 들어간 175란 '값'이다.

        // 연산자
        // 실수라면 자료형 타입을 double로 주기 (int 대신 -> double)
        int a = 20;
        int b = 10;

        int sum = a + b;       // 30
        int diff = a - b;      // 10
        int mul = a * b;       // 200
        int div = a / b;       // 2 (정수 나눗셈)
        int rem = a % b;       // 0 (나머지)

        boolean check = (a > b);   // true
        boolean both = (a > 10 && b < 15); // true

        // 형 변환
        // 자동 형 변환
        int x = 10;
        double y = x;

        // 강제 형 변환
        double z = 3.55;
        int i = (int) z;    // 결과는 3, 소수점은 버린다.

        // 기본 입출력
        // 출력
        System.out.println("Hello Java!");
        System.out.println("나이: ");
        System.out.println(25);
        System.out.printf("이름: %s, 점수: %d\n", "이순신", 95);

        // 연산자에서 실습한 내용 출력하기
        System.out.printf("sum: %d, diff: %d, mul: %d, div: %d, rem: %d \n", sum, diff, mul, div, rem);

        // 입력
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 입력: ");
        int num = scanner.nextInt();

        System.out.print("문자열 입력: ");
        String text = scanner.next();

        System.out.println("입력한 정수: " + num);
        System.out.println("입력한 문자열: " + text);

        scanner.close();

        // 배열
        // 선언
        int[] nums;           // 배열 변수 선언
        // 초기화 (크기 지정)
        nums = new int[5];    // 정수 5개를 저장할 수 있는 배열 생성

        // 선언 + 초기화 동시에
        int[] nums2 = new int[3];

        // 선언 + 초기화 + 값 지정
        int[] nums3 = {10, 20, 30};

        // 요소 접근 & 길이
        int x2 = nums3[1];      // 배열의 인덱스 1번 요소: 20
        nums3[2] = 100;        // 인덱스 2번 요소를 100으로 변경

        int len = nums3.length;  // 배열의 길이: 3

        // 문자열
        String s = "Hello";
        s = s + " World";  // 실제론 새로운 문자열이 만들어져서 s가 그걸 참조

        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("Java");
        // toString()으로 String으로 변환 가능
        String result = sb.toString();  // "Hello Java"

        // 예제: 학생 이름 배열 + 점수 출력
        String[] names = {"Alice", "Bob", "Charlie"};
        int[] scores = {85, 90, 78};

        for (int i2 = 0; i2 < names.length; i2++) {
            System.out.printf("%s 님의 점수는 %d점입니다.\n", names[i2], scores[i2]);
        }

        // 문자열 조작 예: 전체 문자열 한 줄 만들기
        StringBuilder sb2 = new StringBuilder();
        for (int i3 = 0; i3 < names.length; i3++) {
            sb.append(names[i3]).append("(").append(scores[i3]).append(") ");
        }
        System.out.println("학생 정보: " + sb.toString());
    }
}
