package view;

import model.domain.Plane;

public class SucceView {

	public static void printPlane(Plane p) {
		System.out.println("검색 기체 명 : " + p.getName() + p.getType());
	}
	
	public static void printYearDate(int yd) {
		System.out.println("기체 도입 시기 : " +  yd);
		
	}

}
