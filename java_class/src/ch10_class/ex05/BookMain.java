package ch10_class.ex05;

public class BookMain {
    public static void main(String[] args) {
        // 책 정보는 시중에 있는 책 참고

        // 기본생성자로 객체 만들고 필드값 채우기
        Book book1 = new Book();
        book1.bookTitle = "나는 읽고 쓰고 버린다";
        book1.bookAuthor = "손웅정";
        book1.bookPublisher = "난다";
        book1.bookDate = "2024-04-20";
        book1.bookPrice = 17000;
        book1.bookPrice = 20000;

        // 매개변수 2개 있는 생성자로 객체 만들고 필드값 채우기
        Book book2 = new Book("불변의 법칙", "모건 하우절");
        book2.bookPublisher = "서삼독";
        book2.bookDate = "2024-02-28";
        book2.bookPrice = 25000;
        book2.bookTitle = "불변의 법칙 개정판";

        // 모든 매개변수 있는 생성자로 객체 만들고 필드값 채우기
        Book book3 = new Book("나를 소모하지 않는 현명한 태도에 관하여", "마티아스 뇔케", "퍼스트펭귄", "2024-03-10", 17800);


    }
}
