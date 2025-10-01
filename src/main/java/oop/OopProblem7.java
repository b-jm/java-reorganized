package oop;

public class OopProblem7 {
    // 문제 7: 동물 소리 시뮬레이터
    abstract static class Animal {
        public abstract void makeSound();
    }

    static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("멍멍!");
        }
    }

    static class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("야옹!");
        }
    }

    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat()};

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
