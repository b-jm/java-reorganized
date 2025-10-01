package oop;

public class OopProblem3 {
    // 문제 3: 계산기 오버로딩 (메서드 오버로딩)
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        int sumI = add(4, 4);
        double sumD = add(4.4, 4.4);

        System.out.println(sumI);
        System.out.println(sumD);
    }
}
