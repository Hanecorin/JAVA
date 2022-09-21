package view;

import controller.Controller;

public class StartView {

	public static void main(String[] args) {
		System.out.println("*** 학생 정보 검색 ***");
		Controller.reqRes(1);
		
		System.out.println("*** 강사 이름 검색 ***");
		Controller.reqRes(2);
		
		System.out.println("*** 무효한 검색 검색 ***");
		Controller.reqRes(3);
	}

}