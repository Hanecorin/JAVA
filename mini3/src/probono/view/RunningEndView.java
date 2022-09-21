package probono.view;

import java.util.ArrayList;
import java.util.List;

import probono.model.entity.ActivistDTO;
import probono.model.entity.ProbonoProjectDTO;

public class RunningEndView {
	
	//��� ������Ʈ ���
	public static void projectListView(ArrayList<ProbonoProjectDTO> activistListlProbonoProject){
		
		int listSize = activistListlProbonoProject.size();
		
		if(listSize != 0) {
			int count = 1;
			
			for(ProbonoProjectDTO p : activistListlProbonoProject) {
				// ; ���� ����� count ������ 1 ����
				System.out.println("�˻� ���� " + (count++) + " - " + p); 
			} 
			
		}else {
			System.out.println("�˻� ���� 0");
		}
	}
	
	// ������ activist view method�� �����ؼ� ���׸� ����
	public static void activistListView(List<ActivistDTO> list) {
		int listSize = list.size();
		
		if(listSize != 0) {
			int count = 1;
			for(ActivistDTO a : list) {
				System.out.println("�˻� ���� " + (count++) + " - " + a);
			}
		} else {
			System.out.println("�˻� ���� 0");
		}
	}
		
	//Ư�� ������Ʈ ��� 
	public static void projectView(ProbonoProjectDTO project){
		System.out.println(project);		
	}
	
	//?? ��� DTO ���� ����ϴ� �޼ҵ�
	// upcasting Ȱ��
	public static void allView(Object object){
		System.out.println(object);
	}
	
	//���� ��Ȳ ���
	public static void showError(String message){
		System.out.println(message);		
	}
}