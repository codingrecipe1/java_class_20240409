package ch07_while;

import java.util.Scanner;

public class Ex05_WhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 숫자입력용 변수
        int input = 0;
        // 횟수용 변수
        int count = 0;
        // 반복문 실행용 변수
        boolean run = true;
        System.out.println("up & down");
        // 맞춰야 하는 숫자
        int answer = (int) (Math.random() * 100) + 1;
        while (run) {
            System.out.println("정답: " + answer);
            System.out.print("숫자를 입력하세요: ");
            input = scanner.nextInt();
            count++;
            if (input > answer) {
                System.out.println("더 작은 수를 입력하세요!");
            } else if (input < answer) {
                System.out.println("더 큰 수를 입력하세요!");
            } else {
                System.out.println("맞았습니다!");
                System.out.println("시도 횟수는 " + count + "회 입니다.");
            }
        }
    }
}
