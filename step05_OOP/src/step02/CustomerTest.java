package step02;

import model.domain.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		Customer c1 = new Customer("user01", 11);
		Customer c2 = new Customer("user01", 11);
		
		System.out.println(c1.equals(c2)); //true
		
		String s1 = "p";
		String s2 = "p";
		System.out.println(s1.equals(s2)); //true
		
		// equals(Object o) �� Object Ÿ���� ��� �ڼ�Ÿ�� ����
		System.out.println(s1.equals(c1)); //false
		System.out.println(c1.equals(s1)); //false
		
	}
}