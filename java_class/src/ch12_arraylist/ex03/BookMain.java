package ch12_arraylist.ex03;

import java.util.ArrayList;
import java.util.List;

public class BookMain {
    public static void main(String[] args) {
        // Book 객체를 담기위한 bookList
        List<Book> bookList = new ArrayList<>();

        // 기본생성자로 Book 객체 생성 후 bookList에 추가
        Book book1 = new Book();
        book1.setId(1);
        book1.setBookTitle("고층 입원실의 갱스터 할머니");
        book1.setBookAuthor("양유진");
        book1.setBookPrice(18800);
        book1.setBookPublisher("21세기북스");
        bookList.add(book1);

        // 매개변수 있는 생성자로 Book 객체 생성 후 bookList에 추가
        Book book2 = new Book(2, "마흔에 읽는 쇼펜하우어", "강용수", 17000, "유노북스");
        bookList.add(book2);

        // for문을 이용하여 책 전체정보, 책제목 출력
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println("bookList.get(i) = " + bookList.get(i));
            System.out.println("bookList.get(i).getBookTitle() = " + bookList.get(i).getBookTitle());
        }

        // for each문을 이용하여 책 전체정보, 저자 출력
        for (Book book: bookList) {
            System.out.println("book = " + book);
            System.out.println("book.getBookAuthor() = " + book.getBookAuthor());
        }

        // 0번 인덱스에 담긴 책의 가격을 50000으로 수정
        bookList.get(0).setBookPrice(50000);
        // 1번 인덱스에 담긴 출판사 이름을 "안녕출판사"로 수정
        bookList.get(1).setBookPublisher("안녕출판사");

        for (Book book: bookList) {
            System.out.println("book = " + book);
        }
    }
}
