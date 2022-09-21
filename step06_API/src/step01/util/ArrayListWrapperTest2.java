/* Department 부서정보의 지역을 수정 
 * = 이 부서에 소속된 모든 직원에게 자동 적용
 * 추가 및 개선 해야할 구조 및 코드
 * 
 * 강사로 빙의 - contents 설계
 * ? 응용(역량강화)용 예시 로직을 무엇으로 제시 + 완성코드는?
 * 	- 한가지만 
 * 	- 힌트 : sql 실습 로직 ... or class 구조 보시고 설계 및 완성
 * 
 * 소요시간 1번 10분 / 2번 20분 / 3번 30분
 * 
 * 51분까지
 */
package step01.util;

import java.util.ArrayList;

import model.domain.Department;
import model.domain.Employee;

public class ArrayListWrapperTest2 {
	
	static Department dept = new Department(20, "RESEARCH", "서초");
	
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
//			System.out.println("사원명 : " + emp.getEname() + ", 소속된 부서명 : " + emp.getDept().getDname());
			System.out.println(emp); //emp.toString()
		}
	}
		
	public static void main(String[] args) {
		empInfoPrint(getEmps());
		setDepartmentLoc("남부");
		empInfoPrint(getEmps());
	}

}