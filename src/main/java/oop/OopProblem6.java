package oop;

public class OopProblem6 {
    // 문제 6: 도형 클래스와 원 클래스 만들기
    static class Shape {
        public void draw() {
            System.out.println("도형을 그립니다.");
        }
    }

    static class Circle extends Shape {
        @Override
        public void draw() {
            System.out.println("원을 그립니다.");
        }
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();

        shape.draw();
        circle.draw();
    }
}
