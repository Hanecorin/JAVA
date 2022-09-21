/** 
 * PROJECT  : ��ɱ�� ������Ʈ
 * NAME  :  TalentDonationType.java
 * DESC  :  ��ɱ�� ����(Data)
 * 
 * @author  
 * @version 1.0
*/
package probono.model.dto;

public class TalentDonationType {
	/** ��� ��� Ÿ��(����) */
	private String donationType; 
	
	/** ��� ��� Ȱ�� ���� */
	private String activityArea;
	
	/** ��� ��� Ȱ�� ���� */
	private String activityDetails;

	public TalentDonationType() {}
	public TalentDonationType(String probonoId, String probonoName, String probonoPurpose) {
		super();
		this.donationType = probonoId;
		this.activityArea = probonoName;
		this.activityDetails = probonoPurpose;
	}

	public String getProbonoId() {
		return donationType;
	}

	public void setProbonoId(String probonoId) {
		this.donationType = probonoId;
	}

	public String getProbonoName() {
		return activityArea;
	}

	public void setProbonoName(String probonoName) {
		this.activityArea = probonoName;
	}

	public String getProbonoPurpose() {
		return activityDetails;
	}

	public void setProbonoPurpose(String probonoPurpose) {
		this.activityDetails = probonoPurpose;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("��� Ÿ�� : ");
		builder.append(donationType);
		builder.append(", ��� Ȱ�� ���� : ");
		builder.append(activityArea);
		builder.append(", ��� Ȱ�� ���� : ");
		builder.append(activityDetails);
		return builder.toString();
	}
}
