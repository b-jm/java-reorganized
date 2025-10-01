package framework;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

// 문제 2: 로또 번호 추첨기 (Set)
public class FrameworkProblem2 {
    public static void main(String[] args) {
        // Integer 타입을 저장하는 HashSet 준비
        Set<Integer> lottoNumbers = new HashSet<>();

        // Random 객체를 사용하여 난수 생성
        Random random = new Random();

        // Set의 크기가 6이 될 때까지 반복
        while (lottoNumbers.size() < 6) {
            // 1부터 45 사이의 난수 생성
            int number = random.nextInt(45) + 1;

            // Set에 난수 추가 (중복된 값이면 자동으로 무시됨)
            lottoNumbers.add(number);
        }
        // 최종 로또 번호 출력
        System.out.println("이번 주 로또 번호: " + lottoNumbers);
    }
}
