package controller;

import java.util.ArrayList;

import model.EmpDAO;
import model.domain.EmpDTO;
import view.FailView;
import view.SuccessView;

public class Controller {
	// 모든 직원 정보 요청 및 응답 메소드
	public static void emps() {
		try {
			ArrayList<EmpDTO> emps = EmpDAO.selectAll();
			if(emps.size() != 0) {
				SuccessView.printEmps(emps);
			} else {
				SuccessView.printMsg("현시점 직원 없음");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			FailView.printMsg("검색 재시도 필요");
		}
		
	}
	
	// 직원 1명 정조 요청 및 응답 메소드
	public static void emp(int empno) {
		if(empno != 0 ) {
			try {
				EmpDTO emp = EmpDAO.selectOne(empno);
				if(emp != null)  { 
					SuccessView.printOne(emp);
				} else {
					SuccessView.printMsg(empno + "에 해당하는 직원 없음");
				}
			} catch (Exception e) {
			e.printStackTrace();
			}
		} else {
			FailView.printMsg(empno + "에 해당하는 직원 없음");
		}
		
	}
	
	// insert
		public static void empInsert(EmpDTO emp) {
		try {
			boolean result = EmpDAO.empInsert(emp);
			if(result) {
				SuccessView.printMsg(emp.getEmpno() + " 신규 직원 등록 완료");
			} else { // 예외는 아니나 저장 불가
				SuccessView.printMsg(emp.getEmpno() + " 신규 직원 등록 보류 재시도 필요");
			}
		} catch(Exception e) {
			e.printStackTrace();
			FailView.printMsg(emp.getEmpno() + " 신규 직원 등록 실패");
		}
	}
		
	// update
	public static void empSalUp(int deptno, float salup) {
		try {
			boolean result = EmpDAO.empSalUpdate(deptno, salup);
			if(result) {
				SuccessView.printMsg(deptno + " 부서 급여 인상율 : " + salup);
			} else { // 예외는 아니나 저장 불가
				SuccessView.printMsg("급여 인상 재시도 필요");
			}
		} catch(Exception e) {
			e.printStackTrace();
			FailView.printMsg("급여 인상 실패");
		}
	}
	
	// delete
	// update
	public static void empDelete(int empno) {
		try {
			boolean result = EmpDAO.empDelete(empno);
			if(result) {
				SuccessView.printMsg(empno + " 퇴직 처리 완료");
			} else { // 예외는 아니나 저장 불가
				SuccessView.printMsg(empno + " 퇴직 처리 보류");
			}
		} catch(Exception e) {
			e.printStackTrace();
			FailView.printMsg(empno + " 퇴직 처리 실패");
		}
	}
}
