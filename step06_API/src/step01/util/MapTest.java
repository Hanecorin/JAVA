package step01.util;

import java.util.HashMap;

import org.junit.Test;

import model.domain.Department;
import model.domain.Employee;

public class MapTest {

	/* 
	 * 실습단계
	 * 1단계 : 사원번호가 key, 사원명 value
	 * 2단계 : 부서번호가 key, 부서객체가 value
	 * 3단계 : 사번 key, Employee 객체가 value
	 */

	//1단계
//	@Test
	public void m1() {
//		HashMap<Integer, String> map = new HashMap<Integer, String>();
		HashMap<Integer, String> map = new HashMap<>();
		
		//데이터 저장
		map.put(1, "SMITH");  //map.put(new Integer(1), "SMITH") 와 동일 
		map.put(2, "FORT");
		
		//? SMITH 뽑아서 출력
		System.out.println(map.get(1)); //map.get(new Integer(1))와 동일
	}
	
	//2단계
	//@Test
	public void m2() {
		HashMap<Integer, Department> map = new HashMap<>();
		
		map.put(10, new Department(10, "ACCOUNTING", "마포"));
		map.put(20, new Department(20, "RESEARC", "서초"));
		
		//? 10번 부서의 부서명 출력  //ACCOUNTING
		Department dept = map.get(10);
		System.out.println(dept.getDname());
		System.out.println(map.get(10).getDname());
	}
	
	//3단계 - ? 
	@Test
	public void m3() {
		HashMap<Integer, Employee> map = new HashMap<>();
		Department dept = new Department(20, "RESEARCH", "서초");
		
		map.put(1, new Employee(1, "SMITH", 900.5, dept));
		map.put(2, new Employee(2, "FORT", 1000.10, dept));
		
		System.out.println(map.get(1).getEname() + "가 속한 부서 번호는 " 
							+ map.get(1).getDept().getDeptno() + "입니다");	

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
		 *  - map.get(1).getEname() : Employee 객체의 getEname()
		 *   
		 * 
		 * 
		 * map.get(1).getDept().getDeptno()
		 * - map : HashMap<Integer, Employee>
		 * - map.get(1) : new Employee(1, "SMITH", 900.5, dept)
		 * - map.get(1).getDept() : Department 객체(new Department(20, "RESEARCH", "서초"))
		 * - map.get(1).getDept().getDeptno() : Department 객체의 getDeptno() 
		 */
	}
	
}