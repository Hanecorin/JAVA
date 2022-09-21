package view;

import controller.Controller;

public class StartView {

	public static void main(String[] args) {
		
		System.out.println("고객정보 검색 *****");
		Controller.reqRes(1);   // 고객 검색
		
		System.out.println("고객정보 정보 수정 및 검색 *****");
		Controller.reqRes(2);   // 고객 등급 수정
		Controller.reqRes(1); 
		
		System.out.println("무효한 검색 요청 *****");
		Controller.reqRes(3);
		
	}

}
