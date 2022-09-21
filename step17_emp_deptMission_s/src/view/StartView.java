package view;

import java.util.List;

import model.EmpDeptDAO;
import model.domain.Dept;
import model.domain.Emp;

public class StartView {

	public static void main(String[] args) {
		
		EmpDeptDAO dao = EmpDeptDAO.getInstance();
		
		try {
			System.out.println("*** 1. ��� ���� �˻� ***");
			List<Emp> emps = dao.findElementAll();
			EndView.printEmpAll(emps);
//			
//			
			System.out.println("*** 2. �����ϴ� �μ��� ���ο� ���� ��� ***");
			Dept searchDept = dao.findDept(40L);
			Emp employee = Emp.builder().empno(1201L).ename("Gopal").sal(40000L).deptno(searchDept).build();
			dao.createEmployee(employee);
//
//			
//			System.out.println("*** 3. ���� �˻� ***");
//			Emp emp = dao.findEmployee(1201L);
//			Emp emp = dao.findEmployee(7902L); 
//			System.out.println(emp.getDeptno()); ���� ����
//			System.out.println(emp.getDeptno().getDname());
//			
//			// �̹� �˻��� �����Ϳ� ������ ������ ���� �� update sql���� ���� �ʿ� ����
//			System.out.println("*** 4. �����ϴ� ������ �޿� ���� �� �˻� ***");
//			dao.updateEmployee(1201L, 46000L);
//			emp = dao.findEmployee(1201L);
//			EndView.printEmp(emp);
//			
//			
//			System.out.println("*** 5. �����ϴ� ������ ���� �� �˻�***");
//			dao.deleteElement(1201L);
//			emp = dao.findEmployee(1201L);
//			EndView.printEmp(emp);
//			
//			
//			System.out.println("*** 6. ��� ���� �˻� ***");
//			EndView.printEmpAll(dao.findElementAll());
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}