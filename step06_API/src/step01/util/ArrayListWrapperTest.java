package step01.util;

import java.util.ArrayList;

import model.domain.Department;
import model.domain.Employee;

public class ArrayListWrapperTest {
	
	static ArrayList<Employee> getEmps(){
	
		//ArrayList<Employee> emps = new ArrayList<Employee>();  ����
		ArrayList<Employee> emps = new ArrayList<>();
		
		Department dept = new Department(20, "RESEARCH", "����");
		
		emps.add(new Employee(1, "SMITH", 900.5, dept));
		emps.add(new Employee(2, "FORT", 1000.10, dept));
		
		return emps;
	}
	/* ���׸� ���� ����
	 * ArrayList<Employee> : Employee�� ���� �� ����ȯ ���ʿ�
	 */
	static void empInfoPrint(ArrayList<Employee> emps) {
		for(Employee emp : emps) {
			System.out.println("����� : " + emp.getEname() + ", �Ҽӵ� �μ��� : " + emp.getDept().getDname());
		}
	}
	
	
	/* ArrayList<Employee> -> ArrayList�� ������ ���Խ�
	 * ArrayList<Object> �� ���� ������ ����
	 * �ش� Employee�� ��ȯ�� ����ȯ �ʿ�
	 * ���� �ڵ� - ��
	 */
	static void empInfoPrint2(ArrayList emps) {
		System.out.println(emps.toString());
		//[Employee(empno=1, ename=SMITH, sal=900.5, dept=Department(deptno=20, dname=RESEARCH, loc=����)), Employee(empno=2, ename=FORT, sal=1000.1, dept=Department(deptno=20, dname=RESEARCH, loc=����))]
		Employee emp = null;
		for(Object e : emps) {
			emp = (Employee)e;
			System.out.println("����� : " + emp.getEname() + ", �Ҽӵ� �μ��� : " + emp.getDept().getDname());
		}
	}
	
	public static void main(String[] args) {
//		empInfoPrint(getEmps());
		empInfoPrint2(getEmps());
	}

}