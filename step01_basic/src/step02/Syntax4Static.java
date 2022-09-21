/* 학습 내용
 * * 중요
 * - 유일하게 java.lang package만 import 안 하고 사용
 * 
 * 
 * - static 메소드 & API
 *
 * 
 */
package step02;

public class Syntax4Static {
	//String
	static void m1() {
		String data = "playdata";
		//? data 변수가 참조하는 객체의 길이값 출력
		/* data 변수가 참조 :  String 객체 완전 중요
		 * 하는 객체의 길이값 : 길이 즉 int
		 *  출력 : println()
		 *  
		 *  String 객체의 길이 카운팅후 int반환 메소드?>
		 *  public int length(){
		 *  	return 길이값;
		 *  }
		 */
		int length = data.length();
		System.out.println(length);
				
		//? p만 뽑아서 출력 
		/* 문자열에서 p -> String 문자열에서 char 문자만 반환
		 * 문자 하나 착출하는 기준?
		 * public char charAt(int index){} 
		 * 
		 * 
		 * *** 사고하기
		 * 	- static 적용시의 적합성?
		 * public static char charAt(int index){
		 * 	문자열에서 해당 index에 위치한 char값 착출해서 반환
		 * } 
		 * 
		 * char c = String.charAt(0);
		 *  static 적용 부적합
		 *  왜? 무슨 문자열의 0 번째를 뽑으라는거냐~~>!!!! 버럭버럭
		 */
		char c = data.charAt(0);
		System.out.println(c);
		
		//String 값을 int 변경
		//"3" -> 3 | "three" -> 3 | "삼" or "석삼" -> 3 ....
		//"" 제거 후에 int로 변환가능한 메소드 제공
		//실시간 어떤 데이터가 유입될지 모른는 상황이 다수
		/* java.lang.Integer
		 * 		public int parseInt(String value){
		 * 			Paremeter로 유입된 값을 int로 변환해서 반환
		 * 		}
		 * 
		 * java.lang.Float
		 * 		public float parseInt(String value){
		 * 			Paremeter로 유입된 값을 float로 변환해서 반환
		 * 		}
		 * 
		 */
		
	}
	
	//API를 활용한 미션 풀이
	//java.lang.Math의 메소드
	static void m2() {
		//? 2, 3 두개의 숫자값 비교해서 최대값 출력
		System.out.println(Math.max(2, 3));
		
		//? 0.0 <= 난수값 < 1.0 까지의 실수(double)값 출력
		System.out.println(Math.random());
	}
	
	//java.lang.Intger 
	//? "" 제거 후 int로 변환 가능한 문자열에 한해서만 int로 변경
	// int로 변경불가능한 "삼" 등으로 값을 주면 어떤일 발생되어야 할까요?
	//포멧 문제 있습니다라는 경우의 수 처리 
	static void m3() {
		int v = Integer.parseInt("삼");
		System.out.println(v);
	}
	
	public static void main(String[] args) {
//		Syntax4Static.m1();
//		m2();
		m3();
	}

}
