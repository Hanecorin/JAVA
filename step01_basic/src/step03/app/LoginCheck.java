/* 총 리뷰
 * 1. 웹 개발이라 가정
 * 2. id/pw - pdman/11만 유효하다 가정
 * 3. 쇼핑몰 or 금융 or 신용정보 관리 회사등 고객 정보가 중요한 회사 관리자
 * 4. 고려 사항
 * 	1. 유효한 인증
 *  2. 어떤 시점이든 로그인 시도자들이 단순 오타로 로그인 실패
 *     아니면 의도적으로 악의적으로 로그인 시도하려고 하는지등..
 *     id값? pw? 기록 권장
 *     접속하는 system ip등 기록
 *     ... 
 * 5. 로그인 검증 해서 유효한 경우 "안녕하세요"
 *    무효한 경우 로그기록 및 "다시 재 시도 하세요"     
 * 	  ?별도의 메소드로 구현 하시고, main메소드에서 호출해서 로직 검증 하세요     
 *    
 */
package step03.app;

import org.apache.log4j.Logger;

public class LoginCheck {
	static Logger logger = Logger.getLogger("LoginCheck");
	
	public static void loginCheck(String id, int pw) {
		
		if(id.equals("pdman") && pw == 11) {
			System.out.println("안녕하세요");
		}else {
			logger.info("login 시 무효한 id " + id);
			
			System.out.println("다시 재 시도 하세요");
		}
	}
	
	public static void main(String[] args) {
		loginCheck("pdman" , 11);
		loginCheck("pd33" , 11);
		loginCheck("ptest" , 11);
	}

}