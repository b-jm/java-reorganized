package oop;

public class OopProblem8 {
    // 문제 8: 날 수 있는 객체 시뮬레이터
    interface Flyable {
        void fly(); // 인터페이스 메서드는 public abstract가 기본이라 생략 가능
    }

    static class Bird implements Flyable {
        @Override
        public void fly() {
            System.out.println("새가 하늘을 납니다.");
        }
    }

    static class Airplane implements Flyable {
        @Override
        public void fly() {
            System.out.println("비행기가 하늘을 납니다.");
        }
    }

    static class Fish {
        public void swim() {
            System.out.println("물고기가 헤엄칩니다.");
        }
    }

    public static void main(String[] args) {
        Object[] objects = {new Bird(), new Airplane(), new Fish()};

        for(Object obj : objects){
            if (obj instanceof Flyable) {
                Flyable flyable = (Flyable)obj;
                flyable.fly();
            }
        }
    }
}
