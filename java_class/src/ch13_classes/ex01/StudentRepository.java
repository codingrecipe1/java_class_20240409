package ch13_classes.ex01;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    /**
     * 모든 학생 정보를 관리하는 저장소 역할의 리스트 선언
     * 저장, 수정, 삭제 등의 작업은 Repository 클래스에서만 하기 위해
     * private으로 다른클래스에서는 접근을 못하도록 함
     */
    private List<StudentDTO> studentDTOList = new ArrayList<>();

    /**
     * method name: method2
     * parameter:
     * return:
     * 실행내용: 전달받은 매개변수 값 출력
     */
    public void method2(String str) {
        System.out.println("str = " + str);
    }

    public void method3(StudentDTO studentDTO) {
        System.out.println("studentDTO = " + studentDTO);
        studentDTOList.add(studentDTO);
    }

    public List<StudentDTO> method4() {
        return studentDTOList;
    }
}
