package framework;

import java.util.*;

class Person implements Comparable<Person> {
    String name;
    int age;

    Person(String n, int a) { name = n; age = a; }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age, o.age);  // 나이 기준 정렬
    }

    @Override
    public String toString() {
        return name + "(" + age + ")";
    }
}

public class Framework {
    // 통합 예제 코드
    public static void main(String[] args) {
        // List 예제
        List<Person> list = new ArrayList<>();
        list.add(new Person("Alice", 30));
        list.add(new Person("Bob", 25));
        list.add(new Person("Charlie", 28));

        Collections.sort(list);  // Comparable 구현 덕분에 정렬 가능
        System.out.println("정렬된 리스트: " + list);

        // Set 예제
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("apple");  // 중복 안 됨
        System.out.println("Set 내용: " + set);

        // Map 예제
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 90);
        map.put("Bob", 85);
        System.out.println("Bob의 점수: " + map.get("Bob"));

        // Iterator 예제
        Iterator<Person> it = list.iterator();
        System.out.print("Iterator로 출력: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // Comparator 예제 (이름 기준 정렬)
        Comparator<Person> nameComp = (a, b) -> a.name.compareTo(b.name);
        Collections.sort(list, nameComp);
        System.out.println("이름 기준 정렬: " + list);
    }
}
