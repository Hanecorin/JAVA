/** 
 * PROJECT  : ��ɱ�� ������Ʈ
 * NAME  :  EndView.java
 * DESC  : ��� ��� ���� ��� Ŭ����
 * 
 * @author  
 * @version 1.0
*/

package probono.view;

import probono.model.dto.TalentDonationProject;

public class EndView {
	
	//�������� Ư�� ������Ʈ ��� 
	public static void projectView(TalentDonationProject project){
		if(project != null) {
			System.out.println(project);		
		}else {
			System.out.println("�ش� ������Ʈ�� �������� �ʽ��ϴ�.");
		}
	}
	
	//�������� ��� ������Ʈ ���
	public static void projectListView(TalentDonationProject [] allProbonoProject){
		int projectSize = allProbonoProject.length;
		
		for(int index = 0; index < projectSize; index++){			
			if(allProbonoProject[index] != null){
				System.out.println("[���� ���� project : " + (index+1) + "] " + allProbonoProject[index]);
			}
		}
	}
}
