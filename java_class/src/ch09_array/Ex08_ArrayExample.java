package ch09_array;

import java.util.Scanner;

public class Ex08_ArrayExample {
    public static void main(String[] args) {
        /**
         * 스캐너로 입력 받은 정수만큼의 크기를 갖는 배열 만들기
         * 5를 입력하면 크기가 5인 배열이 생성되어야 함
         */
        int[] numbers = null;
        Scanner scanner = new Scanner(System.in);
        System.out.print("배열크기: ");
        int size = scanner.nextInt();
        if (size > 0) {
//            int[] numbers = new int[size];
            numbers = new int[size];
            System.out.println("numbers = " + numbers.length);
        } else {
            numbers = null;
        }
        System.out.println("numbers = " + numbers.length);
    }
}
