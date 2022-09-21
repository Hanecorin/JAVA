package step01.util;

import java.util.ArrayList;

import model.domain.Department;
import model.domain.Employee;

public class ArrayListWrapperTest {
	
	static ArrayList<Employee> getEmps(){
	
		//ArrayList<Employee> emps = new ArrayList<Employee>();  동일
		ArrayList<Employee> emps = new ArrayList<>();
		
		Department dept = new Department(20, "RESEARCH", "서초");
		
		emps.add(new Employee(1, "SMITH", 900.5, dept));
		emps.add(new Employee(2, "FORT", 1000.10, dept));
		
		return emps;
	}
	/* 제네릭 문법 적용
	 * ArrayList<Employee> : Employee만 저장 및 형변환 불필요
	 */
	static void empInfoPrint(ArrayList<Employee> emps) {
		for(Employee emp : emps) {
			System.out.println("사원명 : " + emp.getEname() + ", 소속된 부서명 : " + emp.getDept().getDname());
		}
	}
	
	
	/* ArrayList<Employee> -> ArrayList의 변수에 대입시
	 * ArrayList<Object> 와 같은 원리로 대입
	 * 해당 Employee로 반환시 형변환 필요
	 * 비추 코드 - 쩝
	 */
	static void empInfoPrint2(ArrayList emps) {
		System.out.println(emps.toString());
		//[Employee(empno=1, ename=SMITH, sal=900.5, dept=Department(deptno=20, dname=RESEARCH, loc=서초)), Employee(empno=2, ename=FORT, sal=1000.1, dept=Department(deptno=20, dname=RESEARCH, loc=서초))]
		Employee emp = null;
		for(Object e : emps) {
			emp = (Employee)e;
			System.out.println("사원명 : " + emp.getEname() + ", 소속된 부서명 : " + emp.getDept().getDname());
		}
	}
	
	public static void main(String[] args) {
//		empInfoPrint(getEmps());
		empInfoPrint2(getEmps());
	}

}