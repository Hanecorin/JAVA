package view;

import model.domain.Customer;

public class SuccessView {

	public static void print(Customer c) {
		System.out.println("�� ���� " + c.getId() + " " + c.getGrade());
	}

	public static void printMsg(String msg) {
		System.out.println(msg);
	}

}
