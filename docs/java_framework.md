# 컬렉션 프레임워크(Collection Framework)

---

### [예제 코드](../src/main/java/framework/framework.java)
- 컬렉션 프레임워크란?
- 주요 인터페이스 & 구현체
- List, Set, Map, Iterator
- Comparable vs Comparator
- 제네릭 컬렉션


---

### 1. 컬렉션 프레임워크란 무엇인가?
- 개념
  - 배열(Array)은 고정된 크기이고 자료형이 제한적이다.
  - 컬렉션(Collection)은 여러 객체를 저장하고 관리하기 위한 표준 틀(프레임워크)이다.
  - 데이터를 추가, 삭제, 탐색, 정렬 등 자주 쓰는 기능을 미리 구현해 둔 도구 상자 같은 것이다.
  - Java 공식 튜토리얼에서는 컬렉션 프레임워크를 “인터페이스 + 구현 + 알고리즘의 통합 아키텍처”라고 설명한다.

---

### 2. 주요 인터페이스 & 구현체
- 컬렉션 프레임워크의 핵심은 인터페이스를 통해 추상화하고, 여러 구현체를 자유롭게 선택할 수 있게 하는 거다.

---

#### ✅ List (순서 있고 중복 허용)
- List는 순서가 유지되는 컬렉션이고 중복 요소 허용된다.
- 구현체 예: ArrayList, LinkedList, Vector 등
- 인덱스 기반 접근 가능 (get(int index))
```
List<String> list = new ArrayList<>();
list.add("apple");
list.add("banana");
list.add("apple");  // 중복 허용
System.out.println(list.get(1));  // "banana"
```
> ArrayList는 내부적으로 배열로 관리 -> 인덱스 접근이 빠름  
LinkedList는 노드(앞/뒤 연결) 구조 -> 삽입/삭제가 중간에서 빠름

---

#### ✅ Set (집합, 순서 없음, 중복 불가)
- Set은 순서를 보장하지 않고, 중복을 허용하지 않는 컬렉션이다.
- 구현체 예: HashSet, TreeSet, LinkedHashSet 등
```
Set<Integer> set = new HashSet<>();
set.add(10);
set.add(20);
set.add(10);  // 이미 10이 있으므로 중복 추가 안 돼
System.out.println(set.size());  // 2
```
> HashSet은 빠른 해시 기반 접근  
TreeSet은 정렬된 순서 유지 (Comparable 또는 Comparator 필요)
LinkedHashSet은 입력 순서를 유지

---

#### ✅ Map (키-값 쌍 저장)
- Map은 키(key)와 값(value)을 쌍으로 저장하는 자료구조이다.
- 키는 유일해야 하고, 값을 키를 통해 꺼낼 수 있다.
- Map은 Collection 인터페이스의 자식은 아니다 (따로 존재).
```
Map<String, Integer> map = new HashMap<>();
map.put("Alice", 90);
map.put("Bob", 85);
int score = map.get("Alice");  // 90
```
> 구현체 예: HashMap, TreeMap, LinkedHashMap 등  
HashMap은 순서 없음, TreeMap은 키 정렬, LinkedHashMap은 삽입 순서 유지

---

#### ✅ Iterator (반복자)
- Iterator는 컬렉션의 요소들을 하나씩 순회할 수 있게 해 주는 도구야.
- iterator() 메서드를 호출해서 얻고, hasNext(), next(), remove() 등을 사용해.
```
List<String> list = new ArrayList<>(List.of("a", "b", "c"));
Iterator<String> it = list.iterator();
while (it.hasNext()) {
    String s = it.next();
    System.out.println(s);
}
```
> for-each 문은 내부적으로 Iterator를 사용하는 문법이야.

---

#### ✅ Comparable vs Comparator (정렬 기준 정의)
##### Comparable
- 객체 자신에 "기본 정렬 기준"을 정의할 때 사용한다.
- Comparable<T> 인터페이스를 구현하고, compareTo(T o) 메서드 구현
- 예: String 클래스가 Comparable 구현돼 있어서 String끼리 기본 정렬 가능
```
class Person implements Comparable<Person> {
    String name;
    int age;

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;  // 나이 기준 오름차순
    }
}
```

