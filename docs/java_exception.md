# 예외 처리(Exception Handling)

---

### [예제 코드](../src/main/java/exception/exception.java)
- 예외(Exception)란?
- try / catch / finally 키워드
- throws & throw 키워드
- 사용자 정의 예외 (Custom Exception)

---

### 1. 예외(Exception)란 무엇인가?
- 예외는 프로그램이 정상적인 흐름을 벗어나는 비정상 상황을 가리킨다.
- 예: 0으로 나누기, 배열 범위 벗어나기, 파일 없음, 널 포인터역참조 등
- 예외가 발생하면 프로그램이 멈추기 쉽지만, 예외 처리를 하면 멈추지 않고 흐름을 제어할 수 있다.
- 자바에서는 Throwable 클래스 계층 아래에 Exception과 Error 등이 있고, 우리가 처리하는 건 보통 Exception 쪽이다.
- RuntimeException 계열 (예: NullPointerException, ArithmeticException)은 unchecked exception이라서 throws 선언 없이도 발생할 수 있다. 
- 일반 예외(checked exception)는 메서드 선언부에 throws로 표시해야 한다.
  
---

### 2. try / catch / finally 키워드
#### ✅ try … catch
- try 블록 안에는 예외가 발생할 가능성이 있는 코드를 둔다.
- catch 블록은 예외가 발생했을 때 어떻게 처리할지 코드 쓰는 곳이다.
- 여러 개의 catch 블록을 써서 서로 다른 종류의 예외를 따로 처리할 수 있다.
```
try {
    // 위험한 코드 (예: 배열 접근, 파일 열기, 나누기 등)
} catch (TypeOfException e) {
    // 예외 발생 시 실행할 코드
}
```

#### ✅ finally
- finally 블록은 try나 catch가 끝나든 예외가 발생하든 무조건 실행되는 부분이다.
- 보통 자원 정리(clean-up), 파일 닫기, 네트워크 연결 해제 등에 사용된다.
```
try {
    // 위험한 코드
} catch (Exception e) {
    // 처리
} finally {
    // 항상 실행되는 코드
}
```

---

### 3. throws & throw 키워드
#### ✅ throws
- 메소드 선언부에서 throws를 쓰면, 그 메소드가 예외를 발생시킬 가능성이 있음을 호출자에게 알리는 것이다.
- 즉, 예외 처리를 여기서 하지 않고 외부로 미룸 (위임).
```
public void readFile(String path) throws IOException {
    // 파일 읽기 코드, IOException이 발생할 수 있음
}
```
> 호출하는 쪽에서는 이 메서드를 호출할 때 try-catch로 잡거나, 또 throws로 넘겨야 함.

#### ✅ throw
- throw는 코드 중간에서 인위적으로 예외를 발생시키는 것이다.
- 예외 객체를 생성해서 throw new SomeException(...) 이렇게.
```
if (age < 0) {
    throw new IllegalArgumentException("나이는 음수일 수 없습니다.");
}
```
> throw 될 때, 그 위치에서 즉시 예외 발생 → 제어 흐름이 catch 쪽으로 넘어가거나, 호출자에게 예외가 전달된다.

---

### 4. 사용자 정의 예외 (Custom Exception)
- 기본으로 제공되는 예외(예: IOException, NullPointerException)만큼 다 포괄할 수는 없다.
- 그래서 개발자가 특정 상황에 맞는 예외 클래스를 직접 정의할 수 있다.
```
// 예외 클래스를 정의
public class MyCustomException extends Exception {
    public MyCustomException() {
        super();
    }
    public MyCustomException(String message) {
        super(message);
    }
}

// 예외를 던지고 처리하는 코드
public void doSomething(int value) throws MyCustomException {
    if (value < 0) {
        throw new MyCustomException("값은 음수가 될 수 없습니다: " + value);
    }
    // 정상 처리
}
```
> MyCustomException을 Exception 또는 RuntimeException을 상속받게 할 수 있고, 상황에 따라 checked/unchecked 예외로 설계 가능  
getMessage(), printStackTrace() 같은 메소드로 어디서 예외가 났는지 알 수 있다.

---

### 5. 전체 흐름 & 예외 전파
예외 처리 흐름은 다음처럼 된다:
1. try 블록 안 코드 실행
2. 예외 발생하면, 남은 try 코드 실행하지 않고 catch 블록 중 일치하는 타입을 찾음
3. 일치하는 catch가 있으면 그 블록 실행
4. finally가 있다면 그 블록 실행
5. 만약 catch도 없고, throws로 던졌다면 호출자 쪽으로 예외가 전달(propagation)됨
6. 최종적으로 처리되지 않으면 프로그램이 예외 메시지와 함께 종료돼

---

### 6. 주의사항 & 팁
- catch 블록은 구체적인 예외부터 처리하고, 일반 예외를 나중에 처리해야 함 (예: ArrayIndexOutOfBoundsException 먼저, Exception 나중).
- finally 블록에서 또 예외가 발생하면 원래 예외가 무시될 수 있음 — 조심해야 함.
  Stack Overflow
