package step02;

public class OOPTest {
	
	static Object m1() {  //Object ���� = "��ü ����ȯ"; ������ ����, ����Ÿ������ ��ȯ�Ǿ� ��ȯ
		return "��ü ����ȯ";
	}
	
	static void m2(Object v) {
		String s = (String)v;
		System.out.println(s.length());  //���ڿ� ���� ���    6
	}
	
	
	static void m3(String v) {
		System.out.println(v.length());  
	}
	
	public static void main(String[] args) {
		/* m1()�� �ݵ�� argument�� �����Ѵٸ� �ڵ� ����?
		 * 
		 * m3(  (String)m1()   );
		 * m1() -> (String) -> m3 ȣ�� 
		 * m1() ��ȯ���� Object
		 * 	String ���� = (String)ObjectŸ��
		 */
		m3(  (String)m1()   );
				
		
		m2(m1());
		
		
		/* String s = (String)m1();
		 * String s ��� ������ �޸𸮿� ����
		 * m1() �ޙ� ȣ�� �� ����Ǽ� ������� Object Ÿ������ ��ȯ
		 * (String)m1() : Object -> String���� ����ȯ
		 * = : ��ȯ�� String ��ü�� String ������ ���� 
		 */
		String s = (String)m1();
		
		//Object���� �� �����ϴ� �޼ҵ� ���� String���� ����ȯ �ʼ� �Ŀ� �ش� �޼ҵ� ȣ��
		System.out.println(s.length());
	}

}