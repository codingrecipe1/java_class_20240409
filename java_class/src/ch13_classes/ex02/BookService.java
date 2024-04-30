package ch13_classes.ex02;

import java.util.List;
import java.util.Scanner;

public class BookService {
    private BookRepository bookRepository = new BookRepository();
    Scanner scanner = new Scanner(System.in);

    public void save() {
        System.out.print("도서명: ");
        String bookTitle = scanner.next();
        System.out.print("저자: ");
        String bookAuthor = scanner.next();
        System.out.print("가격: ");
        int bookPrice = scanner.nextInt();
        System.out.print("출판사: ");
        String bookPublisher = scanner.next();
        BookDTO bookDTO = new BookDTO(bookTitle, bookAuthor, bookPrice, bookPublisher);
        boolean result = bookRepository.save(bookDTO);
        if (result) {
            System.out.println("등록 성공");
        } else {
            System.out.println("등록 실패");
        }
    }

    public void findAll() {
        List<BookDTO> bookDTOList = bookRepository.findAll();
        for (BookDTO bookDTO: bookDTOList) {
            System.out.println("bookDTO = " + bookDTO);
        }
    }

    public void findById() {
        System.out.print("조회 id: ");
        long id = scanner.nextLong();
        BookDTO bookDTO = bookRepository.findById(id);
        if (bookDTO != null) {
            System.out.println("bookDTO = " + bookDTO);
        } else {
            System.out.println("조회결과가 없습니다!");
        }
    }

    public void findByTitle() {
        System.out.print("도서명: ");
        String bookTitle = scanner.next();
        BookDTO bookDTO = bookRepository.findByTitle(bookTitle);
        if (bookDTO != null) {
            System.out.println("bookDTO = " + bookDTO);
        } else {
            System.out.println("조회결과가 없습니다!");
        }
    }
}

















