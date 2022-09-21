/* Department �μ������� ������ ���� 
 * = �� �μ��� �Ҽӵ� ��� �������� �ڵ� ����
 * �߰� �� ���� �ؾ��� ���� �� �ڵ�
 * 
 * ����� ���� - contents ����
 * ? ����(������ȭ)�� ���� ������ �������� ���� + �ϼ��ڵ��?
 * 	- �Ѱ����� 
 * 	- ��Ʈ : sql �ǽ� ���� ... or class ���� ���ð� ���� �� �ϼ�
 * 
 * �ҿ�ð� 1�� 10�� / 2�� 20�� / 3�� 30��
 * 
 * 51�б���
 */
package step01.util;

import java.util.ArrayList;

import model.domain.Department;
import model.domain.Employee;

public class ArrayListWrapperTest2 {
	
	static Department dept = new Department(20, "RESEARCH", "����");
	
	static void setDepartmentLoc(String loc) {
		dept.setLoc(loc);
	}
		
	static ArrayList<Employee> getEmps(){	
		ArrayList<Employee> emps = new ArrayList<>();
		
		emps.add(new Employee(1, "SMITH", 900.5, dept));
		emps.add(new Employee(2, "FORT", 1000.10, dept));
		
		return emps;
	}

	static void empInfoPrint(ArrayList<Employee> emps) {
		for(Employee emp : emps) {
//			System.out.println("����� : " + emp.getEname() + ", �Ҽӵ� �μ��� : " + emp.getDept().getDname());
			System.out.println(emp); //emp.toString()
		}
	}
		
	public static void main(String[] args) {
		empInfoPrint(getEmps());
		setDepartmentLoc("����");
		empInfoPrint(getEmps());
	}

}