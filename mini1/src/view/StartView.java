package view;

import java.util.ArrayList;

import controller.Controller;
import model.Model;
import model.domain.Table;


public class StartView {
	
	
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		
		Controller c = Controller.getInstance();
		Model m = new Model();
		
		System.out.println("*** 00. DataBase LoginCheck ***");
		LoginCheck.loginCheck("Admin", 20220809);
		
		
		System.out.println("\n*** 01. Project 생성 ***");
		c.Insert(m.notnew1);
		c.Insert(m.notnew2);
		c.Insert(m.notnew3);
		c.Insert(m.notnew4);
		c.Insert(m.newcomer1);
		c.Insert(m.newcomer2);
		c.Insert(m.newcomer3);
		c.Insert(m.newcomer4);
		c.Insert(m.newcomer5);
		c.Insert(m.newcomer6);
		
		c.Insert(m.newcomer1);
		
        System.out.println("\n*** 02. 모든 직원 데이터 검색 ***");
		ArrayList<Table> all = c.getTableList();		
		EndView.ListView(all);	
		
		System.out.println("\n*** 03-1. 조건(직원 아이디) 검색 ***");
		Table t1 = c.getEmp_id(11);
		EndView.empView(t1);
		
		System.out.println("\n*** 03-2. 신입 직원 검색 ***");
		c.newEmp_id();
		
		
		EndView.empView(c.getEmp_id(21));
		
		System.out.println("\n*** 04-1. 해당 직원 데이터의 상사(mgrId) 바꾸기  ***");
		c.mgrIdUpdate(01, 12);
		Table t2 = c.getEmp_id(01);
		EndView.empView(t2);
		System.out.println("\n*** 04-2. 해당 직원 데이터의 근무지(loc) 바꾸기  ***");
		c.locUpdate(01, "Busan");
		Table t3 = c.getEmp_id(01);
		EndView.empView(t3);
		
		System.out.println("\n*** 05. 해당 직원 데이터 삭제하기  ***");
		EndView.DeleteExcept(01);
		EndView.DeleteExcept(01);
		
		EndView.ListView(all);
		
		// 프로젝트 하면서 느낀점
		// - 알고리즘 처럼 수학적으로 머리가 아픈게 아니고 변수 설정, 클래스 불러오기, 스태틱과 같은 기 개념이 어려웠다. 
		// - 이번 프로젝트를 협업하면서 앞으로 실무를 어떻게 해야할지 미리 경험해봤다. 
		// - 기능을 직접 구현하면서 배웠던 강의를 복습할 기회가 더 많았다.
		
		
	
	}

}