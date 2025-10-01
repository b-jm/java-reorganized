# 📚 클래스와 객체

### [예제 코드](../src/main/java/oop/Oop.java)

- 메소드와 함수
- 클래스와 객체
- 상속과 다형성

---

### 메소드 & 함수
- 메소드 정의 & 호출
  - 메소드는 “작업 단위(함수 기능)”를 코드로 묶어 놓은 것
  - 반복되는 코드를 줄이고, 프로그램 구조를 깔끔하게 해준다.
  - 메소드는 매개변수(parameters / arguments) 를 받을 수 있고, 반환값(return value) 을 줄 수 있다.

문법 구조
```
public static 반환형 메소드이름(매개변수들) {
    // 로직
    return 값;  // 반환형이 void면 return 생략 가능 또는 그냥 return;
}
```

- 매개변수 vs 인수
  - 매개변수(parameter): 메소드 선언부에서 받는 변수
  - 인수(argument): 실제 메소드를 호출할 때 전달하는 값 
```
public static int square(int x) { ... }   // 여기 x는 매개변수
int result = square(4);                   // 여기 4는 인수
```

#### 📌 함수 vs 메서드 (자바 관점)
- 함수(Function):
  - “특정 작업을 수행하는 독립적인 코드 블록”
  - 입력(매개변수)을 받고, 처리해서, 결과(반환값)를 줄 수도 있다.
  - C, 파이썬 같은 언어에서는 함수가 독립적으로 존재할 수 있다.


- 메서드(Method):
  - 자바에서는 모든 함수가 클래스 안에 소속되어야 한다.
  - 그래서 자바에서는 “함수”라는 단어보다는 “메서드”라는 용어를 주로 사용한다.
  - 즉, 자바에서 함수 = 클래스 안에 있는 메서드라고 보면 된다.

✅ 자바에서 함수 개념이 들어가 있는 부분
> 메소드 정의하기 → 함수의 정의와 동일한 개념  
매개변수(parameter) → 함수에 값 전달하기  
반환값(return value) → 함수 실행 후 결과 받기  
재귀(recursion) → 함수가 자기 자신을 호출하는 개념  
즉, 함수의 일반적인 개념을 자바에서는 “메서드”라는 이름으로 구현하는 것이다.   


- 반환값 (return)
  - 메소드가 작업을 끝내고 결과를 알려줄 때 사용
  - 반환 타입이 int, String 등이라면 return 값; 있어야 한다.
  - void 타입이면 return 값 없이 작동
```
public static void printHello() {
    System.out.println("Hello");
    return;  // 선택적, 생략 가능
}

```

- 재귀 (Recursion)
  - 재귀 메소드는 메소드가 자기 자신을 호출하는 구조
  - 복잡한 문제를 비슷한 작은 문제로 나눠서 해결할 때 유용하다.

예: 팩토리얼 계산 (n! = n * (n-1)!)
```
public static int factorial(int n) {
    if (n == 0) {
        return 1;
    } else {
        return n * factorial(n - 1);
    }
}
```
> factorial(5)을 호출하면 내부적으로 5 * factorial(4) → 4 * factorial(3) … 이런 식으로 계속 내려감  
> 반드시 종료 조건(base case)이 필요해! 종료 조건 없으면 무한 호출돼서 스택 오버플로우 오류


- 주의사항 & 팁 (메소드 / 재귀)
> 메소드 이름은 의미 있게 지어야 해 (예: calculateSum, findMax)  
> 너무 깊은 재귀는 스택 오버플로우 위험 있으니 주의  
> 재귀보다 반복문이 더 효율적인 경우도 많아 → 필요한 경우에만 사용.  
> 메소드 안에서 전역 변수(클래스 변수)를 함부로 바꾸면 복잡해지니까 지역 변수 중심 사용 권장  
> 매개변수가 많으면 읽기 어렵고 관리하기 힘드니까 적절히 분리

---

### 클래스와 객체
- 클래스란? 🤔
  - 클래스는 객체를 만드는 청사진(설계도)이다.
  - 어떤 객체가 가져야 할 속성(필드 / 변수)과 동작(메서드 / 함수)을 정의해 놓는 틀이다.
  - 예를 들면, Car 클래스는 색상, 속도, 브랜드 같은 속성이 있고, 가속하다, 감속하다, 멈추다 같은 메서드가 있을 수 있다.


