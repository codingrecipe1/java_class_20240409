package ch07_while;

public class Ex01_While {
    public static void main(String[] args) {
        // 1~3 까지 출력
        for (int i = 1; i <= 3; i++) {
            System.out.println("i = " + i);
        }

        int i = 1;
        while (i <= 3) {
            System.out.println("i = " + i);
            i++;
        }

        // do while
        int j = 1;
        do {
            System.out.println("j = " + j);
            j++;
        } while (j <= 3);

        int k = 1;
        while (true) {
            System.out.println("무한반복입니다." + k);
            k++;
            if (k == 3) {
                break;
            }
            System.out.println("break 다음 문장");
        }

        int l = 1;
        boolean run = true;
        while (run) {
            System.out.println("l = " + l);
            l++;
            if (l == 3) {
                run = false;
            }
            System.out.println("run=false 다음 문장");
        }

    }
}
