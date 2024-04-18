package ch08_string;

import java.util.Scanner;

public class Ex02_StringExample {
    public static void main(String[] args) {
        System.out.println("메시지를 입력하세요");
        System.out.println("프로그램을 종료하려면 '종료'를 입력하세요.");
        Scanner scan = new Scanner(System.in);
        String inputString = "";
        boolean run = true;
//        String answer = "종료";
        final String ANSWER = "종료";
//        ANSWER = "ㅁㅁ";
        do {
            System.out.print(">");
            inputString = scan.nextLine();
            System.out.println(inputString);
            if (inputString.equals(ANSWER)) {
                run = false;
            }
        } while (run);

    }
}
