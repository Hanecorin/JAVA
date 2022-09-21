package view;

import java.util.List;

import model.domain.Emp;

public class EndView {
	
	//���� ���
	public static void printEmp(Emp emp) {
		if(emp != null) {
			System.out.println(emp);
		}else {
			System.out.println("�˻��Ͻ� ����� �������� �ʽ��ϴ�.");
		}
	}
	
	//������ ���� ���
	public static void printEmpAll(List<Emp> emps) {
		if(emps != null) {
			emps.forEach(System.out::println);
		}else {
			System.out.println("�Ҽӵ� �������� �����ϴ�.");
		}
		
	}
}