#### Comparator
- 클래스 외부에서 정렬 기준을 정의할 때 사용해.
- Comparator<T> 인터페이스 구현, compare(T a, T b) 메서드 구현
```
Comparator<Person> nameComparator = new Comparator<>() {
    @Override
    public int compare(Person a, Person b) {
        return a.name.compareTo(b.name);
    }
};
Collections.sort(personList, nameComparator);
```

---

#### ✅ 제네릭 컬렉션 (Generics & Collection<Type>)
- 컬렉션들은 제네릭(generic)을 사용해서 어떤 타입을 저장할지 미리 지정할 수 있다.
- 예: List<String>, Set<Integer>
- 이렇게 하면 잘못된 타입을 넣는 실수를 컴파일 시점에 잡을 수 있다.
```
List<String> names = new ArrayList<>();
names.add("Alice");
// names.add(10);  // 컴파일 오류! 타입이 맞지 않음
String s = names.get(0);  // 별도의 형 변환 없이 바로 String 타입
```
> 제네릭 없이 쓰면 List list = new ArrayList(); 이렇게 되고, Object 타입으로 받아야 해서 번거롭고 위험하다.

---

### 3. 주의사항 & 팁
- equals() 와 hashCode() 메서드는 특히 HashSet, HashMap 등을 쓸 때 중요해. 제대로 구현돼 있어야 중복 검사, 검색 등이 정확하게 동작한다.
- LinkedList와 ArrayList 선택은 상황에 따라 달라. 인덱스 접근이 많으면 ArrayList, 삽입/삭제가 많으면 LinkedList
- TreeSet, TreeMap 같이 정렬된 구현을 쓰려면 요소들이 Comparable 구현되어 있거나, Comparator 제공해야 한다.
- Iterator 사용하는 동안 컬렉션을 구조 변경하면 ConcurrentModificationException이 발생할 수 있다.
- 제네릭을 쓸 때는 와일드카드(?), 상한/하한 경계 등도 나중에 배우면 좋다.


---

### 🤔 문제를 누르면 답안이 나와요.

---

### [🏋️‍♂️ 문제 1: 할 일 목록 관리하기 (List, Iterator)](../src/main/java/framework/FrameworkProblem1.java)
학습 목표: ArrayList, Iterator 사용법, 제네릭(generic)

사용자로부터 여러 개의 할 일을 입력받아 List에 저장하고, 특정 조건의 할 일을 Iterator를 사용해 안전하게 삭제하는 프로그램을 작성하세요.

요구사항:

String 타입의 요소를 저장하는 ArrayList를 생성하세요.

사용자가 "끝"을 입력할 때까지 여러 개의 할 일을 입력받아 리스트에 추가하세요.

입력이 끝나면, for-each 문을 사용해 전체 할 일 목록을 한번 출력하세요.

**Iterator**를 사용하여 리스트를 순회하면서, 내용에 "공부"라는 단어가 포함된 할 일을 모두 삭제하세요.

삭제 작업 후, 최종 할 일 목록을 다시 출력하세요.

실행 예시:
```
할 일을 입력하세요 (종료는 '끝'): 자바 공부
할 일을 입력하세요 (종료는 '끝'): 저녁 식사
할 일을 입력하세요 (종료는 '끝'): 알고리즘 공부
할 일을 입력하세요 (종료는 '끝'): 운동하기
할 일을 입력하세요 (종료는 '끝'): 끝

--- 전체 할 일 목록 ---
[자바 공부, 저녁 식사, 알고리즘 공부, 운동하기]

--- 남은 할 일 목록 ---
[저녁 식사, 운동하기]
```

---

### [🏋️‍♂️ 문제 2: 로또 번호 추첨기 (Set)](../src/main/java/framework/FrameworkProblem2.java)
학습 목표: HashSet, Set의 중복 불가 특성 활용

1부터 45 사이의 중복되지 않는 로또 번호 6개를 자동으로 생성하여 출력하는 프로그램을 작성하세요.

요구사항:

Integer 타입의 요소를 저장하는 HashSet을 생성하세요.

