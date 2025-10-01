package framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// 문제 1: 할 일 목록 관리하기 (List, Iterator)
public class FrameworkProblem1 {
    public static void main(String[] args) {
        // Scanner와 String을 담을 ArrayList 준비
        Scanner sc = new Scanner(System.in);
        List<String> toDoList = new ArrayList<>();

        // 사용자가 "끝"을 입력할 때까지 할 일 입력받기
        while (true) {
            System.out.print("할 일을 입력하세요 (종료는 '끝'): ");
            String task = sc.nextLine();

            if (task.equals("끝")) {
                break;
            }

            toDoList.add(task);
        }

        // 전체 할 일 목록 출력
        System.out.println("\n--- 전체 할 일 목록 ---");
        System.out.println(toDoList);

        // Iterator를 사용하여 "공부"가 포함된 할 일 삭제
        Iterator<String> iterator = toDoList.iterator();
        while (iterator.hasNext()) {
            String task = iterator.next();  // 다음 할 일을 가져옴
            if(task.contains("공부")) {
                iterator.remove();  // Iterator를 통해 안전하게 삭제
            }
        }

        // 최종 할 일 목록 출력
        System.out.println("\n--- 남은 할 일 목록 ---");
        System.out.println(toDoList);

        sc.close();
    }
}
