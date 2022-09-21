package view;

import java.util.ArrayList;
import model.domain.EmpDTO;
public class SuccessView {
	
	public static void printEmps(ArrayList<EmpDTO> emps) {
		for (EmpDTO e : emps) {
			System.out.println(e);
		}
	}
	
	public static void printMsg(String msg) {
		System.out.println(msg);
	}

	public static void printOne(EmpDTO emp) {
		System.out.println(emp);
		
	}
	
	public static void printInsert(EmpDTO emp) {
		System.out.println(emp);
		
	}
	
}