- 객체란? 🤔
  - 클래스라는 설계도로부터 실제로 만들어진 실체(instance)이다.
  - 그 객체는 클래스가 정의한 속성과 동작을 그대로 가질 수 있고, 고유한 상태(state)를 유지한다.
  - 여러 객체가 같은 클래스를 기반으로 만들어질 수 있음.

예시) 
```
// Car = 클래스
class Car {
    String color;
    int speed;

    void accelerate(int amount) {
        speed += amount;
    }

    void brake(int amount) {
        speed -= amount;
        if (speed < 0) speed = 0;
    }
}

public class Main {
    public static void main(String[] args) {
        // myCar = 객체
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.speed = 0;

        myCar.accelerate(50);
        System.out.println("현재 속도: " + myCar.speed);  // 50
        myCar.brake(20);
        System.out.println("현재 속도: " + myCar.speed);  // 30
    }
}
```

---

### ✅ 필드 / 메서드 / 접근제어자 / 캡슐화
#### 필드
- 클래스가 가지는 데이터(속성)이다.
- 객체가 상태를 유지하는 변수들이다.
- 예: String name; int age;

#### 메서드
- 클래스가 가진 동작이자 기능이다.
- 입력(매개변수)을 받아서 연산하고, 결과를 반환할 수도 있다(void인 경우도 있다).
- 예: void drive(int distance), int getSpeed() 등

#### 접근제어자 (Access Modifiers) & 캡슐화 (Encapsulation)
- 접근제어자는 필드나 메서드가 어디서 접근 가능할지를 제한하는 키워드이다.

| 접근제어자                      | 같은 클래스 | 같은 패키지 | 자식 클래스 | 외부 (다른 패키지)    |
| -------------------------- | ------ | ------ | ------ | -------------- |
| `public`                   | O      | O      | O      | O              |
| `protected`                | O      | O      | O      | X (같은 패키지면 가능) |
| (default, package-private) | O      | O      | X      | X              |
| `private`                  | O      | X      | X      | X              |

- 캡슐화는 데이터를 보호하고, 외부에서는 내부 구현 대신 **인터페이스(getter/setter 메서드 등)**를 통해 접근하게 하는 원칙이다.
- 보통 필드는 private으로 숨기고, public 메서드(getter, setter)를 제공해서 접근하게 많이 사용한다.

예)
```
class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
}
```
이렇게 하면 외부에서 name이나 age를 바로 바꿀 수 없고, setAge를 통해서만 적절한 값으로 바꾸게 할 수 있다.

---

### ✅ 생성자 / this / static / final
#### 생성자 (Constructor)
- 객체를 생성할 때 호출되는 특별한 메서드이다.
- 보통 필드를 초기화할 때 사용.
- 메서드와 달리 반환 타입이 없고, 클래스 이름과 같아야 함.
```
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// 사용
Person p = new Person("Alice", 20);
```
> 기본 생성자(default constructor): 파라미터 없는 생성자, 명시하지 않으면 자바가 자동으로 만들어준다.  
만약 하나 이상의 생성자를 정의하면, 자동 기본 생성자는 사라져. 필요하면 명시적으로 만들어야 한다.

#### this 키워드
- this는 자기 자신 객체를 가리키는 참조이다.
- 생성자나 메서드 안에서 같은 이름의 필드와 매개변수를 구분할 때 자주 사용된다.
```
public Person(String name, int age) {
    this.name = name;  // name(필드) = 매개변수 name
    this.age = age;
}
```
> 또 객체 자신을 다른 메서드 호출이나 반환값으로 넘길 때도 사용된다: return this;

#### static (정적 멤버)
- static 붙은 필드나 메서드는 클래스 단위의 것들이다, 객체마다 따로 만들어지지 않는다.
- 클래스 이름으로 접근 가능: ClassName.staticMethod()
- 예: Math.PI, Integer.parseInt(...) 등이 static 메서드 / 필드
```
class Counter {
    public static int count = 0;

    public Counter() {
        count++;
    }
}
```

