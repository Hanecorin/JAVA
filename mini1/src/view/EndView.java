package view;

import java.util.ArrayList;

import controller.Controller;
import model.domain.Table;


public class EndView {
	
	static Controller c = Controller.getInstance();
	
	public static void empView(Table t){
		if(t != null) {
			System.out.println(t);		
		}else {
			System.out.println("대상 empId 없음");
		}
	}
	
	
	public static void ListView(ArrayList<Table> all){
		
			int index = 1;
			for(Table t : all) {
				
				if(t != null){
					// index++ 1씩 증가 시키는 시점은 : index 변수값 사용 후 ; 종료시 1증가
					// ++index 1씩 증가 시키는 시점은 : 증가된 상태로 index 변수값 
					System.out.println("[사원 : " + (index++) + "] " + t);
				}
				
			}
		}
	
	public static void DeleteExcept(int empId) {
		try {
			c.Delete(empId);
			SuccessView.SuccMsg("삭제 완료");
		}catch(Exception e) {
			e.printStackTrace();
			FailView.failMsg("대상 empId 없음");
		}
		
	}
}