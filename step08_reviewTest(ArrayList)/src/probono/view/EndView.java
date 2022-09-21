/* 
 * PROJECT  : 재능기부 프로젝트
 * NAME  :  EndView.java
 * DESC  : 재능 기부 정보 출력 클래스
 * 
 * @author  
 * @version 1.0
*/

package probono.view;

import java.util.ArrayList;

import probono.model.dto.TalentDonationProject;

public class EndView {
	
	//진행중인 특정 프로젝트 출력 
	public static void projectView(TalentDonationProject project){
		if(project != null) {
			System.out.println(project);		
		}else {
			System.out.println("해당 프로젝트는 존재하지 않습니다.");
		}
	}
	
	//진행중인 모든 프로젝트 출력
	/* allProbonoProject 참조하는 배열의 크기는 10 단 저장된 데이터 개수 3개
	 * private TalentDonationProject[] donationProjectList = new TalentDonationProject[10];
	 * 10개의 메모리, 3개의 객체만 저장, 저장된 객체는 TalentDonationProject 객체
	 * 나머지 7개의 메모리는 어떤 데이터? null
	 * 
	 * 
	 * allProbonoProject[index]
	 * allProbonoProject : TalentDonationProject []
	 * allProbonoProject[0] : TalentDonationProject 객체
	 * 
	 */
	public static void projectListView(ArrayList<TalentDonationProject> allProbonoProject){
		
		
		int index = 1;
		for(TalentDonationProject project : allProbonoProject) {
			
			if(project != null){
				// index++ 1씩 증가 시키는 시점은 : index 변수값 사용 후 ; 종료시 1증가
				// ++index 1씩 증가 시키는 시점은 : 증가된 상태로 index 변수값 
				System.out.println("[진행 중인 project : " + (index++) + "] " + project);
			}
			
		}
	}
}