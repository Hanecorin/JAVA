package step03.app;

import org.junit.Test;

import model.domain.Student;
import model.domain.Subject;

public class School {
	
	/* ? ����, 3, ü��, ����� ����
	 * Student ��ü ���� �Ŀ� �̸��� ���
	 */
	@Test
	public void m1() {
		Subject sub = new Subject("ü��", "����");
		/* Student.builder().name("����").grade(3).subject(sub).build()
		 * Student.builder() - StudentBuilder
		 * Student.builder().name("����") - StudentBuilder
		 * Student.builder().name("����").grade(3) - StudentBuilder
		 * Student.builder().name("����").grade(3).subject(sub) - StudentBuilder
		 * Student.builder().name("����").grade(3).subject(sub).build() - Student
		 */		
		//������ ���� ���α׷����� ��� ������ �������� ����
		//��ü����
		Student s1 = Student.builder().name("����")
					.grade(3).subject(sub).build();
		
		/* 
		 * Student ��ü�� ���� Subject ��ü �̰� TeacherName �� �̰� ��� 
		 */
		System.out.println(s1.getSubject().getTeacherName());
		
	}
}