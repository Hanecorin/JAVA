/** 
 * PROJECT  : ��ɱ�� ������Ʈ
 * NAME  :  TalentDonationProject.java
 * DESC  :  �������� ������Ʈ ����(Data)
 * 
 * @author  
 * @version 1.0
*/
package probono.model.dto;

public class TalentDonationProject {

	/** ������Ʈ ���� �̸� */
	private String talentDonationProjectName;

	/** ����� */
	private Donator projectDonator;

	/** ������ */
	private Beneficiary projectBeneficiary;

	/** ��� ��� Ÿ�� */
	private TalentDonationType talentDonationType;

	/** ������Ʈ ������ */
	private String startDate;

	/** ������Ʈ ������ */
	private String endDate;

	/** ����Ǵ� project�� �� ���� */
	private String talentDonationProjectDetail;

	public TalentDonationProject() {
		super();
	}
	public TalentDonationProject(String talentDonationProjectName, Donator projectDonator,
			Beneficiary projectBeneficiary, TalentDonationType talentDonationType, String startDate, String endDate,
			String talentDonationProjectDetail) {
		super();
		this.talentDonationProjectName = talentDonationProjectName;
		this.projectDonator = projectDonator;
		this.projectBeneficiary = projectBeneficiary;
		this.talentDonationType = talentDonationType;
		this.startDate = startDate;
		this.endDate = endDate;
		this.talentDonationProjectDetail = talentDonationProjectDetail;
	}

	public String getTalentDonationProjectName() {
		return talentDonationProjectName;
	}

	public void setTalentDonationProjectName(String talentDonationProjectName) {
		this.talentDonationProjectName = talentDonationProjectName;
	}

	public Donator getProjectDonator() {
		return projectDonator;
	}

	public void setProjectDonator(Donator projectDonator) {
		this.projectDonator = projectDonator;
	}

	public Beneficiary getProjectBeneficiary() {
		return projectBeneficiary;
	}

	public void setProjectBeneficiary(Beneficiary projectBeneficiary) {
		this.projectBeneficiary = projectBeneficiary;
	}

	public TalentDonationType getTalentDonationType() {
		return talentDonationType;
	}

	public void setTalentDonationType(TalentDonationType talentDonationType) {
		this.talentDonationType = talentDonationType;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getTalentDonationProjectDetail() {
		return talentDonationProjectDetail;
	}

	public void setTalentDonationProjectDetail(String talentDonationProjectDetail) {
		this.talentDonationProjectDetail = talentDonationProjectDetail;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("������Ʈ�� : ");
		builder.append(talentDonationProjectName);
		builder.append(", ����� : ");
		builder.append(projectDonator);
		builder.append(", ������ : ");
		builder.append(projectBeneficiary);
		builder.append(", ����Ǵ� ��� Ÿ�� : ");
		builder.append(talentDonationType);
		builder.append(", ��� ������ : ");
		builder.append(startDate);
		builder.append(", ��� ������ : ");
		builder.append(endDate);
		builder.append(", ��� �� ���� : ");
		builder.append(talentDonationProjectDetail);
		return builder.toString();
	}
}