package oop;

public class Oop {

    // 메소드 정의
    public static int add(int a, int b) {
        return a + b;
    }

    public static void sayHello(String name) {
        System.out.println("안녕하세요, " + name + "님!");
    }

    // 재귀로 합 구하기
    public static int sumUpTo(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + sumUpTo(n - 1);
        }
    }   // sumUpTo(5) → 5 + 4 + 3 + 2 + 1 + 0 = 15

    // 배열 + 메소드 + 재귀 혼합
    public static int sumArray(int[] arr, int index) {
        if (index == arr.length) {
            return 0;  // 더 이상 요소가 없을 때 종료
        }
        return arr[index] + sumArray(arr, index + 1);
    }
    
    public static void main(String[] args) {
        // 메소드 호출
        int sum = add(3, 5);         // sum = 8
        sayHello("Alice");

        // 배열 + 메소드 + 재귀 혼합 출력
        int[] nums = {1, 2, 3, 4, 5};
        int total = sumArray(nums, 0);
        System.out.println("배열의 합: " + total);
    }
}
