package kr.or.ddit.basic.enumTest;

import java.util.Scanner;

public class EnumTest02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("*** 열거형을 이용한 계산기 프로그램 ***");
		System.out.println("첫번째 숫자 입력 >> ");
		int num1 = scan.nextInt();
		System.out.println("두번째 숫자 입력 >> ");
		int num2 = scan.nextInt();
		
		System.out.println("연산자(+,-,*,/,% 중 하나 입력 >> ");
		String op = scan.next();
		
		
		// 계산할 열거형 상수 찾기
		Operator opEnum = null;	// 계산할 열거형 상수가 저장될 변수 선언
		
		for(Operator em : Operator.values()) {
			if(op.equals(em.getSymbol())) {
				opEnum = em;
			}
		}
		
		if(opEnum==null) {
			System.out.println("연선자 입력 잘못 함 ㅅㄱ");
			return;
		}
		  int result = opEnum.calculator(num1, num2);
	      System.out.println(num1 + opEnum.getSymbol() + num2 + " = " + result);

		
		
	}

}
