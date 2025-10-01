package exception;

import java.lang.Exception;

public class ExceptionProblem4 {
    // 문제 4: 은행 계좌 출금 (사용자 정의 예외)
    // java.lang.Exception을 상속
    static class InsufficientBalanceException extends Exception {
        public InsufficientBalanceException(String message) {
            super(message);
        }
    }

    static class BankAccount {
        private int balance;

        public BankAccount(int balance) {
            this.balance = balance;
        }

        public void withdraw(int amount) throws InsufficientBalanceException {
            if (this.balance < amount) {
                throw new InsufficientBalanceException("잔액이 부족합니다. (현재 잔액: " + this.balance + "원)");
            }
            this.balance -= amount;
            System.out.println(amount + "원 출금 완료. (남은 잔액: " + this.balance + "원)");
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(10000);

        try {
            System.out.println("15000원 출금을 시도합니다...");
            account.withdraw(15000);
        } catch (InsufficientBalanceException e) {
            System.out.println("예외 처리: " + e.getMessage());
        }
    }
}
