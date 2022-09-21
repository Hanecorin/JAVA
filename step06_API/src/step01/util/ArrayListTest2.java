/* step01/util/A.class �� ArrayListTest2.class�� ����
 * 
 */

package step01.util;

import java.util.ArrayList;

import org.junit.Test;

class A extends Object{

	public String toString() {
		return "A";
	}
	
	static Object m1() {  //Object ���� =  "A�Դϴ�";
		return "A�Դϴ�";
	}
}

public class ArrayListTest2 {
	
	@Test
	public void m2() {
		//���׸� ���� - String�� ���� ������ String �迭�� ����
		ArrayList<String> a1 = new ArrayList<>(); 
		a1.add("string"); 
		String s1 = a1.get(0);//����ȯ ���� String ������ ����
		System.out.println(s1.length());
		
		System.out.println(a1.get(0).length());		
		
		//?
		ArrayList<A> a2 = new ArrayList<>();
		a2.add(new A());
		//? A�� m1() ȣ�� �ؼ� ��ȯ�� ���ڿ� ���� ��� 
		/*   ( (String)a2.get(0).m1() ).length() 
		 * a2 - ArrayList �� A��ü ���� ����
		 * a2.get(0) - A��ü ��ȯ
		 * a2.get(0).m1() - ��ȯ���� A�� m1() ȣ��, m1() ��ȯ���� Object 
		 * 
		 * (String)a2.get(0).m1() - m1() ��ȯ���� String���� ��ȯ
		 * ( (String)a2.get(0).m1() ).length() - String�� length() ȣ�� 
		 */
		System.out.println(   ( (String)a2.get(0).m1() ).length()  );
		
		//System.out.println(    (String)a2.get(0).m1().length()  ); ����
	}
	
//	@Test
	public void m1() {
		/* Ÿ�� ������ �ϴ� ���׸� ǥ���� ���� ��쿣 ����� ��ü Ÿ�Ը��� ��� ȣ��ÿ��� ����ȯ �ʼ�
		 */
		ArrayList a = new ArrayList();
		a.add(new A()); //0��° ����
		
		//? ArrayList�� ����� A��ü�� ȹ�� �� m1() ȣ���ؼ� ���ϵ� ������ ���� ���
		Object o = a.get(0);
		A a2 = (A)o;
		Object v = a2.m1();
		String s = (String)v;
		System.out.println( s.length() );
		
		//�������� �ƽ���!!!
		System.out.println(((String)(((A)(a.get(0))).m1())).length());	
		
		//2�� ����
		A a3 = (A)a.get(0);
		System.out.println( ( (String)a3.m1() ).length() ); 
	}
}