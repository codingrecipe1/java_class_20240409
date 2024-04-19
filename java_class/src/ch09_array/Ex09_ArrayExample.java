package ch09_array;

import java.util.Scanner;

public class Ex09_ArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int studentNum = 0;
        int selectNo = 0;
        int[] scores = null;

        while (run) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("1.학생수입력 | 2.점수입력 | 3.점수목록 | 4.분석 | 5.종료");
            System.out.println("--------------------------------------------------------------");
            System.out.print("선택> ");
            selectNo = scanner.nextInt();
//            int[] scores = null;
            if (selectNo == 1) {
                System.out.print("학생수> ");
                studentNum = scanner.nextInt();
                scores = new int[studentNum];
            } else if (selectNo == 2 && scores != null) {
                for (int i = 0; i < scores.length; i++) {
                    System.out.print((i + 1) + "번 학생 점수: ");
                    scores[i] = scanner.nextInt();
                }
            } else if (selectNo == 3 && scores != null) {
                for (int i = 0; i < scores.length; i++) {
                    System.out.println((i + 1) + "번 학생 점수: " + scores[i]);
                }
            } else if (selectNo == 4 && scores != null) {
                int sum = 0, max = 0;
                double avg = 0.0;
                for (int i = 0; i < scores.length; i++) {
                    if (max < scores[i]) {
                        max = scores[i];
                    }
                    sum += scores[i];
                }
                avg = (double) sum / scores.length;
                System.out.println("최고점수: " + sum);
                System.out.println("평균점수: " + avg);

                int temp = 0;
                for (int i = 0; i < scores.length; i++) {
                    for (int j = i + 1; j < scores.length; j++) {
                        if (scores[i] < scores[j]) {
                            temp = scores[i];
                            scores[i] = scores[j];
                            scores[j] = temp;
                        }
                    }
                }
                for (int i = 0; i < scores.length; i++) {
                    System.out.println((i + 1) + "등: " + scores[i]);
                }
            } else if (selectNo == 5) {
                run = false;
            } else if (scores == null) {
                System.out.println("학생수를 먼저 입력하세요!");
            } else {
                System.out.println("없는 메뉴 번호 입니다.");
            }
        }
    }
}