#### final 키워드
- final은 “변경 불가능 / 확장 불가”의 의미다.
- final을 필드에 붙이면 한 번 값이 정해지면 못 바꾼다.
- final 메서드: 자식 클래스에서 오버라이딩 못 하게 막는다.
- final 클래스: 더 이상 확장할 수 없는 클래스 (서브클래스 만들 수 없음)
```
final class Utils {
    // ...
}

class A {
    public final void print() {
        System.out.println("Hello");
    }
}
class B extends A {
    // public void print() { ... }  // 이건 허용 안된다, final 때문에
}
```

---

### 상속과 다형성 (Inheritance & Polymorphism)
#### 상속 (Inheritance)
- 개념
  - 상위 클래스(부모, superclass)의 필드와 메서드를 하위 클래스(자식, subclass)가 물려받는 것이다.
  - 상속을 통해 코드 재사용성이 높아지고, 구조적으로 유연한 설계 가능

예시)
```
class Animal {
    String name;
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Buddy";   // Animal 필드 상속됨
        d.eat();            // Animal 메서드 상속됨
        d.bark();
    }
}
```


- 오버라이딩 (Overriding)
  - 부모 클래스의 메서드를 자식 클래스가 같은 시그니처(메서드 이름, 파라미터, 반환 타입 동일)로 재정의하는 것
  - @Override 어노테이션을 붙이는 게 좋다 (컴파일러가 실수를 잡아 줌)
```
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}
```

- 오버로딩(Overloading)
  - 같은 이름의 메서드를 파라미터 리스트가 다르게 여러 개 정의하는 것
  - 컴파일 시점에 어떤 메서드가 호출될지 결정됨 (정적 바인딩) 
```
class Calculator {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
    int add(int a, int b, int c) { return a + b + c; }
}
```

- 추상 클래스
  - 일부 메서드는 구현하지 않고 선언만 해두는 추상 메서드를 가질 수 있다.
  - abstract 키워드 붙인다.
  - 자식 클래스가 추상 메서드를 반드시 구현해 줘야 한다. (아니면 또 abstract 클래스가 돼야 함).
```
abstract class Animal {
    abstract void sound();  // 구현 없음

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}
```

- 인터페이스
  - 완전 추상 메서드 집합으로, 클래스가 이 인터페이스를 구현(implements)하면 메서드를 다 구현해야 한다.
  - 다중 상속이 불가능한 자바에서 인터페이스를 활용해서 “다중 구현” 가능
  - Java 8부터는 default 메서드나 static 메서드도 포함할 수 있어
```
interface Drawable {
    void draw();  // 추상 메서드
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Draw a circle");
    }
}
```

- instanceof 연산자
  - 객체가 어떤 클래스의 인스턴스인지 확인할 때 쓰는 키워드
  - 예: if (obj instanceof Dog) → obj가 Dog 타입이면 true
```
Animal a = new Dog();
if (a instanceof Dog) {
    System.out.println("a는 Dog 객체!");
}
```

---

#### 다형성 (Polymorphism)
- 다형성은 같은 메시지(메서드 호출)가 다른 객체에서 다르게 동작하는 능력이다.
- 즉, super 타입 참조가 여러 자식 객체를 가리킬 수 있고, 적절한 메서드를 실행하게 되는 것이다.
```
class Animal {
    void sound() {
        System.out.println("Some sound");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();  // Bark
        a2.sound();  // Meow
    }
}
```
> 이 예제에서 a1, a2는 Animal 타입이지만 실제로는 Dog, Cat 객체야. 호출된 sound() 메서드는 각 클래스의 구현에 따라 달라진다.  
이런 형태를 런타임 다형성 (Runtime Polymorphism) 또는 동적 바인딩이라고 한다.

> 오버로딩 + 오버라이딩 모두 다형성의 형태:   
오버로딩: 컴파일 타임 다형성 (Compile-time Polymorphism)    
오버라이딩: 런타임 다형성 (Runtime Polymorphism)

---

### 🤔 문제를 누르면 답안이 나와요.

---
### 🏋️‍♂️ [문제 1: 인사말 출력 메서드 (정의, 호출, 매개변수)](../src/main/java/oop/OopProblem1.java)
사용자의 이름(String)과 나이(int)를 매개변수로 받아, "안녕하세요, [이름]님! 올해 [나이]살이시군요." 라는 인사말을 출력하는 printGreeting 메서드를 작성하고 호출하세요.