while 루프를 사용하여 Set의 크기가 6이 될 때까지 반복하세요.

루프 안에서 Math.random()을 이용해 1부터 45 사이의 난수를 생성하여 Set에 추가하세요.

Set은 중복된 값을 허용하지 않으므로, 같은 숫자가 나와도 자동으로 무시됩니다.

최종적으로 생성된 6개의 로또 번호를 출력하세요. (Set은 순서를 보장하지 않습니다.)

실행 예시:
```
이번 주 로또 번호: [5, 12, 23, 25, 30, 41]
```
---

### [🏋️‍♂️ 문제 3: 단어장 만들기 (Map)](../src/main/java/framework/FrameworkProblem3.java)
학습 목표: HashMap, Map의 키-값(key-value) 구조

영단어와 그 뜻을 Map에 저장하고, 사용자가 영단어를 입력하면 해당 단어의 뜻을 알려주는 간단한 단어장을 만드세요.

요구사항:

키(key)와 값(value)이 모두 String 타입인 HashMap을 생성하세요.

put() 메서드를 사용해 3개 이상의 영단어와 뜻을 Map에 저장하세요. (예: "apple", "사과")

사용자에게 영단어를 입력받으세요.

get() 메서드를 사용해 사용자가 입력한 단어(키)에 해당하는 뜻(값)을 찾으세요.

단어가 Map에 존재하면 뜻을 출력하고, 존재하지 않으면 "사전에 없는 단어입니다."라고 출력하세요.

실행 예시:
```
찾고 싶은 영단어를 입력하세요: apple
뜻: 사과
```
---

### [🏋️‍♂️ 문제 4: 학생 목록 정렬하기 (Comparable)](../src/main/java/framework/FrameworkProblem4.java)
학습 목표: Comparable 인터페이스 구현, Collections.sort()

학생의 학번(id)과 이름(name)을 필드로 갖는 Student 클래스를 만들고, 학생 목록을 **학번 순(기본 정렬 기준)**으로 정렬하는 프로그램을 작성하세요.

요구사항:

Student 클래스를 정의하고, id와 name 필드를 추가하세요.

Student 클래스가 Comparable<Student> 인터페이스를 구현(implements)하도록 하세요.

compareTo() 메서드를 오버라이딩하여, 학번(id)을 기준으로 오름차순 정렬되도록 로직을 작성하세요.

main 메서드에서 ArrayList<Student>를 생성하고, 여러 명의 학생 객체를 순서 없이 추가하세요.

Collections.sort() 메서드를 사용하여 리스트를 정렬한 후, 결과를 출력하세요.

실행 예시:
```
정렬 전: [Student{id=3, name='김철수'}, Student{id=1, name='박영희'}, Student{id=2, name='이민준'}]
정렬 후: [Student{id=1, name='박영희'}, Student{id=2, name='이민준'}, Student{id=3, name='김철수'}]
```
---

### [🏋️‍♂️ 문제 5: 학생 목록을 다른 기준으로 정렬하기 (Comparator)](../src/main/java/framework/FrameworkProblem5.java)
학습 목표: Comparator 인터페이스 구현, sort 메서드의 두 번째 인자 활용

문제 4에서 만든 학생 목록을 이번에는 **이름 순(별도 정렬 기준)**으로 정렬하는 프로그램을 작성하세요.

요구사항:

문제 4의 Student 클래스를 그대로 사용합니다.

Comparator<Student> 인터페이스를 구현하는 StudentNameComparator 라는 새로운 클래스를 만드세요.

compare() 메서드를 오버라이딩하여, 학생의 이름(name)을 기준으로 오름차순(알파벳 순) 정렬되도록 로직을 작성하세요.

main 메서드에서 ArrayList<Student>를 생성하고 학생 객체들을 추가하세요.

List의 sort() 메서드 또는 Collections.sort()에 StudentNameComparator의 인스턴스를 두 번째 인자로 전달하여 리스트를 정렬하세요.

이름순으로 정렬된 결과를 출력하세요.

실행 예시:
```
이름순 정렬 후: [Student{id=3, name='김철수'}, Student{id=2, name='이민준'}, Student{id=1, name='박영희'}]
```