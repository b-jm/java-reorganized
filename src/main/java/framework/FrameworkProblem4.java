package framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // compareTo 메서드 오버라이딩 (학번 기준)
    @Override
    public int compareTo(Student other) {
        // this.id가 other.id보다 작으면 음수, 크면 양수, 같으면 0을 반환
        return this.id - other.id;
    }

    // 객체를 쉽게 출력하기 위해 toString() 오버라이딩
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}

public class FrameworkProblem4 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "김철수"));
        students.add(new Student(1, "박영희"));
        students.add(new Student(2, "이민준"));

        System.out.println("정렬 전: " + students);

        // Collections.sort() 호출 시 Student 클래스의 compareTo 메서드가 사용됨
        Collections.sort(students);

        System.out.println("정렬 후: " + students);
    }
}
