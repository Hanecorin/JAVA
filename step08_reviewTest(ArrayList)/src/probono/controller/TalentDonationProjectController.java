package probono.controller;

import probono.model.dto.TalentDonationProject;
import probono.service.TalentDonationProjectService;
import probono.view.FailView;
import probono.view.SuccessView;

public class TalentDonationProjectController {
	private static TalentDonationProjectService model = TalentDonationProjectService.getInstance();

	/* INSERT 실행 로직 
	 * StartView가 데이터 저장을 위해 전송
	 * Model 로직 즉 service 로직 실행
	 * 예외 발생 시 FailView로 출력 위임
	 * 정상 실행 시 SuccessView로 저장 성공 출력 위임  
	 */
	
	public static void donationProjectInsert(TalentDonationProject project) {
		try {
			model.donationProjectInsert(project);
			SuccessView.succMsg("저장 성공");
		}catch(Exception e) {
			e.printStackTrace();
			FailView.failMsg("project명 중복");
		}
		
	}
}