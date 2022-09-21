package step01.util;

import java.util.HashMap;

import org.junit.Test;

import model.domain.Department;
import model.domain.Employee;

public class MapTest {

	/* 
	 * �ǽ��ܰ�
	 * 1�ܰ� : �����ȣ�� key, ����� value
	 * 2�ܰ� : �μ���ȣ�� key, �μ���ü�� value
	 * 3�ܰ� : ��� key, Employee ��ü�� value
	 */

	//1�ܰ�
//	@Test
	public void m1() {
//		HashMap<Integer, String> map = new HashMap<Integer, String>();
		HashMap<Integer, String> map = new HashMap<>();
		
		//������ ����
		map.put(1, "SMITH");  //map.put(new Integer(1), "SMITH") �� ���� 
		map.put(2, "FORT");
		
		//? SMITH �̾Ƽ� ���
		System.out.println(map.get(1)); //map.get(new Integer(1))�� ����
	}
	
	//2�ܰ�
	//@Test
	public void m2() {
		HashMap<Integer, Department> map = new HashMap<>();
		
		map.put(10, new Department(10, "ACCOUNTING", "����"));
		map.put(20, new Department(20, "RESEARC", "����"));
		
		//? 10�� �μ��� �μ��� ���  //ACCOUNTING
		Department dept = map.get(10);
		System.out.println(dept.getDname());
		System.out.println(map.get(10).getDname());
	}
	
	//3�ܰ� - ? 
	@Test
	public void m3() {
		HashMap<Integer, Employee> map = new HashMap<>();
		Department dept = new Department(20, "RESEARCH", "����");
		
		map.put(1, new Employee(1, "SMITH", 900.5, dept));
		map.put(2, new Employee(2, "FORT", 1000.10, dept));
		
		System.out.println(map.get(1).getEname() + "�� ���� �μ� ��ȣ�� " 
							+ map.get(1).getDept().getDeptno() + "�Դϴ�");	

		//map.get(1)
		Employee e1 = map.get(1);
		//map.get(1).getEname()
		String ename = e1.getEname();
		
		//map.get(1)
		Employee e2 = map.get(1);
		//map.get(1).getDept()
		Department d2 = e2.getDept();
		//map.get(1).getDept().getDeptno()
		int deptno = d2.getDeptno();		
		
		
		/* map.get(1).getEname()
		 * 	- map : HashMap<Integer, Employee>
		 * 	- map.get(1) : new Employee(1, "SMITH", 900.5, dept)
		 *  - map.get(1).getEname() : Employee ��ü�� getEname()
		 *   
		 * 
		 * 
		 * map.get(1).getDept().getDeptno()
		 * - map : HashMap<Integer, Employee>
		 * - map.get(1) : new Employee(1, "SMITH", 900.5, dept)
		 * - map.get(1).getDept() : Department ��ü(new Department(20, "RESEARCH", "����"))
		 * - map.get(1).getDept().getDeptno() : Department ��ü�� getDeptno() 
		 */
	}
	
}