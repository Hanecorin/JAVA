/* �н� ����
 * 1. ������(Constructor)
 * 	1. ��ü ���� �⺻
 * 	2. ���� ������ ��� �����鰪 Ư�� �����ͷ� ������� �ʱ�ȭ ����
 * 
 * 2. ���� ����(overloading)
 * 	- �ϳ��� Ŭ�������� �޼ҵ峢��, �����ڳ����� ����Ǵ� ��ī����
 * 	- �̸� ���� �� parameter�� �ٸ�
 *  - ����ڰ� ���ϰ� ���ִ� support
 *  
 */

package step02;

public class Syntax2Constructor extends Object{

	//public Syntax2Constructor() {}
	
	public static void main(String[] args) {
		
		Syntax2Constructor s = new Syntax2Constructor();
		System.out.println(s);
		
		/* println(int v) / println(char v) / println(String v) 
		 * println(Object v)
		 * 
		 */
		System.out.println(1); // int 
		System.out.println('a'); // char
		System.out.println("string"); // char
			
	}

}