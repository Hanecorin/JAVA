package model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@ToString
public class Customer {
	private String id;
	private int pw;
	
	//toString() ������
	//equals() ������
	/* ���� Customer Ÿ���� ��ü�� ���� ���� ��(�����Ͱ�) 
	 * ������ true / �ٸ��� false
	 * 1. Customer Ÿ�� - instanceof 		
	 * 	1. �´� - id/pw ��
	 * 		- String ���� �񱳽� : equals() / int ���� �񱳽� : ==  
	 * 		1. �´� - true
	 * 		2. �ٸ��� - false
	 *  2. �ٸ��� - false
	 *  
	 *  t
	 */
	public boolean equals(Object o) { //o�� Customer �ڽĸ��� id/pw�� access �Ұ�
		if(o instanceof Customer) {
			Customer c = (Customer)o;
			if( id.equals(c.id) && pw == c.pw ) {
				return true;  //return �� �޼ҵ� ����
			}
		}
		
		return false;
	}
	
//	public boolean equals(Object o) { //o�� Customer �ڽĸ��� id/pw�� access �Ұ�
//		if(o instanceof Customer) {
//			Customer c = (Customer)o;
//			
//			if( id.equals(c.id) && pw == c.pw ) {
//				return true;
//			}else {
//				return false;
//			}
//		}else {
//			return false;
//		}				
//	}
//	
	
	
}