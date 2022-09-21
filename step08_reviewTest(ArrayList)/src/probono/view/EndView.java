/* 
 * PROJECT  : ��ɱ�� ������Ʈ
 * NAME  :  EndView.java
 * DESC  : ��� ��� ���� ��� Ŭ����
 * 
 * @author  
 * @version 1.0
*/

package probono.view;

import java.util.ArrayList;

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
	/* allProbonoProject �����ϴ� �迭�� ũ��� 10 �� ����� ������ ���� 3��
	 * private TalentDonationProject[] donationProjectList = new TalentDonationProject[10];
	 * 10���� �޸�, 3���� ��ü�� ����, ����� ��ü�� TalentDonationProject ��ü
	 * ������ 7���� �޸𸮴� � ������? null
	 * 
	 * 
	 * allProbonoProject[index]
	 * allProbonoProject : TalentDonationProject []
	 * allProbonoProject[0] : TalentDonationProject ��ü
	 * 
	 */
	public static void projectListView(ArrayList<TalentDonationProject> allProbonoProject){
		
		
		int index = 1;
		for(TalentDonationProject project : allProbonoProject) {
			
			if(project != null){
				// index++ 1�� ���� ��Ű�� ������ : index ������ ��� �� ; ����� 1����
				// ++index 1�� ���� ��Ű�� ������ : ������ ���·� index ������ 
				System.out.println("[���� ���� project : " + (index++) + "] " + project);
			}
			
		}
	}
}