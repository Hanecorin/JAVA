/* 
 * PROJECT  : ��ɱ�� ������Ʈ
 * NAME  :  TalentDonationProjectService.java
 * DESC  :  ��� ��� ������Ʈ�� ����, ����, ����, �˻��ϴ� ���� ����
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

	/** �������� Project�� �����ϴ� �迭 
	 * mysql table�� ��ȯ
	 * */
	private ArrayList<TalentDonationProject> donationProjectList = new ArrayList<TalentDonationProject>();
	
	private TalentDonationProjectService() {}

	public static TalentDonationProjectService getInstance() {
		return instance;
	}
	

	/**
	 * ��� Project �˻�
	 * 
	 * @return ��� Project
	 */
	public ArrayList<TalentDonationProject> getDonationProjectsList() {
		return donationProjectList;
	}

	
	// TO DO  service.getDonationProject("01������ó");
	/* �迭 ���ο� ����� TalentDonationProject�� ������Ʈ�� �˻� �� ���ؼ� ��ġ�Ǵ� ��ü ��ȯ
	 * 
	 */
	/** 
	 * Project �̸����� �˻� - ��ü�� Project ��ȯ�ϱ�
	 * 
	 * @param projectName ������Ʈ �̸�
	 * @return TalentDonationProject �˻��� ������Ʈ 
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
	 * ���ο� Project �߰� 
	 * 
	 * @param project �����ϰ��� �ϴ� ���ο� ������Ʈ
	 * 
	 * pk��� project���� �ߺ��� ��� �߻��Ǵ� ���� ��Ȳ�� ó��
	 * end user : ���� ���� ��� / ������ ���� �õ� ����
	 * ���� ó�� ����
	 * 	- pk �ߺ�(project��) ���� ����
	 * 		-  �ߺ��� �ƴ� : ����
	 * 		-  �ߺ� : ���� �߻�
	 * 
	 * ���� �߻� �� ȣ���� ������ ����ó�� �Ͽ� ���� �߻� �ľ�
	 * 
	 */
	public void donationProjectInsert(TalentDonationProject project) throws Exception {
		TalentDonationProject p = getDonationProject(project.getTalentDonationProjectName());
		if(p != null) { // ������ �ǹ�, ���� �Ұ� �� ���� �߻�
			// throw : ���ܸ� ��������� �����Ͽ� �߻���ų ��츸 ���Ǵ� �ڵ�
			// �ش��ڵ尡 �����ϴ� ��� �޼ҵ�� ���𱸿� throws �ʼ�
			throw new Exception("������Ʈ�� �ߺ�"); // �� ���� ���� �� �޼ҵ� ����
		}
		donationProjectList.add(project);		
	}

	
	/**
	 * Project�� ����� ���� - ������Ʈ ������ �˻��ؼ� �ش� ������Ʈ�� ����� ����
	 * 
	 * @param projectName ������Ʈ �̸�
	 * @param people ����� 
	 */
	public void donationProjectUpdate(String projectName, Donator people) {
		//�迭�� list���� ������ �ϳ��ϳ� �����ϴ� �ݺ��� ����(for each)
		for (TalentDonationProject project : donationProjectList) {
			
			if (project != null && project.getTalentDonationProjectName().equals(projectName)) {
				
				project.setProjectDonator(people);
				
				break;
			}
		}
	}
	
	
	//TO DO
	/**
	 * Project�� ������ ���� - ������Ʈ ������ �˻��ؼ� �ش� ������Ʈ�� ������ ����
	 * 
	 * @param projectName ������Ʈ �̸�
	 * @param people ������ 
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
	 * Project ���� - ������Ʈ ������ �ش� ������Ʈ ����
	 * 
	 * @param projectName �����ϰ��� �ϴ� ������Ʈ �̸�
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