package view;

import controller.Controller;

public class StartView {

	public static void main(String[] args) {
		
		System.out.println("������ �˻� *****");
		Controller.reqRes(1);   // �� �˻�
		
		System.out.println("������ ���� ���� �� �˻� *****");
		Controller.reqRes(2);   // �� ��� ����
		Controller.reqRes(1); 
		
		System.out.println("��ȿ�� �˻� ��û *****");
		Controller.reqRes(3);
		
	}

}
