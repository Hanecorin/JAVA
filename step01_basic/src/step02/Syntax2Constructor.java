/* 학습 내용
 * 1. 생성자(Constructor)
 * 	1. 객체 생성 기본
 * 	2. 생성 시점에 멤버 변수들값 특정 데이터로 명시적인 초기화 가능
 * 
 * 2. 다중 정의(overloading)
 * 	- 하나의 클래스에서 메소드끼리, 생성자끼리에 적용되는 메카니즘
 * 	- 이름 동일 단 parameter가 다름
 *  - 사용자가 편리하게 해주는 support
 *  
 */

package step02;

public class Syntax2Constructor extends Object{

	//public Syntax2Constructor() {}
	
	public static void main(String[] args) {
		
		Syntax2Constructor s = new Syntax2Constructor();
		System.out.println(s);
		
		/* println(int v) / println(char v) / println(String v) 
		 * println(Object v)
		 * 
		 */
		System.out.println(1); // int 
		System.out.println('a'); // char
		System.out.println("string"); // char
			
	}

}