/* ���� Ŭ���� �ʼ� �ϱ� ����
 * - ������ �߻��� �ȴ� �ϴ��� ���ᰡ �ƴ϶� ������ ���� ������ ���� ó�� ���
 * 
 * 1. �ټ��� ���� ��Ȳ�� ���� Ŭ���������� �̹� �ټ� ����
 * 2. ���Ŀ� ���� ���ߵ� ����
 * 3. ����
 * 	java.lang.RuntimeExceiton �� ������ ��� ���� Ŭ������ ������ ������ ������ try~catch �ʼ�
 * 
 */

package step04.exception;

class A{
	static {
		System.out.println("A.class�� ������ ���� �޸𸮿� �ε��ɶ� �ڵ� ����Ǵ� ���");
	}
}

public class ExceptionTest1 {

	public static void main(String[] args) {
		//step02 - compile ���� ü�� �� ó��
		//byte code�� �޸𸮿� �ε��ϴ� API
		/* java.lang.Class
		 * 
		 * public static Class<?> forName(String className)
                        throws ClassNotFoundException
		 * 
		 * public static Class forName(String fileName){
		 * 	  fileName�� byte code�� �޸𸮿� �ε�
		 * }
		 * 1. ����� �� 1 : �����ϴ� byte code���� parameter�� ����
		 * 	- ���� �ε�
		 * 2. ����� �� 2 : �������ϴ� byte code���� parameter�� ����
		 *  - ������ �ε�
		 *  - ȣ���� ������ ������ ���� �˷��� ��
		 * 
		 */
		try {
			
			System.out.println(1);
			Class.forName("step04.exception.A");
			System.out.println(2);
			
		} catch (ClassNotFoundException e) {
			System.out.println(3);
			e.printStackTrace();  //�߻��� ���ܿ� ���� ����
		}
		
		System.out.println(4);
		
		
		//step01- runtime ���� ü�� �� ó�� 
		//s = null �� �ʱ�ȭ��  s.length()����� NullPointerException �߻�
		//�ذ�å s��� ������ �� �������� ���� �ذ�
		//����ÿ� �߻��� ���ܴ� �ڵ� �������� �ذ� �Ϸ�
		String s = "playdata";  
		System.out.println(s);
		System.out.println(s.length());
		
		int [] i = {1, 2};
//		System.out.println(i[5]); //ArrayIndexOutOfBoundsException �߻�
		System.out.println(i[0]); 
	}

}