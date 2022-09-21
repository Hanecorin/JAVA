package view;

import controller.Controller;
import model.domain.EmpDTO;

public class StartView {

	public static void main(String[] args) {
		System.out.println("*** 1. ��� ���� �˻� ***");
		Controller.emps();

		System.out.println("*** 2. ���� �˻� ***");
		Controller.emp(7369);
		Controller.emp(1111);
		
		System.out.println("*** 3. �ű� ���� ��� ***");
		Controller.empInsert(new EmpDTO(1234, "SMITH", "CLERK", 7902, "1980-12-17", 800.0, 20, 30));
		Controller.emps();
		
		System.out.println("*** 4. �޿� �λ� ***");
		Controller.empSalUp(20, 1.1f);
		Controller.emps();
				
		System.out.println("*** 5. ���� ��� ***");
		Controller.emps();
		Controller.empDelete(1234);
		Controller.emps();
	}

}
