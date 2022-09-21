/* �н� ����
 * 1. builder pattern �̿��ؼ� ��ü �����ϴ� ��� ���� ����
 * 2. �� ����
 * 	- �ʿ��� ��� �������� ��ü ���������� �ʱ�ȭ ������ ����
 *  - ����
 *  	- �����Ͱ� ���� ��� ������ �ټ��� Ŭ������ ��ü �����ÿ� ȿ����
 *  - ��? �ټ��� ������ �߿��� �����ؼ� ������ �ʱ�ȭ �����ϱ� ����
 *  - ���� ���� ��������
 *  	��ü �����Ŀ� setXxx() ȣ�� ���� �ƴ� 
 * 
 */
package model.domain;

import org.junit.Test;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@NoArgsConstructor //�⺻ ������
//@AllArgsConstructor
@Getter
@Setter
@Builder
public class Customer {
	private String id;
	private int age;
	private String grade;
	private char gender; //f, m

	/*
	public Customer(String id) {
		this.id = id;
	}
	public Customer(int age) {
		this.age = age;
	}
	public Customer(String id, int age) {
		this.id = id;
		this.age = age;
	}
	public Customer(int age, String grade) {
		this.age = age;
		this.grade = grade;
	}	
	public Customer(int age, String id) {
		this.age = age;
		this.id = id;
	}	*/
	
	
	//�ܼ� test  - ���߽� �ǽð� test�� ��� �� ���� ���񽺸� ���� ������ �����ÿ��� �����ϴ� ���� test
	/* �ڼҼ��� �ۼ��ϴ� ������ - �ش� �ۼ��� ���κ� ����
	 * 30���� �����Ͱ� ���� / 30���� ���� / table�� ���� : 30���� �÷�
	 * ��� �ڼҼ��� ��� �׸� 100% �� �ۼ� ����Ұ� 
	 * �ɼ�
	 * ���� �ڹ� �������� �Էµ� �����ͷ� �ش� Customer ��ü �����̶� ������
	 *  30���� parameter�� �ִ� ������ �ʿ�
	 *  �ɼ��� ������ �� ��ŭ�� parameter�� �ִ� ������ �ʿ�
	 *  �� �پ��� ������ ���� �ʿ�
	 *  ����
	 *  	�ɼ� �׸��� ������� �ٸ���
	 *  	 � ������ ������ �ϰ� � ������??? �̽� �߻� 
	 */
	
	//@Test
//	public void run() {
	public static void main(String [] args) {
		//�⺻ �����ڷ� ȣ���ؼ� ��ü ����
//		Customer c1 = new Customer();
//		c1.setId("id01");
		
	/* CustomerBuilder 
	 * 	�ֿ뵵 : ������ �����ؼ� ������� �ʱ�ȭ �����ϰ� ���ִ� ��ü
	 *  Customer ��� ��ü�� ����(�����)�ϴ� API
	 *  @Builder�� ���� �ڵ� ����
	 *  �ش� Ŭ������ �����ϰ� �Ǵ� ����
	 *  	Customer�� ��� ��� ������ ������� ������ �޼ҵ� �ڵ� ����
	 *  
	 *  Ȱ�� ����
	 *  Customer.builder()  ��ȯ Ÿ��  CustomerBuilder
	 *  id() ��ȯ Ÿ�� CustomerBuilder
	 *  build() ��ȯ Ÿ�� Customer
	 */
		// ��� �������� ��ü ���� ������ �ڵ� �ʱ�ȭ
		//id���� ����� �ʱ�ȭ
		//�޼ҵ� ȣ���� �����ؼ� �޼ҵ� ȣ�� ü�̴� ��� �� ������ �ʱ�ȭ
		Customer c2 = Customer.builder().id("id01").build();	
		System.out.println(c2.id + " " + c2.age + " " + c2.gender);
	
	}

}