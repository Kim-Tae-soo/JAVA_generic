package kr.or.ddit.basic.args;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/*
 	- 매겨변수로 받은 정수들의 합계를 구하는 메서드를 작성하려고 한다.
 	(단, 이 정수들의 개수는 상황에 따라 다르다.)
 */

public class ArgumentTest {

	public int sumArr(int[] data) {
		int sum = 0;
		// 방법1 일반 for문
//		for(int i=0; i<data.length; i++) {
//			sum+=data[i];
//		}
//		return sum;

		// 방법2 - 향상된 for문
		for (int x : data) {
			sum += x;

		}
		return sum;
	}
/*
 	가변인자 ==> 메서드가 실행될 때 마다 메서드의 인자의 개수가 다를 경우에 사용한다.
 		- 가변인자는 메서드 안에서는 배열로 처리된다.
 		- 가변인자는 메서드를 구성할 때 한 개만 사용할 수 있다.
 	
 */
	
	// 가변 인자를 이용한 메서드
	public int sumArgs(int... data) {
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum;
	}
	
	// 가변인자를 처리하는 매개변수와 일반적인 매개변수를 같이 사용할 때는
	// 가변인자를 처리하는 매개변수를 제일 뒤에 배치해야 한다.
	
	public String sumArgs2(String name, int...data) {
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return name + "씨의 합계 : " + sum;
	
	}
	
	public void test(int z) {
		
		int [] a = {1,2,3,4,5,6,7,8,9};
		
		
		int [] b = new int[] {1,2,3,4,5,6,7,8,9};
		int [] bb;
		bb = new int[] {1,2,3,4,5,6,7,8,9};
		
	}

	public static void main(String[] args) {
		ArgumentTest t = new ArgumentTest();
		
		int[] nums = {123,456,789};
		System.out.println(t.sumArr(nums));
		System.out.println(t.sumArr(new int[]{1,2,3,4,5,6,7,8,9} ));
		
		System.out.println("------------------------------");
		System.out.println(t.sumArgs(123,456,789));
		System.out.println(t.sumArgs(1,2,3,4,5,6,7,8,9));
		System.out.println("------------------------------");
		
		System.out.println(t.sumArgs2("홍길동", 1,2,3,4,5));
		
		

	}
}