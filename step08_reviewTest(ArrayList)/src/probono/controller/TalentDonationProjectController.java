package probono.controller;

import probono.model.dto.TalentDonationProject;
import probono.service.TalentDonationProjectService;
import probono.view.FailView;
import probono.view.SuccessView;

public class TalentDonationProjectController {
	private static TalentDonationProjectService model = TalentDonationProjectService.getInstance();

	/* INSERT ���� ���� 
	 * StartView�� ������ ������ ���� ����
	 * Model ���� �� service ���� ����
	 * ���� �߻� �� FailView�� ��� ����
	 * ���� ���� �� SuccessView�� ���� ���� ��� ����  
	 */
	
	public static void donationProjectInsert(TalentDonationProject project) {
		try {
			model.donationProjectInsert(project);
			SuccessView.succMsg("���� ����");
		}catch(Exception e) {
			e.printStackTrace();
			FailView.failMsg("project�� �ߺ�");
		}
		
	}
}