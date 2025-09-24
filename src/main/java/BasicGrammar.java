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
    }
}
