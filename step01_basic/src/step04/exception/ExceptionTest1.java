/* 예외 클래스 필수 암기 사항
 * - 문제가 발생이 된다 하더라도 종료가 아니라 유연한 실행 유지를 위한 처리 기술
 * 
 * 1. 다수의 예외 상황을 예외 클래스명으로 이미 다수 제공
 * 2. 향후엔 직접 개발도 가능
 * 3. 구조
 * 	java.lang.RuntimeExceiton 과 무관한 모든 예외 클래스는 무조건 무조건 무조건 try~catch 필수
 * 
 */

package step04.exception;

class A{
	static {
		System.out.println("A.class가 실행을 위해 메모리에 로딩될때 자동 실행되는 블록");
	}
}

public class ExceptionTest1 {

	public static void main(String[] args) {
		//step02 - compile 예외 체험 및 처리
		//byte code를 메모리에 로딩하는 API
		/* java.lang.Class
		 * 
		 * public static Class<?> forName(String className)
                        throws ClassNotFoundException
		 * 
		 * public static Class forName(String fileName){
		 * 	  fileName의 byte code를 메모리에 로딩
		 * }
		 * 1. 경우의 수 1 : 존재하는 byte code명을 parameter로 적용
		 * 	- 정상 로딩
		 * 2. 경우의 수 2 : 미존재하는 byte code명을 parameter로 적용
		 *  - 비정상 로딩
		 *  - 호출한 곳으로 비정상 실행 알려야 함
		 * 
		 */
		try {
			
			System.out.println(1);
			Class.forName("step04.exception.A");
			System.out.println(2);
			
		} catch (ClassNotFoundException e) {
			System.out.println(3);
			e.printStackTrace();  //발생된 예외에 대한 보고
		}
		
		System.out.println(4);
		
		
		//step01- runtime 예외 체험 및 처리 
		//s = null 로 초기화후  s.length()실행시 NullPointerException 발생
		//해결책 s라는 변수에 값 대입으로 문제 해결
		//실행시에 발생한 예외는 코드 수정으로 해결 완료
		String s = "playdata";  
		System.out.println(s);
		System.out.println(s.length());
		
		int [] i = {1, 2};
//		System.out.println(i[5]); //ArrayIndexOutOfBoundsException 발생
		System.out.println(i[0]); 
	}

}