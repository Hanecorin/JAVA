/* wrapper class
 * 1. 기본 타입을 support 하는 8가지 클래스
 * 2. java.lang 제공
 * 3. autoboxing & unboxing
 * 4. 데이터 타입 두가지
 * 	1. 기본 타입 - class 없이 값만 표현
 * 	2. 참조 타입 - class 기반으로 생성 따라서 class 보유한 변수, 메소드 호출 가능
 */
package step01.util;

import org.junit.Test;

public class WrapperTest {

	@Test
	public void m1() {
		//unboxing
		int i = new Integer(3); // 컴파일 시점에 int i = (new Integer(3)).intValue();
		System.out.println(i); //int 값 출력
//		System.out.println(i.toString()); //오류 class가 아니여서 즉 참조타입 아니여서 메소드 호출 불가
		
		//autoboxing
		Integer i2 = 5; // Integer i2 = new Integer(5);
		System.out.println(i2);
		System.out.println(i2.toString());
	}
	
}