package ch06_for;

public class Ex10_ForExample {
    public static void main(String[] args) {
        /*
            별찍기
            *
            **
            ***
            ****
            *****
         */
        for (int i = 1; i <= 5; i++) { // 줄수
            for (int j = 1; j <= i; j++) { // 줄수 만큼 별 출력
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
