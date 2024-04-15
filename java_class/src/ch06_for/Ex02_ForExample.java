package ch06_for;

public class Ex02_ForExample {
    public static void main(String[] args) {
        /**
         * 1부터 10까지의 합계 출력
         */
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
//            sum += i;
        }
        System.out.println("합계: " + sum);
    }
}
