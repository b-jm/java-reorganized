package oop;

public class OopProblem5 {
    // 문제 5: 책(Book) 클래스 만들기
    static class Book {
        private String title;
        private String author;
        private int pageCount;

        public Book(String title, String author, int pageCount) {
            this.title = title;
            this.author = author;
            this.pageCount = pageCount;
        }

        public void displayInfo() {
            System.out.println("제목: " + this.title + ", 저자: " + this.author + ", 페이지: " + this.pageCount);
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("자바의 정석", "남궁성", 1022);
        Book book2 = new Book("클린 코드", "로버트 C. 마틴", 584);

        book1.displayInfo();
        book2.displayInfo();
    }
}
