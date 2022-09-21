/* wrapper class
 * 1. �⺻ Ÿ���� support �ϴ� 8���� Ŭ����
 * 2. java.lang ����
 * 3. autoboxing & unboxing
 * 4. ������ Ÿ�� �ΰ���
 * 	1. �⺻ Ÿ�� - class ���� ���� ǥ��
 * 	2. ���� Ÿ�� - class ������� ���� ���� class ������ ����, �޼ҵ� ȣ�� ����
 */
package step01.util;

import org.junit.Test;

public class WrapperTest {

	@Test
	public void m1() {
		//unboxing
		int i = new Integer(3); // ������ ������ int i = (new Integer(3)).intValue();
		System.out.println(i); //int �� ���
//		System.out.println(i.toString()); //���� class�� �ƴϿ��� �� ����Ÿ�� �ƴϿ��� �޼ҵ� ȣ�� �Ұ�
		
		//autoboxing
		Integer i2 = 5; // Integer i2 = new Integer(5);
		System.out.println(i2);
		System.out.println(i2.toString());
	}
	
}