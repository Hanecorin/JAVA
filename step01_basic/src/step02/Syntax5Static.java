/* �н� 
 * 1. static{}
 * 2. �̸��� ���� ���� ���? 	
 * 3. ���� ����?
 * 4. ���� Ƚ��?
 * 	2+3+4 �� :	
 * 	byte code�� �޸�(class or method area)�� �ε� �Ǹ鼭 �� �ѹ��� ����
 * 
 * 5. �ʿ伺
 * 	- ��� user���� �����ϴ� �ڿ� �� �ѹ��� �ʱ�ȭ�ÿ� �ַ� ���
 * 	- ������ �����Ҷ� �� �ѹ��� �ε��ؾ� �ϴ� �ʱ��ڿ� ������ �ַ� ���
 * 
 * 6. ����
 * 	- main() Ư���� �޼ҵ�
 * 	 :  �����ڰ� test ������ ���
 * 	 ��������� ���� �ϴ� ��� ������ main���� ������ ������ �ʼ�
 */

package step02;

public class Syntax5Static {
	static{
		System.out.println(3);				
	}
	static{
		System.out.println(1);
	}
	static{
		System.out.println(2);		
	}
	
	public static void main(String[] args) {
		System.out.println("main");
	}
	

}