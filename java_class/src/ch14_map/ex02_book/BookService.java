package ch14_map.ex02_book;

import java.util.Map;
import java.util.Scanner;

public class BookService {
    Scanner scanner = new Scanner(System.in);
    BookRepository bookRepository = new BookRepository();

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
        Map<Long, BookDTO> bookDTOMap = bookRepository.findAll();
        for (long k: bookDTOMap.keySet()) {
            System.out.println(bookDTOMap.get(k));
            // 제목만 출력한다면
            System.out.println(bookDTOMap.get(k).getBookTitle());
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
        System.out.print("조회할 제목: ");
        String title = scanner.next();
        BookDTO bookDTO = bookRepository.findByTitle(title);
        if (bookDTO != null) {
            System.out.println("bookDTO = " + bookDTO);
        } else {
            System.out.println("조회결과가 없습니다!");
        }
    }
}















