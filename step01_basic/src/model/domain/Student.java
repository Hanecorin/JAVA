package model.domain;

import org.junit.Test;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString; 

@Builder
//@NoArgsConstructor
@Getter
@Setter
//@ToString  //������ 
public class Student {
	
	private String name;
	private int grade;//1, 2, 3 ���� �г�	
	private Subject subject;  //�����, �����   has a[�����] ����
	
	//��Ŭ������ ��� ��� ������ ���� �ϳ��� ���ڿ��� �����ؼ� ��ȯ
	//������ ǥ���� default ���� ����
	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", subject=" + subject + "]";
	}
	
//	@Test
//	public void m() {
//		Student s = new Student();
//		System.out.println(s);
//	}
}

