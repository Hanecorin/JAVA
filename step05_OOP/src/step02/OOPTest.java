package step02;

public class OOPTest {
	
	static Object m1() {  //Object 변수 = "객체 형변환"; 다형성 적용, 상위타입으로 변환되어 반환
		return "객체 형변환";
	}
	
	static void m2(Object v) {
		String s = (String)v;
		System.out.println(s.length());  //문자열 길이 출력    6
	}
	
	
	static void m3(String v) {
		System.out.println(v.length());  
	}
	
	public static void main(String[] args) {
		/* m1()을 반드시 argument로 적용한다면 코드 수정?
		 * 
		 * m3(  (String)m1()   );
		 * m1() -> (String) -> m3 호출 
		 * m1() 반환값이 Object
		 * 	String 변수 = (String)Object타입
		 */
		m3(  (String)m1()   );
				
		
		m2(m1());
		
		
		/* String s = (String)m1();
		 * String s 라는 변수가 메모리에 생성
		 * m1() 메솓 호출 및 실행되서 결과값이 Object 타입으로 반환
		 * (String)m1() : Object -> String으로 형변환
		 * = : 변환된 String 객체를 String 변수에 대입 
		 */
		String s = (String)m1();
		
		//Object에는 미 존재하는 메소드 따라서 String으로 형변환 필수 후에 해당 메소드 호출
		System.out.println(s.length());
	}

}