요구사항:

메서드 이름은 printGreeting으로 하세요.

String 타입의 이름과 int 타입의 나이를 받는 두 개의 매개변수가 있어야 합니다.

이 메서드는 화면에 인사말을 출력하기만 하고, 별도의 값을 반환하지 않습니다 (void).

main 메서드에서 Scanner로 이름과 나이를 입력받은 후, printGreeting 메서드를 호출하여 결과를 확인하세요.

실행 예시:
```
이름을 입력하세요: 홍길동
나이를 입력하세요: 30

안녕하세요, 홍길동님! 올해 30살이시군요.
```

---

### 🏋️‍♂️ [문제 2: 사각형 넓이 계산기 (반환값)](../src/main/java/oop/OopProblem2.java)
가로 길이와 세로 길이를 매개변수로 받아 사각형의 넓이를 계산하고, 그 결과를 **반환(return)**하는 calculateRectangleArea 메서드를 작성하세요.

요구사항:

메서드 이름은 calculateRectangleArea로 하세요.

두 개의 double 타입 매개변수 (가로 width, 세로 height)를 받으세요.

계산된 넓이(가로 * 세로)를 double 타입으로 반환해야 합니다.

main 메서드에서 이 메서드를 호출하고, 반환받은 값을 변수에 저장한 뒤 출력하세요.

실행 예시:
```
사각형의 가로 길이를 입력하세요: 10.5
사각형의 세로 길이를 입력하세요: 5.0

사각형의 넓이: 52.5
```

---

### 🏋️‍♂️ [문제 3: 계산기 오버로딩 (메서드 오버로딩)](../src/main/java/oop/OopProblem3.java)
이름이 똑같은 add 메서드를 두 개 작성하여 메서드 오버로딩을 구현하세요.

정수(int) 2개를 매개변수로 받아 그 합을 반환하는 add 메서드

실수(double) 2개를 매개변수로 받아 그 합을 반환하는 add 메서드

요구사항:

두 메서드 모두 이름이 add여야 합니다.

매개변수의 타입과 개수에 따라 Java가 알아서 올바른 메서드를 호출하는지 확인하세요.

main 메서드에서 각각의 add 메서드를 호출하고 결과를 출력하여 오버로딩이 잘 동작하는지 보여주세요.

실행 예시 (별도 입력 없음):
```
정수 덧셈 결과: 8
실수 덧셈 결과: 8.8
```

---

### 🏋️‍♂️ [문제 4: 팩토리얼 계산하기 (재귀 함수)](../src/main/java/oop/OopProblem4.java)
숫자 n을 입력받아 n! (n 팩토리얼)을 계산하는 factorial 메서드를 **재귀(recursion)**를 사용하여 구현하세요. 팩토리얼은 n * (n-1) * (n-2) * ... * 1 입니다. (예: 5! = 5 * 4 * 3 * 2 * 1 = 120)

재귀 힌트:

종료 조건 (Base Case): n이 1 이하일 때, 팩토리얼은 1입니다. 이때 재귀 호출을 멈추고 1을 반환해야 합니다.

재귀 단계 (Recursive Step): n이 1보다 클 때, n * factorial(n - 1)을 반환해야 합니다.

요구사항:

메서드 이름은 factorial로 하세요.

int 타입 숫자 n을 매개변수로 받으세요.

계산된 팩토리얼 값을 int (또는 더 큰 수를 위해 long) 타입으로 반환하세요.

반복문(for, while)을 사용하지 않고, 메서드가 자기 자신을 호출하는 재귀 방식으로만 풀어야 합니다.

실행 예시:
```
팩토리얼을 계산할 숫자를 입력하세요: 5
5! = 120
```
---

### 🏋️‍♂️ [문제 5: 책(Book) 클래스 만들기](../src/main/java/oop/OopProblem5.java)
학습 목표: 클래스, 객체, 필드, 생성자, 메서드, 캡슐화(private), this  
Book이라는 클래스를 설계하고, 이 클래스를 바탕으로 여러 개의 책 객체를 생성하여 정보를 출력하는 프로그램을 작성하세요.

