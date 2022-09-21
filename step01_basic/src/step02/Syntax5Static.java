/* 학습 
 * 1. static{}
 * 2. 이름이 없다 실행 방법? 	
 * 3. 언제 실행?
 * 4. 실행 횟수?
 * 	2+3+4 답 :	
 * 	byte code가 메모리(class or method area)에 로딩 되면서 단 한번만 실행
 * 
 * 5. 필요성
 * 	- 모든 user들이 공유하는 자원 단 한번만 초기화시에 주로 사용
 * 	- 서버가 시작할때 단 한번만 로딩해야 하는 초기자원 설정시 주로 사용
 * 
 * 6. 참고
 * 	- main() 특별한 메소드
 * 	 :  개발자가 test 용으로 사용
 * 	 웹기반으로 서비스 하는 모든 로직은 main없이 서버와 브라우저 필수
 */

package step02;

public class Syntax5Static {
	static{
		System.out.println(3);				
	}
	static{
		System.out.println(1);
	}
	static{
		System.out.println(2);		
	}
	
	public static void main(String[] args) {
		System.out.println("main");
	}
	

}