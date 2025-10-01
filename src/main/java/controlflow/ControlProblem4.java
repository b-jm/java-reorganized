package controlflow;

public class ControlProblem4 {
    public static void main(String[] args) {
        // 문제 4: 짝수 단만 출력하기 (중첩 for, continue)
        for(int dan = 2; dan < 10; dan++) {
            if(dan % 2 != 0) {
                continue;
            }

            System.out.printf("--- %d단 ---\n", dan);
            for(int i = 1; i < 10; i++){
                System.out.printf("%d * %d = %d\n", dan, i, dan * i);
            }
        }
    }
}
