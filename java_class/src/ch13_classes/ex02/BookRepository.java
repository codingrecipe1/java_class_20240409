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
}

















