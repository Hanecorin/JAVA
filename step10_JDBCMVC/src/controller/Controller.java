package controller;

import java.util.ArrayList;

import model.EmpDAO;
import model.domain.EmpDTO;
import view.FailView;
import view.SuccessView;

public class Controller {
	// ��� ���� ���� ��û �� ���� �޼ҵ�
	public static void emps() {
		try {
			ArrayList<EmpDTO> emps = EmpDAO.selectAll();
			if(emps.size() != 0) {
				SuccessView.printEmps(emps);
			} else {
				SuccessView.printMsg("������ ���� ����");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			FailView.printMsg("�˻� ��õ� �ʿ�");
		}
		
	}
	
	// ���� 1�� ���� ��û �� ���� �޼ҵ�
	public static void emp(int empno) {
		if(empno != 0 ) {
			try {
				EmpDTO emp = EmpDAO.selectOne(empno);
				if(emp != null)  { 
					SuccessView.printOne(emp);
				} else {
					SuccessView.printMsg(empno + "�� �ش��ϴ� ���� ����");
				}
			} catch (Exception e) {
			e.printStackTrace();
			}
		} else {
			FailView.printMsg(empno + "�� �ش��ϴ� ���� ����");
		}
		
	}
	
	// insert
		public static void empInsert(EmpDTO emp) {
		try {
			boolean result = EmpDAO.empInsert(emp);
			if(result) {
				SuccessView.printMsg(emp.getEmpno() + " �ű� ���� ��� �Ϸ�");
			} else { // ���ܴ� �ƴϳ� ���� �Ұ�
				SuccessView.printMsg(emp.getEmpno() + " �ű� ���� ��� ���� ��õ� �ʿ�");
			}
		} catch(Exception e) {
			e.printStackTrace();
			FailView.printMsg(emp.getEmpno() + " �ű� ���� ��� ����");
		}
	}
		
	// update
	public static void empSalUp(int deptno, float salup) {
		try {
			boolean result = EmpDAO.empSalUpdate(deptno, salup);
			if(result) {
				SuccessView.printMsg(deptno + " �μ� �޿� �λ��� : " + salup);
			} else { // ���ܴ� �ƴϳ� ���� �Ұ�
				SuccessView.printMsg("�޿� �λ� ��õ� �ʿ�");
			}
		} catch(Exception e) {
			e.printStackTrace();
			FailView.printMsg("�޿� �λ� ����");
		}
	}
	
	// delete
	// update
	public static void empDelete(int empno) {
		try {
			boolean result = EmpDAO.empDelete(empno);
			if(result) {
				SuccessView.printMsg(empno + " ���� ó�� �Ϸ�");
			} else { // ���ܴ� �ƴϳ� ���� �Ұ�
				SuccessView.printMsg(empno + " ���� ó�� ����");
			}
		} catch(Exception e) {
			e.printStackTrace();
			FailView.printMsg(empno + " ���� ó�� ����");
		}
	}
}
