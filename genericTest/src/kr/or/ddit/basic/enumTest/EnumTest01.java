package kr.or.ddit.basic.enumTest;

/*
 	enum(열거형) 	==> 서로 관련있는 상수들의 집합을 나타낸다.
 				==> 클래스처럼 보이게하는 상수
 	- 작성방법(위치)
 		==> 열거형은 클래스처럼 독립된 JAVA파일에 만들 수 있고, 
 			하나의 JAVA 파일에 클래스와 같이 만들 수 있고,
 			클래스의 내부에 내부클래스처럼 만들 수 있다.
 	
 	- 열거형의 속성 및 메서드
 	1) 열거형변수.name()	==> 열거형 상수으 이름을 문자열로 반환한다.
 	2) 열거형변수.ordinal()	==> 열거형 상수가 정의된 순서(index)값을 반환한다. ( 0부터 시작 )
 	3) 열거형이름.valueOf("열거형상수명") ==> 인수값에 지정한 '열거형상수명'과 일치하는 열거형 상수를 반환한다. 
 	4) 열거형이름.열거형상수명	==> valueOf() 메서드와 같다.
 	5) 열거형이름.values()	==> 모든 상수들을 배열로 가져온다.
 	-----------------------------------------------------------------------------
 	
 	- 열거형 선언하기
 	방법1)
 		enum 열거형이름{ 상수명1, 상수명2, 상수명3, ... }
 	
 	방법2)
 		enum 열거형이름 {
 			
 			상수명1(값들1, ...)
 			상수명2(값들2, ...)
 			상수명3(값들3, ...)
 			...
 			상수명n(값들n, ...)
 			
 			// '값들'이 저장될 변수 선언
 			private 지료형이름 변수명1;
 			private 지료형이름 변수명2;
 			...
 			
 			// 열거형의 생성자를 만든다.
 			// 열거형의 생성자는 '열거형상수'에 '값들'을 셋팅하는 역할을 수행한다.
 			// 열거형 생성자는 묵시적으로 'private'이다
 			// 열거형 생성자의 매개변수는 '값들'과 갯수가 같고, 자료형도 맞아야 한다.
 			
 			private 열거형이름(자로형이름 변수명1, ...) {
 				위에 선언한 변수들을 매개변수의 값으로 초기화 작업을 한다...
 				...
 			}
 			
 			// 위에 선언한 변수들을 외부에서 불러올 수 있도록 getter 메서드르 작성한다.
 			
 			
 		}
 		
 */

public class EnumTest01 {
	
	public enum Color {
		RED, GREEN, BLUE
	}

	public enum Count {
		ONE, TWO, THREE
	}

	public enum Season {
		봄("3월부터 5월까지",13){
			@Override
			public void test(String name) {
				System.out.println(name + "씨 꽃피는 봄이네요");
			}
		},
		여름("6월부터 8월까지",40){
			@Override
			public void test(String name) {
				System.out.println(name + "씨 여름이네요");
			}
		},
		가을("9월부터 11월까지",10){
			@Override
			public void test(String name) {
				System.out.println(name + "씨 가을이네요");
			}
		},
		겨울("12월부터 2월까지",0){
			@Override
			public void test(String name) {
				System.out.println(name + "씨 겨울이네요");
			}
		};
		
		
		// 값들이 저장될 변수 선언
		private String span;
		private int temp;
		
		// 생성자
		Season(String months, int temp){ // ==> private Season(String months, int temp) private 생략가능
			span = months;
			this.temp = temp;
			
		}
		
		public void test(String name) {
			// TODO Auto-generated method stub
			
		}

		// getter 메서드 작성
		public String getSpan(){
			return span;
		}
		
		public int getTemp() {
			return temp;
		}
	}

	public static void main(String[] args) {
		/*
		System.out.println("Red : " + ConstTest.RED);
		System.out.println("Three : " + ConstTest.THREE);

		if (ConstTest.ONE == ConstTest.RED) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		*/
		
		Color mycol = Color.valueOf("GREEN");	// Color.GREEN; 과 같다
		Count mycnt = Count.ONE;				// Count.valueOf("ONE") 과 같다
		System.out.println("mycol : "+mycol.name());
		System.out.println("mycnt : "+mycnt.name());
		System.out.println();
		
		System.out.println("mycol의 ordinal : " + mycol.ordinal());
		System.out.println("mycnt의 ordinal : " + mycnt.ordinal());
		System.out.println();
		
//		if(mycol == Count.THREE) {	// 서로 다른 종류의 열거형끼리는 비교가 불가능하다. ( 오류 발생 )
//			
//		}
		
		if(mycol == Color.BLUE) {
			System.out.println("같다...");
		} else {
			System.out.println("다르다...");
		}
		System.out.println("-------------------------");
		
		Season ss = Season.valueOf("봄");
		System.out.println("name : " + ss.name());
		System.out.println("ordianl : " + ss.ordinal());
		System.out.println("span : " + ss.span);
		System.out.println("temp : " + ss.temp);
		System.out.println("-------------------------");
		for (Season time : Season.values()) {
			System.out.println(time + " == " + time.name() + " ==> " + time.getSpan() + ", " + time.getTemp());
		}
		System.out.println();
		for (Color col : Color.values()) {
			System.out.println(col + " ==> " + col.ordinal());
		}
		System.out.println();

		// 열거형 switch 문에서 비교하기
		// case문 옆에는 '상수명' 만 기술해도 된다. 
		switch (mycol) {
			case RED :
				System.out.println("RED");
				break;
			case GREEN :
				System.out.println("GREEN");
				break;
			case Color.BLUE :
				System.out.println("BLUE");
				break;
		}
		System.out.println();
		//구현한 추상 메서드 실행
		Season ss2 = Season.겨울;
		ss2.test("홍길동");
	}
}
