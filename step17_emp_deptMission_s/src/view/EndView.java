package view;

import java.util.List;

import model.domain.Emp;

public class EndView {
	
	//직원 출력
	public static void printEmp(Emp emp) {
		if(emp != null) {
			System.out.println(emp);
		}else {
			System.out.println("검색하신 사원은 존재하지 않습니다.");
		}
	}
	
	//직원들 정보 출력
	public static void printEmpAll(List<Emp> emps) {
		if(emps != null) {
			emps.forEach(System.out::println);
		}else {
			System.out.println("소속된 직원들이 없습니다.");
		}
		
	}
}