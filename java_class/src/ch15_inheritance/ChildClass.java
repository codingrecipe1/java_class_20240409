package ch15_inheritance;

public class ChildClass extends ParentClass {
    public ChildClass() {
        System.out.println("자식클래스 기본생성자");
    }

    // 부모클래스의 hello 메서드 재정의
    @Override
    public void hello() {
        System.out.println("ChildClass.hello");
    }
}
