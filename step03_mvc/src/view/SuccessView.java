package view;

import model.domain.Student;

//�������� ��� ����ϴ� ȭ�� ó���� ��ȯ���� : jsp��� ȭ�� ó�� ����
//StartView -> Controller -> Model : Student&Subject -> Controller -> SuccessView or FileView
public class SuccessView {
	
	//�˻��� �л� ���� ���
	public static void printStudent(Student stu) {
		System.out.println("�˻��� �л� ���� : " + stu.getName() + " " + stu.getGrade());
	}

	public static void printTeacherName(String name) {
		System.out.println("�ش� ������ ����� ���� : " + name);
	}
	
}