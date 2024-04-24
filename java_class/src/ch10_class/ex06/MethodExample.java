package ch10_class.ex06;

public class MethodExample {
    // 매개변수 x, 리턴 x
    public void method1() {
        System.out.println("MethodExample.method1");
    }

    // 매개변수 o, 리턴 x
    public void method2(int num1) {
        System.out.println("num1 = " + num1);
    }

    // 매개변수 x, 리턴 o
    public int method3() {
        System.out.println("MethodExample.method3");
        int value = 10 + 20;
//        return value;
        return 10;
    }

    // 매개변수 o, 리턴 o
    public String method4(String param1) {
        String str1 = "안녕하세요~";
        return str1 + param1;
    }

    public int method5(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }


}
