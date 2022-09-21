/* �л�, ���� ������ Ȱ���ϰ� �Ǵ� �ٽ� Ŭ����
 * ���Ŀ� db�� ���� ���� ����
 * sql���� ó���ϴ� Ŭ����
 * 
 * ���� ����? crud
 * 	�л� ���� ���� / ���� ���� ����/...
 *  �̸����� �л� �Ѹ��� ��� ���� �˻��̶� ����
 *  	- select * from student where name=?
 *  �������� �ش� ������ �����̸��� �˻� �̶� ����
 *  	- select teacher_name from subject where subject_name=?
 * 
 */
package model;

import model.domain.Student;  //ctrl+shift+o
import model.domain.Subject;

public class Model {

	//static{} ���� �� ����(�ʱ�ȭ), �޼ҵ�鿡�� ������ Ȱ��
//	private Student stu01; //��ü ���� ���Ŀ��� ��� ������ ����
	private static Student stu01; 
	private static Subject sub01; //��ü ���� ���� ��� ������ ����
	private static Model instance = new Model();
	
	//�ܺο��� ȣ�� �Ұ� 
	//�ܺο��� ��ü ���� ���� 
	//Model���� ��ü �����ؼ� �ּҰ�(������) ����
	private Model() {}
	
	//singleton ������ ��ü�� �ּҰ� ��ȯ 
	//�� Model ��ü ������ �ܺο��� ����, �� ��ü ���� �� ���ο� �����ϰ� ȣ�� ������ �޼ҵ� ���� ��
	public static Model getInstance() {
		return instance;
	}
	
	
	//Model.class�� �޸𸮿� �ε��� �� �ѹ� ����Ǵ� ��Ư�� ����
	//�����ڿ� �ʱ�ȭ ���� - test �����͸� ����(rdbms�� ������ �������� ����)
	static {
		//�ʱ�ȭ �� ���� - Student ������ Subject ������ ���
		stu01 = Student.builder().name("����").grade(3).build();
		sub01 = new Subject("����", "���缮");
		
	}
	
	// select * from student where name=?
	/* �ټ��� �л��� �ִ� ����, ���� ���� ����
	 * �̸� ���� true�� ��� �ش� �л� ���� ��ȯ
	 * �л� ����(Student)
	 * 
	 * ����Ÿ��(��ü, class, reference)�� �⺻���� null
	 * 
	 * Student Ÿ���� ��ȯ�� ��� null �Ǵ� Student ��ü�� ��ȯ
	 */
	public Student queryStudent(String name){
		if(name.equals(stu01.getName())) { // parameter�� stu01 �����ϴ� ��ü�� �̸� ��
			return stu01;
		}else {
			return null;  //null ��üŸ���� �⺻ ��
		}
	}
		
	// select teacher_name from subject where subject_name=?
//	public static String queryTeacherName(String subjectName){//��ü �������� ���� ������ �޼ҵ� 
	public String queryTeacherName(String subjectName){//��ü ���� �� ���� ������ ȣ���ϴ� �޼ҵ� 
		return sub01.getTeacherName();
	}
	
}