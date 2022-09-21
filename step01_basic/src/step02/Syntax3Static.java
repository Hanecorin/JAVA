/* 학습내용
 * 1. static 키워드
 * 2. 적용 문법
 * 	1. 변수
 * 	- Syntax3Static.java
 * 		static type 변수명 [=값];
 * 		특징
 * 			1. 호출문법
 * 				class명.변수명 
 * 					- 외부 클래스의 static 변수 호출 방법
 * 				변수명
 * 					- 동일한 클래스의 static 변수 호출 방법
 * 				참조변수명.변수명
 * 					- 참조변수가 이미 있다면 허용되는 문법
 * 
 *			2. 생성되는 모든 객체가 공유하는 데이터
 *				- 주의사항 : pw나 id등의 변수는 절대 static으로 선언 불가
 *
 *			3. 실제 사용 가능하게 메모리에 생성되는 시점은 byte code가 적재(로딩)시 자동 생성
 *			
 *	2. 메소드
 *		- Syntax4Static.java
 *		1. 특징
 *			- 객체 생성없이도 참조변수 없이 호출 가능
 *
 *		2. 호출 문법
 *			- class명.메소드() or 메소드명()
 *
 *	3. static{}
 *		- Syntax5Static.java
 * 
 * 3. 주용도
 * 	1. 클래스의 멤버 변수와 메소드 호출시 객체 생성 후 참조 변수로 호출이 기본
 *  2. static으로 선언된 멤버 변수와 메소드 호출시에만 객체 생성없이 클래스명으로 호출 가능
 */

//>java Syntax3Static
//jre Syntax3Static byte code 메모리에 로딩  -> Syntax3Static.main( [..]);
package step02;

public class Syntax3Static {
	int no1;   //객체(instance) 생성 필수, instance 변수
	static int no2; //byte code가 로딩될때 32bit 메모리 생성 및 자동 초기화, static 변수
	
	Syntax3Static(){
		no1++;
		no2++;
	}
	
	void m1() { //객체 생성 후 참조 변수로만 호출 가능한 메소드
		System.out.println("일반 메소드");
	}
	static void m2() {  //객체 생성없이 클래스명으로만 호출 가능한 메소드 
		System.out.println("static 메소드");
	}
	
	public static void main(String[] args) {
		m2();  //static 메소드
		Syntax3Static.m2(); //static 메소드  
		System.out.println(no2); //0
		
		Syntax3Static s1 = new Syntax3Static(); //no1 변수를 heap 메모리에 생성
		System.out.println(s1.no1); //1
		System.out.println(no2); //1
		
		Syntax3Static s2 = new Syntax3Static(); 
		System.out.println(s2.no1); //1
		System.out.println(Syntax3Static.no2); //2
		
		Syntax3Static s3 = new Syntax3Static(); 
		System.out.println(s3.no1); //1
		System.out.println(s3.no2); //3
		
		no2 = 100;
		s1.no2 = 200;
		System.out.println(s3.no2);  //200
	}

}