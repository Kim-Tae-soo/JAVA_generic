package kr.or.ddit.basic.generic;

// 제네릭을 사용하지 않을 경우
class NonGeneric{
	private Object value;
	
	public void setValue(Object value) {
		this.value = value;
	}
	public Object getValue() {
		return this.value;
	}
}	

/*
 	제네릭 클래스를 만드는 방법
 	형식) 
 	class 클래스명 <제네릭타입글자>{
 		제네릭타입글자 변수명;	// 변수 선언에 제네릭을 사용한 경우
 		...
 		
 		제네릭 타입 글자 메서드명(매개뱐수들...){ // 메서드의 반환값
 			...
 			retrun 값;
 		}
 		
 		반환값 타입 메서드명 (제네릭타입글자 변수명, ...) { // 메서드의 매개변수에 제네릭을 사용한 경우
 			...
 		
 		}
 	}
 	
 	- 제네릭타입글자 ==> 영어 대문자 1글자를 사용한다.
 	 T ==> Type
 	 K ==> Key
 	 V ==> Value
 	 E ==> Element
 	
 */

class MyGeneric<T>{
	private T value;
	
	public void setValue(T value) {
		this.value = value;
	}
	public T getValue() {
		return this.value;
	}
	
}

public class GenericTest {
	public static void main(String[] args) {
		NonGeneric non1 = new NonGeneric();
		non1.setValue("안녕하세요");
		
		NonGeneric non2 = new NonGeneric();
		non2.setValue(123);
		
		String temp1 = (String)non1.getValue();
		System.out.println("문자열 반환값 : " + temp1);
		
		String Temp1 = (String)non1.getValue();
		System.out.println("정수형 반환값 : " + Temp1);
		
		int iTemp1 = (int)non2.getValue();
		System.out.println("iTemp2 = " + iTemp1);
		
		System.out.println("------------------------------------");
		
		MyGeneric<String> my1 = new MyGeneric<String>();
		my1.setValue("우리나라");
		//my1.setValue(300);
		
		MyGeneric<Integer> my2 = new MyGeneric<>();
		my2.setValue(500);
//		my2.setValue("가나다라");
		
		String myTemp = my1.getValue();
		System.out.println("제네릭의 문자열 반환값 : " + myTemp);
		int myItemp = my2.getValue();
	}
}
