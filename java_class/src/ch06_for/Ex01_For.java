package ch06_for;

public class Ex01_For {
    public static void main(String[] args) {
        // 반복문을 사용하지 않고 1~3까지 출력한다면
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//
//        int num = 1;
//        System.out.println("num = " + num);
//        num = 2;
//        System.out.println("num = " + num);
//        num = 3;
//        System.out.println("num = " + num);
        for (int i = 1; i < 4; i++) {
            System.out.println("i = " + i);
        }
        
        // 10 ~ 20
        for (int i = 10; i <= 20; i++) {
            System.out.println("i = " + i);
        }

        // 2 4 6 8 10 출력
        for (int i = 2; i <= 10; i+=2) {
            System.out.println("i = " + i);
        }

        // 5 4 3 2 1 출력
        for (int i = 5; i >= 1; i--) {
            System.out.println("i = " + i);
        }


        for (int i = 1; i <= 3; i++) {
            // i는 for문 안에서 선언한 지역변수
            System.out.println("i = " + i);
        }
//        System.out.println("i = " + i);
        int i = 0;
        for (i = 0; i <= 3; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("i = " + i);
    }
}















