/* 학습 내용
 * 1. 멤버/로컬 변수 차이점
 * 	1. 멤버 : 
 * 		class {} 하위에 선언
 * 		객체 생성이 우선
 * 		객체 생성시에 각 타입별 기본 값으로 자동 초기화
 * 
 *  2. 로컬 : 메소드의 parameter 또는 {} 에 선언
 *  	- 멤버 변수와 달리 선언시 자동 초기화가 안됌
 *  	- 사용전 초기화(값 대입) 필수
 *  
 * 2. 멤버 변수의 자동 초기화 이해하기
 * 
 */

package step02;

public class Syntax1Variable {
	int no1;  // 멤버
	int no2;
	boolean b;
	float f;
	char c = '가';  //명시적인 초기화, char타입은 기본 타입 : 값 표현시 ''/ String 참조타입 ""
	
	//생성자
	/* 1. 객체 생성시에만 호출되는 필수 요소
	 * 2. 개발자가 소스에 미 개발시 기본 형태의 생성자 자동 생성
	 * 3. 기본 형태? () 즉 parameter가 없는 생성자 의미 
	 * 4. 문법 : 반환타입 존재 자체가 없고, 클래스명과 동일
	 */
	public Syntax1Variable(){
		//모든 멤버 변수들 공간을 메모리에 생성 및 기본 초기화 및 명시적인 초기화 실행
		
		System.out.println("기본 생성자");//멤버 구성 마무리 후 실행되는 마지막 로직
	}
		
	public Syntax1Variable(int no1, int no2, boolean b, float f, char c) {
		super();
		this.no1 = no1;
		this.no2 = no2;
		this.b = b;
		this.f = f;
		this.c = c;
	}





	void m1() {
		int no1 = 10; //로컬 
		System.out.println(no1);  //no1값 출력전에 no1은 반드시 값 대입 즉 초기화가 되어 있어야 함
	}

	public static void main(String [] args) {
		// no1, no2, m1() 실행을 위해서 객체 생성 필수
		//s1이라는 참조 변수가 참조하는 Syntax1Variable instance(객체)
		Syntax1Variable s1 = new Syntax1Variable()     ;
		
//		System.out.println(s1);  //step02.Syntax1Variable@1c4af82c
//		System.out.println(s1.no1);  // 0
//		System.out.println(s1.b);  // false
//		System.out.println(s1.f);  // 0.0
//		System.out.println(s1.c);  // 가'
//		
		s1.m1();
		
	}
	
}