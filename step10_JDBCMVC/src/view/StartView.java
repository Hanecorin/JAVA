package view;

import controller.Controller;
import model.domain.EmpDTO;

public class StartView {

	public static void main(String[] args) {
		System.out.println("*** 1. 모든 직원 검색 ***");
		Controller.emps();

		System.out.println("*** 2. 직원 검색 ***");
		Controller.emp(7369);
		Controller.emp(1111);
		
		System.out.println("*** 3. 신규 직원 등록 ***");
		Controller.empInsert(new EmpDTO(1234, "SMITH", "CLERK", 7902, "1980-12-17", 800.0, 20, 30));
		Controller.emps();
		
		System.out.println("*** 4. 급여 인상 ***");
		Controller.empSalUp(20, 1.1f);
		Controller.emps();
				
		System.out.println("*** 5. 직원 퇴사 ***");
		Controller.emps();
		Controller.empDelete(1234);
		Controller.emps();
	}

}
