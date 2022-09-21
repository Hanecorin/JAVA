/* �̸�, ���� ���� ���õ� ����
 */

package model.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class People {
	//�̸�	
	private String name;
	
	//����(- + 32bit�� ����)
	//�ܺ� Ŭ�������� ȣ�� �Ұ�
	private int age;
	
	//age������ �����ϴ� ������ �޼ҵ�
	//1�� �̻��̾�� ��
	/* �ϳ��� ���ڸ� �޾Ƽ�
	 * 0�� �ʰ��� ������� Ȯ�� �Ŀ�
	 * ��ȿ�� ��� age ������ ����
	 * ��ȿ�� ��� ���� �޼��� ���	 */
	public void setAge(int newAge) {
		if(newAge > 0) {
			age = newAge;
		}else {
			System.out.println("��ȿ");
		}
	}
	
	//private���� �ܺο� ������ ���� ������ ��ȯ
	public int getAge() {
		return age;
	}
		
	//name������ ����
	//��� ������ ���� �������� ������ ��� ������ ���� ��� ������ this Ű���� �ʼ� 
	public void setName(String name) {
		this.name = name;
	}
	//name������ ��ȯ
	public String getName() {
		return name;
	}
}
