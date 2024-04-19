package ch09_array;

public class Ex07_ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 1, 5, 4};
        // 출력 1 2 3 4 5
        // 중간 저장용 변수
        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }


    }
}
