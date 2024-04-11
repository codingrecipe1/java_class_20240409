package ch02_operator;

public class Ex04_LogicalOperator {

	public static void main(String[] args) {
		boolean bool1 = true, bool2 = false;
		// AND 연산 
		System.out.println((bool1 && bool2)); // 
		System.out.println((bool1 && (10 == 20))); //
		System.out.println((bool2 && bool1)); //
		System.out.println((false && bool1)); //
		
		// OR 연산
		System.out.println((bool1 || bool2)); // 
		System.out.println((bool1 || (10 == 20))); //
		System.out.println((bool2 || bool1)); //
		System.out.println((false || bool1)); //
		
		// NOT 연산
		System.out.println(!bool1);
		System.out.println((bool1 && !bool2)); // 
		System.out.println((bool1 || !(10 == 20))); //
		System.out.println((!bool2 && bool1)); //
		System.out.println((!false || bool1)); //
	}

}
