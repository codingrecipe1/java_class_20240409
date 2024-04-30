package ch13_classes.ex02;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private static List<BookDTO> bookDTOList = new ArrayList<>();
    private static long bookId = 1L;

    public boolean save(BookDTO bookDTO) {
        bookDTO.setId(bookId++);
        return bookDTOList.add(bookDTO);
    }

    public List<BookDTO> findAll() {
        return bookDTOList;
    }

    public BookDTO findById(long id) {
        BookDTO bookDTO = null;
//        for (int i = 0; i < bookDTOList.size(); i++) {
//            if (id == bookDTOList.get(i).getId()) {
//                bookDTO = bookDTOList.get(i);
//            }
//        }
        // for each
        for (BookDTO bookDTO1: bookDTOList) {
            if (id == bookDTO1.getId()) {
                bookDTO = bookDTO1;
            }
        }

        return bookDTO;
    }

    public BookDTO findByTitle(String bookTitle) {
        BookDTO bookDTO = null;
        for (int i = 0; i < bookDTOList.size(); i++) {
            if (bookTitle.equals(bookDTOList.get(i).getBookTitle())) {
                bookDTO = bookDTOList.get(i);
            }
        }
        return bookDTO;
    }

    public boolean update(long id, int bookPrice) {
        boolean result = false;
        for (int i = 0; i < bookDTOList.size(); i++) {
            if (id == bookDTOList.get(i).getId()) {
                bookDTOList.get(i).setBookPrice(bookPrice);
                result = true;
            }
        }
        return result;
    }

    public boolean delete(long id) {
        boolean result = false;
        for (int i = 0; i < bookDTOList.size(); i++) {
            if (id == bookDTOList.get(i).getId()) {
                bookDTOList.remove(i);
                result = true;
            }
        }
        return result;
    }

    public List<BookDTO> search(String q) {
        // 검색결과를 담을 새로운 List 선언
        List<BookDTO> bookDTOS = new ArrayList<>();
        for (int i = 0; i < bookDTOList.size(); i++) {
            // contains()
            if (bookDTOList.get(i).getBookTitle().contains(q)) {
                // 조건을 만족한 BookDTO 객체를 검색결과 List에 추가
//                bookDTOS.add(bookDTOList.get(i));
                BookDTO bookDTO = bookDTOList.get(i);
                bookDTOS.add(bookDTO);
            }
        }
        return bookDTOS;
    }
}

















