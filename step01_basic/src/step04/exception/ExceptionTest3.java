package step04.exception;

import org.apache.log4j.Logger;

import uer.exception.InvalidateException;

public class ExceptionTest3 {
	
	static Logger logger = Logger.getLogger("ExceptionTest3");
	// admin 이 아니면(조건) 예외 발생(개발자가 코드로 생성해서 던짐) 하고 예외 발생시 log기록
	static void loginCheck(String id) throws InvalidateException {
		if( !id.equals("amdin") ) { //admin이 아닌 경우 true  (!false) -> true
//			throw new Exception("너 누구니? ");
			throw new InvalidateException("로그인을 시도한 무효한 id : " + id);
		}
		System.out.println("관리자님 안녕하세요");
	}
	
	public static void main(String[] args) {
		try {
			loginCheck("amdin");
			loginCheck("test");
		} catch (InvalidateException e) {
			e.printStackTrace();
			//예외 객체가 보유하고 있는 문자열 데이터 출력
//			System.out.println(e.getMessage());
			logger.info(e.getMessage());
		}
		

	}

}