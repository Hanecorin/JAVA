/** 
 * PROJECT  : 재능기부 프로젝트
 * NAME  :  TalentDonationProjectService.java
 * DESC  :  재능 기부 프로젝트를 저장, 수정, 삭제, 검색하는 서비스 로직
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
    /** 진행중인 Project를 저장하는 배열 
     * mysql table로 변환
     * */
    private TalentDonationProject[] donationProjectList = new TalentDonationProject[10];
    
    /** 진행중인 Project 총 개수 */
    private int index;
    private TalentDonationProjectService() {}
    public static TalentDonationProjectService getInstance() {
        return instance;
    }
    
    /**
     * 모든 Project 검색
     * 
     * @return 모든 Project
     */
    public TalentDonationProject[] getDonationProjectsList() {
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
     */
    public void donationProjectInsert(TalentDonationProject project) {
        donationProjectList[index] = project;  //0 1 2
        index++;  //index = index+1;
    }
    
    /**
     * Project의 기부자 수정 - 프로젝트 명으로 검색해서 해당 프로젝트의 기부자 수정
     * 
     * @param projectName 프로젝트 이름
     * @param people 기부자 
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
     * Project의 수혜자 수정 - 프로젝트 명으로 검색해서 해당 프로젝트의 수혜자 수정
     * 
     * @param projectName 프로젝트 이름
     * @param people 수혜자 
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
     * Project 삭제 - 프로젝트 명으로 해당 프로젝트 삭제
     * 
     * @param projectName 삭제하고자 하는 프로젝트 이름
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
     * 진행중인 Project 총 개수 반환
     * @return 개수
     */
    public int projectListSize() {
        return index;
    }
}