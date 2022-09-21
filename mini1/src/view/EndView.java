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
			System.out.println("��� empId ����");
		}
	}
	
	
	public static void ListView(ArrayList<Table> all){
		
			int index = 1;
			for(Table t : all) {
				
				if(t != null){
					// index++ 1�� ���� ��Ű�� ������ : index ������ ��� �� ; ����� 1����
					// ++index 1�� ���� ��Ű�� ������ : ������ ���·� index ������ 
					System.out.println("[��� : " + (index++) + "] " + t);
				}
				
			}
		}
	
	public static void DeleteExcept(int empId) {
		try {
			c.Delete(empId);
			SuccessView.SuccMsg("���� �Ϸ�");
		}catch(Exception e) {
			e.printStackTrace();
			FailView.failMsg("��� empId ����");
		}
		
	}
}