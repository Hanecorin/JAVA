/* 
 * PROJECT  : 재능기부 프로젝트
 * NAME  :  TalentDonationProjectService.java
 * DESC  :  재능 기부 프로젝트를 저장, 수정, 삭제, 검색하는 서비스 로직
 * 
 * @author  
 * @version 1.0
*/

package probono.service;

import java.util.ArrayList;

import probono.model.dto.Beneficiary;
import probono.model.dto.Donator;
import probono.model.dto.TalentDonationProject;

public class TalentDonationProjectService {

	private static TalentDonationProjectService instance = new TalentDonationProjectService();

	/** 진행중인 Project를 저장하는 배열 
	 * mysql table로 변환
	 * */
	private ArrayList<TalentDonationProject> donationProjectList = new ArrayList<TalentDonationProject>();
	
	private TalentDonationProjectService() {}

	public static TalentDonationProjectService getInstance() {
		return instance;
	}
	

	/**
	 * 모든 Project 검색
	 * 
	 * @return 모든 Project
	 */
	public ArrayList<TalentDonationProject> getDonationProjectsList() {
		return donationProjectList;
	}

	
	// TO DO  service.getDonationProject("01슈바이처");
	/* 배열 내부에 저장된 TalentDonationProject의 프로젝트명 검색 및 비교해서 일치되는 객체 반환
	 * 
	 */
	/** 
	 * Project 이름으로 검색 - 객체된 Project 반환하기
	 * 
	 * @param projectName 프로젝트 이름
	 * @return TalentDonationProject 검색된 프로젝트 
	 */
	public TalentDonationProject getDonationProject(String projectName) {
		
		for(TalentDonationProject project : donationProjectList) {
			
			if(project != null && project.getTalentDonationProjectName().equals(projectName)) {
				return project;
			}
			
		}
		
		return null;
	}
	

	// TO DO
	/**
	 * 새로운 Project 추가 
	 * 
	 * @param project 저장하고자 하는 새로운 프로젝트
	 * 
	 * pk라는 project명이 중복된 경우 발생되는 예외 상황을 처리
	 * end user : 정상 저장 경우 / 비정상 저장 시도 인지
	 * 예외 처리 적용
	 * 	- pk 중복(project명) 여부 검증
	 * 		-  중복이 아님 : 저장
	 * 		-  중복 : 예외 발생
	 * 
	 * 예외 발생 시 호출한 곳으로 예외처리 하여 문제 발생 파악
	 * 
	 */
	public void donationProjectInsert(TalentDonationProject project) throws Exception {
		TalentDonationProject p = getDonationProject(project.getTalentDonationProjectName());
		if(p != null) { // 존재함 의미, 저장 불가 단 예외 발생
			// throw : 예외를 명시적으로 생성하여 발생시킬 경우만 사용되는 코드
			// 해당코드가 존재하는 모든 메소드는 선언구에 throws 필수
			throw new Exception("프로젝트명 중복"); // 이 로직 실행 시 메소드 종료
		}
		donationProjectList.add(project);		
	}

	
	/**
	 * Project의 기부자 수정 - 프로젝트 명으로 검색해서 해당 프로젝트의 기부자 수정
	 * 
	 * @param projectName 프로젝트 이름
	 * @param people 기부자 
	 */
	public void donationProjectUpdate(String projectName, Donator people) {
		//배열과 list에서 데이터 하나하나 착출하는 반복문 동일(for each)
		for (TalentDonationProject project : donationProjectList) {
			
			if (project != null && project.getTalentDonationProjectName().equals(projectName)) {
				
				project.setProjectDonator(people);
				
				break;
			}
		}
	}
	
	
	//TO DO
	/**
	 * Project의 수혜자 수정 - 프로젝트 명으로 검색해서 해당 프로젝트의 수혜자 수정
	 * 
	 * @param projectName 프로젝트 이름
	 * @param people 수혜자 
	 */
	public void beneficiaryProjectUpdate(String projectName, Beneficiary people) {
		
		for (TalentDonationProject project : donationProjectList) {
			
			if (project != null && project.getTalentDonationProjectName().equals(projectName)) {
				
				project.setProjectBeneficiary(people);
				
				break;
			}
		}
		
	}
	
	
	//TO DO
	/**
	 * Project 삭제 - 프로젝트 명으로 해당 프로젝트 삭제
	 * 
	 * @param projectName 삭제하고자 하는 프로젝트 이름
	 */
	public void donationProjectDelete(String projectName) {
		TalentDonationProject project = getDonationProject(projectName);
		
		if(project != null) {	
			donationProjectList.remove(project);
		}		
		
	}
	
//	public void donationProjectDelete(String projectName) {
//		
//		for (TalentDonationProject project : donationProjectList) {
//			
//			if (project != null && project.getTalentDonationProjectName().equals(projectName)) {
//				
//				donationProjectList.remove(project);
//				
//				break;
//			}
//		}
//		
//	}

}