package controller;

import model.Model;
import model.domain.Student;
import view.FailView;
import view.SuccessView;

public class Controller {
	//1 ��û�� �л� ���� �˻����� ����, 2�� ����� �˻����� ����
	/* Model�� �޼ҵ�� �ʿ�
	 * user(end user, client)�� ��û�ϴ� ����� �� �޶�
	 * ��û ���� Model ��ü ���� ��ȿ���� X
	 * ���� ��� 1 - �ϳ��� Model ��ü �����ؼ� ��� ������ ����
	 * 		- ���������� ���� ���ο� ���� ��ü ���� �ǰڱ� �ڵ�� ����
	 * 		- singleton design pattern
	 * 
	 * ���� ��� 2 - Model �� �޼ҵ���� static���� ���� 
	 * 	- Model.queryStudent()
	 */
	private static Model m = Model.getInstance();
	
	public static void reqRes(int no) {
		if (no == 1) { //�л� ���� �˻�
			/* queryStudent()
			 * Student or null ��ȯ  
			 * ȣ���� �ڵ� �������� ����ؾ� �� ����� ��
			 * 	����� ��1 : ���� �˻� Student ��ü
			 * 		���
			 *  ����� ��2 : �ش� �����Ͱ� ��� null��
			 *  	�ش� �л� ������ ..������ �� Ȯ�� �ϼ���
			 */
			Student stu01 = m.queryStudent("����");
			
			if(stu01 != null) {
				SuccessView.printStudent(stu01);
			}else {
				FailView.printMsg("�ش� �л��� �������� �ʽ��ϴ�.");
			}	
			
		}else if(no == 2){ //����� ��û
			
			SuccessView.printTeacherName(m.queryTeacherName("����"));
			
		}else {
			FailView.printMsg("�� ������? ���⼭ ���̷�? ��!!");
		}

	}
}