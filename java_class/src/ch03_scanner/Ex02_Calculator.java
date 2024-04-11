package ch03_scanner;

import java.util.Scanner;

public class Ex02_Calculator {

	public static void main(String[] args) {
		/**
		 * 스캐너로 정수 2개를 각각 입력받고 입력받은 수의 합계 출력 
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int num1 = scanner.nextInt();
		System.out.print("두번째 숫자: ");
		int num2 = scanner.nextInt();
		System.out.println("합계: " + (num1 + num2));
		int sum = num1 + num2;
		System.out.println("합계:" + sum);
	}

}
