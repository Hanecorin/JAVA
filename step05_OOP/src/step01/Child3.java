//������ �н� 
/* ��� ���迡���� �����Ǵ� ��ī����
 * ����
 * 	����Ÿ�� ���� = �ڽİ�ü
 */

package step01;

class Parent3 extends Object{
	int no1 = 10;
	
	Parent3(){
		super();
	}
}

public class Child3 extends Parent3 {  //Child3�� no1, no2 ����
	int no2 = 100; //������ ������ access �Ұ� ���б���
	
	public Child3() {
		super();
	}
	public static void main(String[] args) {
		Object c1 = new Child3();
		Object p1 = new Parent3();
		/* c2Ÿ�� - Parent3
		 * c2 ������ ��Ӱ����� ������ ��ü ���� Child3 
		 * 	Child3 ��ü �����ÿ� Object -> Parent3 -> Child3 �����λ���
		 * 		Parent3 ������ no1 ���� �޸𸮿� ����
		 * 		Child3 "	 no2  "    "    "  
		 */
		Parent3 c2 = new Child3(); //������ ����� ��ü ����
		System.out.println(c2.no1); // 10
		c2.no1 = 1000;
		System.out.println(c2.no1); // 1000
		//c2.no2 = 2000;  //���� ����Ÿ�� �����δ� access ���� �Ұ�
		
		//�ذ�å : ��ü Ÿ�԰��� ����ȯ
		//���ο� ��ü ����? �̹� ������ ��ü�� ����?
		Child3 c22 = (Child3)c2;
		c22.no2 = 2000;
		System.out.println(c22.no2);
		c2.no1 = 10000;  //1000 -> 10000���� ����
		System.out.println(c22.no1); // 10000
		
	}

}