/* 브라우저 화면단에서 
 * 1 로 요청시 - 고객 한명 검색이라 가정
 * 2 로 요청시 - 고객 정보(등급) 수정
 * 
 함수 호출과 동시에 전달해 주는 값은 argument,
 함수 선언 시 입력값으로 설정한 변수가 parameter
 * 
 */

package controller;

import model.Model;
import model.domain.Customer;  //ctrl shift o 가 자동 완성
import view.FailView;
import view.SuccessView;

public class Controller {
	
	private static Model m = new Model();   // Controller 객체 생성없이도 사용 가능한 변수
	
	public static void reqRes(int reqNo){
		
		if(reqNo == 1) {  
			/* SuccessView.print(m.select("id01"));
			 * 
			 * SuccessView의 print() 호출 시작
			 * 단 parameter(argument, 매개변수, 인자, 인수...) 먼저 완성
			 * 따라서 m.select("id01") 먼저 실행
			 * id01이라는 완벽한 문제열 객체를 생성 후 selelct 메소드 parameter로 적용
			 */
			SuccessView.print( m.select("id01")  )  ;// "id01", 20, "vvip", 'F'
			
		}else if(reqNo == 2){ 
			boolean result = m.update("id01", "vip");
			
			if(result == true) {
				SuccessView.printMsg("고객 정보수정 성공");
			}else {
				SuccessView.printMsg("고객 정보 수정 실패");
			}
			
		}else {
			FailView.print("너 누구야???");
		}
		//..
	}
	
}