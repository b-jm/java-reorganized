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

    }
}
