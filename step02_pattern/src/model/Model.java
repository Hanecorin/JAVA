// ���� db�� �����Ǵ� �ٽ�
package model;

import model.domain.Customer;

public class Model {
	
	private Customer c = new Customer("id01", 20, "vvip", 'F');  //�ܼ� test ������ ����
	
	public Model() {}
	
	//"id01"
	public Customer select(String id){
		//id������ �� ���� ������ �ִ� ����  ....
		return c; //new Customer("id01", 20, "vvip", 'F') �� �� �����͸� ������ ��ü ��ȯ
	}

	public boolean update(String id, String newGrade){
		//update customer set grade=? where id=? ���� ���� �����̶� ����
		c.setGrade(newGrade);// ���Ŀ� sql�� ó�� ����
		return true;		
	}
	
}