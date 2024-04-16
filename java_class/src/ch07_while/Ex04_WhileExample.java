package ch07_while;

public class Ex04_WhileExample {
    public static void main(String[] args) {
        /**
         * 6이 나올 때 까지 random 메서드를 이용해서 1~6 숫자가 만들어지도록 하고
         * 6이 나오면 종료되는 코드 작성
         */
//        int num = (int) (Math.random() * 6) + 1;
        boolean run = true;
        while (run) {
            int num = (int) (Math.random() * 6) + 1;
            System.out.println("num = " + num);
            if (num == 6) {
                run = false;
            }
        }

    }
}
