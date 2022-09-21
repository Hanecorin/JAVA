/** 
 * PROJECT  : ��ɱ�� ������Ʈ
 * NAME  :  Donator.java
 * DESC  :  ����� ����(Data)
 * 
 * @author  
 * @version 1.0
*/
package probono.model.dto;

public class Donator {
	/** ����� ��� */
	private int empno;
	
	/** ����� �̸� */
	private String ename;
	
	/** ����� �̸��� */
	private String email;
	
	/** ����� ��� */
	private String talent;

	public Donator() {}
	public Donator(int empno, String ename, String email, String talent) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.email = email;
		this.talent = talent;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTalent() {
		return talent;
	}

	public void setTalent(String talent) {
		this.talent = talent;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("��θ� ����ϴ� �����ȣ : ");
		builder.append(empno);
		builder.append(", ����� : ");
		builder.append(ename);
		builder.append(", �̸��� �ּ� : ");
		builder.append(email);
		builder.append(", ��� : ");
		builder.append(talent);
		return builder.toString();
	}
}