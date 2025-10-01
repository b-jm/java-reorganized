package framework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Comparator<Student> 인터페이스를 구현하는 별도의 클래스 생성
class StudentNameComparator implements Comparator<Student> {
    // compare 메서드 오버라이딩 (이름 기준)
    @Override
    public int compare(Student s1, Student s2) {
        // String 클래스에 이미 구현된 compareTo를 사용해 이름순으로 비교
        return s1.getName().compareTo(s2.getName());
    }
}

public class FrameworkProblem5 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "김철수"));
        students.add(new Student(1, "박영희"));
        students.add(new Student(2, "이민준"));

        System.out.println("정렬 전: " + students);

        // 3. sort 메서드의 두 번째 인자로 정렬 기준(Comparator)을 전달
        students.sort(new StudentNameComparator());

        System.out.println("이름순 정렬 후: " + students);
    }
}
