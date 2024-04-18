package ch09_array;

import java.util.Scanner;

public class Ex03_ArrayExample {
    public static void main(String[] args) {
        /**
         * 크기가 3인 정수형 배열을 선언하고
         * 실행했을 때 스캐너로 정수값을 입력받아 배열에 저장하고
         * 저장된 값의 총합, 평균 출력
         */
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
//        numbers[0] = scanner.nextInt();
//        numbers[1] = scanner.nextInt();
//        numbers[2] = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(i + "번 인덱스 값: ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        System.out.println("sum = " + sum);
        System.out.println("평균 = " + sum / numbers.length);
    }
}
