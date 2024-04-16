package ch07_while;

public class Ex02_WhileExample {
    public static void main(String[] args) {
        /**
         * 1부터 10까지 합계 출력
         * 1+2+3+4+5+6+7+8+9+10=55
         *
         */
        int i = 1, sum = 0;
        while (i <= 10) {
            sum += i;
            if (i < 10) {
                System.out.print(i + "+");
            } else {
                System.out.print(i + "=");
            }
            i++;
        }
        System.out.print(sum);
    }
}
