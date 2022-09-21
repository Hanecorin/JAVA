/** 
 * PROJECT  : ��ɱ�� ������Ʈ
 * NAME  :  TalentDonationProjectService.java
 * DESC  :  ��� ��� ������Ʈ�� ����, ����, ����, �˻��ϴ� ���� ����
 * 
 * @author  
 * @version 1.0
*/
package probono.service;
import probono.model.dto.Beneficiary;
import probono.model.dto.Donator;
import probono.model.dto.TalentDonationProject;
public class TalentDonationProjectService {
    private static TalentDonationProjectService instance = new TalentDonationProjectService();
    /** �������� Project�� �����ϴ� �迭 
     * mysql table�� ��ȯ
     * */
    private TalentDonationProject[] donationProjectList = new TalentDonationProject[10];
    
    /** �������� Project �� ���� */
    private int index;
    private TalentDonationProjectService() {}
    public static TalentDonationProjectService getInstance() {
        return instance;
    }
    
    /**
     * ��� Project �˻�
     * 
     * @return ��� Project
     */
    public TalentDonationProject[] getDonationProjectsList() {
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
     */
    public void donationProjectInsert(TalentDonationProject project) {
        donationProjectList[index] = project;  //0 1 2
        index++;  //index = index+1;
    }
    
    /**
     * Project�� ����� ���� - ������Ʈ ������ �˻��ؼ� �ش� ������Ʈ�� ����� ����
     * 
     * @param projectName ������Ʈ �̸�
     * @param people ����� 
     */
    public void donationProjectUpdate(String projectName, Donator people) {
        TalentDonationProject project = null;
        
        for (int i = 0; i < index; i++) {
            project = donationProjectList[i];
            
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
        TalentDonationProject project = null;
        
        for (int i = 0; i < index; i++) {
            project = donationProjectList[i];
            
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
        
        TalentDonationProject project = null;
        
        for (int i = 0; i < index; i++) {
            project = donationProjectList[i];
            
            if (project != null && project.getTalentDonationProjectName().equals(projectName)) {
                
                donationProjectList[i] = null;
                
                break;
            }
        }
        
    }
    
    /**
     * �������� Project �� ���� ��ȯ
     * @return ����
     */
    public int projectListSize() {
        return index;
    }
}