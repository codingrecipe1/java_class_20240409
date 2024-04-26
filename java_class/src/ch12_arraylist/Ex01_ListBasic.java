package ch12_arraylist;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ListBasic {
    public static void main(String[] args) {
        // 정수를 담는 intList 선언
        List<Integer> intList = new ArrayList<>();
//        ArrayList<Integer> intList1 = new ArrayList<>();
//        List<Integer> intList2 = new List<>(); // x
        // 10 이라는 데이터 추가
        System.out.println("intList.size() = " + intList.size());
        intList.add(10);
        System.out.println("intList.size() = " + intList.size());
        System.out.println("intList.get(0) = " + intList.get(0));
//        System.out.println("intList.get(0) = " + intList.get(1));
        // 1번 인덱스에 값 추가
        intList.add(1, 100);
        System.out.println("intList.get(1) = " + intList.get(1));
        intList.add(1, 1000);
        System.out.println("intList.get(1) = " + intList.get(1));
        System.out.println("intList.get(2) = " + intList.get(2));
        intList.remove(1);
        System.out.println("intList.get(1) = " + intList.get(1));

        // String 담는 strList
        List<String> strList = new ArrayList<>();
        strList.add("안녕하세요");
        strList.add(1, "hello");
        System.out.println("strList.get(0) = " + strList.get(0));
        System.out.println("strList.get(1) = " + strList.get(1));
        String str1 = strList.get(1);
        System.out.println("str1 = " + str1);
        strList.remove(1);
//        System.out.println("strList.get(1) = " + strList.get(1));

        // for문을 이용하여 intList에 담긴 모든 데이터 출력
        for (int i = 0; i < intList.size(); i++) {
            System.out.println("intList = " + intList.get(i));
        }

        // for each
        for (Integer num: intList) {
            System.out.println("num = " + num);
        }

        // 화살표함수
        intList.forEach(num -> {
            System.out.println("num = " + num);
        });

        for (int i = 0; i < strList.size(); i++) {
            System.out.println("strList.get(i) = " + strList.get(i));
        }

        for (String str: strList) {
            System.out.println("str = " + str);
        }

        strList.forEach(str -> {
            System.out.println("str = " + str);
        });

    }
}