- try 블록 없이 catch / finally만 있으면 안 된다 (무조건 try랑 짝).
- 리소스 관리할 때는 try-with-resources 문법 사용하는 게 더 안전하고 깔끔하다 (자바 7 이후).
- 예외를 너무 많이 잡아서 원인이 사라지면 디버깅 힘들어지니까, 꼭 필요한 예외만 잡는 게 좋다.

---

### 🤔 문제를 누르면 답안이 나와요.

---

### 🏋️‍♂️ 문제 1: 0으로 나누기 (기본 try-catch)
학습 목표: try-catch, ArithmeticException

두 정수를 입력받아 나눗셈을 수행하는 프로그램을 작성하세요. 만약 사용자가 0으로 나누려고 시도하면, 예외를 처리하여 프로그램이 강제 종료되지 않도록 만드세요.

요구사항:

Scanner로 두 정수(나눠지는 수, 나누는 수)를 입력받으세요.

나눗셈을 실행하는 코드를 try 블록 안에 작성하세요.

catch 블록을 사용하여 ArithmeticException (0으로 나눌 때 발생하는 예외)을 잡으세요.

예외가 발생하면 "0으로 나눌 수 없습니다."라는 메시지를 출력하고, 예외가 발생하지 않으면 나눗셈 결과를 출력하세요.

실행 예시 1 (성공):
```
첫 번째 숫자를 입력하세요: 10
두 번째 숫자를 입력하세요: 2
결과: 5
```
실행 예시 2 (예외 발생):
```
첫 번째 숫자를 입력하세요: 10
두 번째 숫자를 입력하세요: 0
0으로 나눌 수 없습니다.
```

---

### 🏋️‍♂️ 문제 2: 자원 정리 보장하기 (try-catch-finally)
학습 목표: try-catch-finally

파일이나 네트워크 연결 같은 외부 자원을 사용하는 상황을 시뮬레이션하는 코드를 작성하세요. 작업 중 예외 발생 여부와 상관없이, 사용한 자원은 반드시 해제(close)되어야 합니다.

요구사항:

try 블록 안에서 "자원을 엽니다."와 "데이터를 처리합니다."를 순서대로 출력하세요.

데이터 처리 후, 강제로 예외를 발생시키세요. (throw new Exception("데이터 처리 중 오류 발생!");)

catch 블록에서 발생한 예외 메시지를 출력하세요.

finally 블록을 사용하여 "자원을 닫습니다."라는 메시지가 항상 출력되도록 만드세요.

실행 예시:
```
자원을 엽니다.
데이터를 처리합니다.
예외 발생: 데이터 처리 중 오류 발생!
자원을 닫습니다.
```

---

### 🏋️‍♂️ 문제 3: 나이 검사기 (throws)
학습 목표: throws, Checked Exception 처리

나이를 검사하는 메서드를 만들고, 이 메서드에서 특정 조건(미성년자)일 때 예외를 발생시키도록 하세요. 예외 처리는 이 메서드를 호출하는 쪽에서 책임지도록 만듭니다.

요구사항:

checkAge(int age) 라는 이름의 메서드를 만드세요.

이 메서드는 Exception을 발생시킬 수 있음을 메서드 시그니처에 throws 키워드로 명시해야 합니다.

메서드 안에서 age가 19보다 작으면, throw new Exception("미성년자는 접근할 수 없습니다."); 코드로 예외를 발생시키세요.

age가 19 이상이면 "성인 인증이 완료되었습니다."를 출력하세요.

main 메서드에서 checkAge 메서드를 호출하되, try-catch 블록으로 감싸서 예외를 처리하세요.

실행 예시:
```
나이를 입력하세요: 17
오류: 미성년자는 접근할 수 없습니다.
```

---

### 🏋️‍♂️ 문제 4: 은행 계좌 출금 (사용자 정의 예외)
학습 목표: 사용자 정의 예외 클래스 만들기 및 사용

잔액보다 많은 금액을 출금하려고 할 때 발생하는, InsufficientBalanceException이라는 이름의 사용자 정의 예외를 만들어 사용해 보세요.

요구사항:

Exception 클래스를 상속받는 InsufficientBalanceException 클래스를 만드세요. 이 클래스는 생성자에서 에러 메시지를 받아 부모 생성자로 넘겨주는 역할을 합니다.

BankAccount 클래스를 만들고, private int balance (잔액) 필드를 가지게 하세요.

withdraw(int amount) (출금) 메서드를 만드세요.

withdraw 메서드 안에서, 출금하려는 금액(amount)이 잔액(balance)보다 많으면 throw new InsufficientBalanceException("잔액이 부족합니다."); 코드로 직접 만든 예외를 발생시키세요.

main 메서드에서 BankAccount 객체를 생성하고 초기 잔액을 설정한 뒤, try-catch로 출금을 시도하여 예외 상황을 테스트하세요.

실행 예시:
```
출금을 시도합니다...
예외 처리: 잔액이 부족합니다.
```