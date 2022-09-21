package view;

import java.util.ArrayList;

import controller.Controller;
import model.Model;
import model.domain.Table;


public class StartView {
	
	
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		
		Controller c = Controller.getInstance();
		Model m = new Model();
		
		System.out.println("*** 00. DataBase LoginCheck ***");
		LoginCheck.loginCheck("Admin", 20220809);
		
		
		System.out.println("\n*** 01. Project ���� ***");
		c.Insert(m.notnew1);
		c.Insert(m.notnew2);
		c.Insert(m.notnew3);
		c.Insert(m.notnew4);
		c.Insert(m.newcomer1);
		c.Insert(m.newcomer2);
		c.Insert(m.newcomer3);
		c.Insert(m.newcomer4);
		c.Insert(m.newcomer5);
		c.Insert(m.newcomer6);
		
		c.Insert(m.newcomer1);
		
        System.out.println("\n*** 02. ��� ���� ������ �˻� ***");
		ArrayList<Table> all = c.getTableList();		
		EndView.ListView(all);	
		
		System.out.println("\n*** 03-1. ����(���� ���̵�) �˻� ***");
		Table t1 = c.getEmp_id(11);
		EndView.empView(t1);
		
		System.out.println("\n*** 03-2. ���� ���� �˻� ***");
		c.newEmp_id();
		
		
		EndView.empView(c.getEmp_id(21));
		
		System.out.println("\n*** 04-1. �ش� ���� �������� ���(mgrId) �ٲٱ�  ***");
		c.mgrIdUpdate(01, 12);
		Table t2 = c.getEmp_id(01);
		EndView.empView(t2);
		System.out.println("\n*** 04-2. �ش� ���� �������� �ٹ���(loc) �ٲٱ�  ***");
		c.locUpdate(01, "Busan");
		Table t3 = c.getEmp_id(01);
		EndView.empView(t3);
		
		System.out.println("\n*** 05. �ش� ���� ������ �����ϱ�  ***");
		EndView.DeleteExcept(01);
		EndView.DeleteExcept(01);
		
		EndView.ListView(all);
		
		// ������Ʈ �ϸ鼭 ������
		// - �˰��� ó�� ���������� �Ӹ��� ���°� �ƴϰ� ���� ����, Ŭ���� �ҷ�����, ����ƽ�� ���� �� ������ �������. 
		// - �̹� ������Ʈ�� �����ϸ鼭 ������ �ǹ��� ��� �ؾ����� �̸� �����غô�. 
		// - ����� ���� �����ϸ鼭 ����� ���Ǹ� ������ ��ȸ�� �� ���Ҵ�.
		
		
	
	}

}