요구사항:  
Book 클래스를 정의하세요.  
다음과 같은 private 필드를 추가하세요.  
title (String, 제목)  
author (String, 저자)  
pageCount (int, 페이지 수)

생성자를 만드세요. 이 생성자는 제목, 저자, 페이지 수를 매개변수로 받아 각 필드를 초기화해야 합니다. (필드와 매개변수 이름이 같을 때 this 키워드를 사용하세요.)

책의 정보를 출력하는 public void displayInfo() 메서드를 만드세요.

main 메서드에서 Book 객체를 2개 이상 생성하고, 각 객체의 displayInfo() 메서드를 호출하여 정보를 확인하세요.

실행 예시:
```
제목: 자바의 정석, 저자: 남궁성, 페이지: 1022
제목: 클린 코드, 저자: 로버트 C. 마틴, 페이지: 584
```
---

### 🏋️‍♂️ [문제 6: 도형 클래스와 원 클래스 만들기](../src/main/java/oop/OopProblem6.java)
학습 목표: 상속, 메서드 오버라이딩

모든 도형의 기반이 되는 Shape 클래스와, 이를 상속받는 Circle 클래스를 만들어 다형성의 기초를 연습하세요.

요구사항:

Shape 클래스를 정의하고, "도형을 그립니다."라고 출력하는 draw() 메서드를 만드세요.

Shape 클래스를 상속하는 Circle 클래스를 정의하세요.

Circle 클래스에서 draw() 메서드를 오버라이딩하여 "원을 그립니다."라고 출력되도록 재정의하세요.

main 메서드에서 Shape 객체와 Circle 객체를 각각 생성하고, 두 객체의 draw() 메서드를 호출하여 결과가 어떻게 다른지 확인하세요.

실행 예시:
```
도형을 그립니다.
원을 그립니다.
```
---

### 🏋️‍♂️ [문제 7: 동물 소리 시뮬레이터](../src/main/java/oop/OopProblem7.java)
학습 목표: 추상 클래스, 다형성(Polymorphism)

'소리를 낸다'는 공통적인 특징을 가진 동물들을 모델링하여 다형성을 구현하세요.

요구사항:

Animal이라는 이름의 추상 클래스를 만드세요.

Animal 클래스 안에 내용이 없는 public abstract void makeSound(); 라는 추상 메서드를 선언하세요.

Animal을 상속받는 Dog 클래스와 Cat 클래스를 만드세요.

Dog과 Cat 클래스에서 makeSound() 메서드를 각각 "멍멍!"과 "야옹!"을 출력하도록 구현하세요.

main 메서드에서 Animal 타입의 배열을 생성하고, 그 안에 Dog 객체와 Cat 객체를 담으세요.

for문을 이용해 배열을 순회하면서 각 동물의 makeSound() 메서드를 호출하세요. (이것이 다형성의 핵심입니다.)

실행 예시:
```
멍멍!
야옹!
```

---

### 🏋️‍♂️ [문제 8: 날 수 있는 객체 시뮬레이터](../src/main/java/oop/OopProblem8.java)
학습 목표: 인터페이스, instanceof

'날 수 있다'는 행동의 규격(인터페이스)을 정의하고, 해당 규격을 따르는 객체들만 날게 만들어 보세요.

요구사항:

Flyable이라는 이름의 인터페이스를 만드세요.

Flyable 인터페이스 안에 public void fly(); 라는 추상 메서드를 선언하세요.

Bird 클래스와 Airplane 클래스를 만들고, 두 클래스 모두 Flyable 인터페이스를 **구현(implements)**하도록 하세요. 각 클래스의 fly() 메서드는 "새가 하늘을 납니다."와 "비행기가 하늘을 납니다."를 출력하도록 구현하세요.

Fish 클래스도 만드세요. 단, 이 클래스는 Flyable 인터페이스를 구현하지 않습니다.

main 메서드에서 Object 타입의 배열에 Bird, Airplane, Fish 객체를 모두 담으세요.

for문을 돌면서 배열의 각 객체가 Flyable 타입인지 instanceof 연산자로 확인하세요.

Flyable 타입이 맞다면, 해당 타입으로 형 변환한 뒤 fly() 메서드를 호출하세요.

실행 예시:
```
새가 하늘을 납니다.
비행기가 하늘을 납니다.
```