/** 
 * PROJECT  : ��ɱ�� ������Ʈ
 * NAME  :  Beneficiary.java
 * DESC  :  ������ ����(Data)
 * 
 * @author  
 * @version 1.0
*/
package probono.model.dto;

public class Beneficiary {
	/** ������ ��ȣ */
	private int no;

	/** ������ �̸� */
	private String name;

	/** ������ ����ó */
	private String contactInformation;

	/** ���ùޱ� ����ϴ� ��� Ÿ�� */
	private String requestType;

	public Beneficiary() {}
	public Beneficiary(int no, String name, String contactInformation, String requestType) {
		super();
		this.no = no;
		this.name = name;
		this.contactInformation = contactInformation;
		this.requestType = requestType;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(String contactInformation) {
		this.contactInformation = contactInformation;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("������ ��ȣ : ");
		builder.append(no);
		builder.append(", ������ �̸� : ");
		builder.append(name);
		builder.append(", ������ ����ó : ");
		builder.append(contactInformation);
		builder.append(", �����ڰ� ����ϴ� ��� ���� : ");
		builder.append(requestType);
		return builder.toString();
	}
}