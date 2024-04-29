package ch13_classes.ex01;

import java.util.List;

public class StudentService {
    StudentRepository studentRepository = new StudentRepository();

    public void method1() {
        System.out.println("StudentService.method1");
    }

    public void method2() {
        System.out.println("StudentService.method2");
        String str1 = "안녕하세요";
        // StudentRepository의 method2 호출
        studentRepository.method2(str1);
    }

    /**
     * StudentDTO 객체를 만들고 필드값을 담은 뒤에 StudentRepository의 method3으로
     * StudentDTO 객체를 전달
     */
    public void method3() {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setStudentMajor("정보통신과");
        studentDTO.setStudentName("학생1");
        studentDTO.setStudentNumber("20241111");
        studentDTO.setStudentMobile("010-1111-1111");
        studentRepository.method3(studentDTO);
    }

    /**
     * Repository로 부터 studentList 객체를 받아와서
     * for문으로 출력
     */
    public void method4() {
        List<StudentDTO> studentDTOList = studentRepository.method4();
        for (StudentDTO studentDTO: studentDTOList) {
            System.out.println("studentDTO = " + studentDTO);
        }
    }
}
