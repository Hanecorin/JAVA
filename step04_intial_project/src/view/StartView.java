package view;

import controller.Controller;

public class StartView {

	public static void main(String[] args) {
		System.out.println("*** 기체 정보 검색 ***");
		Controller.reqRes(1);
		System.out.println(" ");
		
		System.out.println("*** 세부 정보 검색 ***");
		Controller.reqRes(2);
		System.out.println(" ");
		
		System.out.println("*** 무효한 검색 ***");
		Controller.reqRes(3);
	}

}
