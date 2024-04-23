package ch10_class.ex04;

public class StudentMain {
    public static void main(String[] args) {
        // 기본생성자로 Student 클래스 객체 생성
        Student student1 = new Student();

        // 객체에 4가지 필드값 대입
        student1.studentMajor = "정보통신과";
        student1.studentName = "학생1";
        student1.studentNumber = "20241111";
        student1.studentMobile = "010-1111-1111";

        // 매개변수 있는 생성자로 객체 생성
        Student student2 = new Student("정보통신과", "학생2", "20242222", "010-2222-2222");

        // 두 객체의 정보 print로 확인
        System.out.println("student1.studentName = " + student1.studentName);
        System.out.println("student2.studentName = " + student2.studentName);


    }
}
