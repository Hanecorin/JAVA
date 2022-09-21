package controller;

import model.Model;
import model.domain.Student;
import view.FailView;
import view.SuccessView;

public class Controller {
	//1 요청은 학생 정보 검색으로 가정, 2는 강사명 검색으로 간주
	/* Model의 메소드들 필요
	 * user(end user, client)별 요청하는 기능이 다 달라
	 * 요청 마다 Model 객체 생성 비효율적 X
	 * 개발 방법 1 - 하나의 Model 객체 생성해서 모든 로직이 공유
	 * 		- 강제적으로 서버 내부에 단일 객체 수가 되겠금 코드로 보장
	 * 		- singleton design pattern
	 * 
	 * 개발 방법 2 - Model 의 메소드드을 static으로 선언 
	 * 	- Model.queryStudent()
	 */
	private static Model m = Model.getInstance();
	
	public static void reqRes(int no) {
		if (no == 1) { //학생 정보 검색
			/* queryStudent()
			 * Student or null 반환  
			 * 호출한 코드 관점에서 고려해야 할 경우의 수
			 * 	경우의 수1 : 정상 검색 Student 객체
			 * 		출력
			 *  경우의 수2 : 해당 데이터가 없어서 null값
			 *  	해당 학생 정보가 ..없으니 재 확인 하세요
			 */
			Student stu01 = m.queryStudent("연아");
			
			if(stu01 != null) {
				SuccessView.printStudent(stu01);
			}else {
				FailView.printMsg("해당 학생은 존재하지 않습니다.");
			}	
			
		}else if(no == 2){ //강사명 요청
			
			SuccessView.printTeacherName(m.queryTeacherName("영어"));
			
		}else {
			FailView.printMsg("너 누구야? 여기서 왜이래? 가!!");
		}

	}
}