package controlflow;

public class ControlProblem1 {
    public static void main(String[] args) {
        // 문제 1: 3과 5의 배수 찾기 (for, if-else)
        for(int i = 1; i < 101; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
