package framework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 문제 3: 단어장 만들기 (Map)
public class FrameworkProblem3 {
    public static void main(String[] args) {
        // 키(영어 단어)와 값(뜻)이 모두 String인 HashMap 생성
        Map<String, String> dictionary = new HashMap<>();

        // put() 메서드로 단어와 뜻 저장
        dictionary.put("apple", "사과");
        dictionary.put("banana", "바나나");
        dictionary.put("car", "자동차");
        dictionary.put("java", "자바");

        // 사용자 입력을 받기 위한 Scanner 준비
        Scanner scanner = new Scanner(System.in);
        System.out.print("찾고 싶은 영단어를 입력하세요: ");
        String word = scanner.nextLine();

        // get() 메서드로 사용자가 입력한 단어(키)에 해당하는 뜻(값)을 찾음
        String meaning = dictionary.get(word);

        // 단어 존재 여부 확인 후 결과 출력
        if (meaning != null) { // 키에 해당하는 값이 있으면 뜻을 출력
            System.out.println("뜻: " + meaning);
        } else { // 키에 해당하는 값이 없으면(null이면) 메시지 출력
            System.out.println("사전에 없는 단어입니다.");
        }

        scanner.close(); // 스캐너 리소스 정리
    }
}
