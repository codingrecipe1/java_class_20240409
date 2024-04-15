package ch06_for;

import java.util.Scanner;

public class Ex04_ForExample {
    public static void main(String[] args) {
        /**
         * 두 개의 정수를 입력받아서 시작값부터 끝값까지의 합계 출력
         * 실행 화면
         * 시작값: 10
         * 끝값: 100
         * 10 부터 100 까지의 합은 000 입니다.
         * 10+11+12+~~~~~+100=000
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("시작값: ");
        int start = scanner.nextInt();
        System.out.print("끝값: ");
        int end = scanner.nextInt();

        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum = sum + i;
            if (i < end) {
                System.out.print(i + "+");
            } else {
                System.out.print(i + "=");
            }
        }
        System.out.println(sum);
        System.out.println(start + " 부터 " + end + "까지의 합은 " + sum + "입니다.");
    }
}
