/* �н� ����
 * 1. ���/���� ���� ������
 * 	1. ��� : 
 * 		class {} ������ ����
 * 		��ü ������ �켱
 * 		��ü �����ÿ� �� Ÿ�Ժ� �⺻ ������ �ڵ� �ʱ�ȭ
 * 
 *  2. ���� : �޼ҵ��� parameter �Ǵ� {} �� ����
 *  	- ��� ������ �޸� ����� �ڵ� �ʱ�ȭ�� �ȉ�
 *  	- ����� �ʱ�ȭ(�� ����) �ʼ�
 *  
 * 2. ��� ������ �ڵ� �ʱ�ȭ �����ϱ�
 * 
 */

package step02;

public class Syntax1Variable {
	int no1;  // ���
	int no2;
	boolean b;
	float f;
	char c = '��';  //������� �ʱ�ȭ, charŸ���� �⺻ Ÿ�� : �� ǥ���� ''/ String ����Ÿ�� ""
	
	//������
	/* 1. ��ü �����ÿ��� ȣ��Ǵ� �ʼ� ���
	 * 2. �����ڰ� �ҽ��� �� ���߽� �⺻ ������ ������ �ڵ� ����
	 * 3. �⺻ ����? () �� parameter�� ���� ������ �ǹ� 
	 * 4. ���� : ��ȯŸ�� ���� ��ü�� ����, Ŭ������� ����
	 */
	public Syntax1Variable(){
		//��� ��� ������ ������ �޸𸮿� ���� �� �⺻ �ʱ�ȭ �� ������� �ʱ�ȭ ����
		
		System.out.println("�⺻ ������");//��� ���� ������ �� ����Ǵ� ������ ����
	}
		
	public Syntax1Variable(int no1, int no2, boolean b, float f, char c) {
		super();
		this.no1 = no1;
		this.no2 = no2;
		this.b = b;
		this.f = f;
		this.c = c;
	}





	void m1() {
		int no1 = 10; //���� 
		System.out.println(no1);  //no1�� ������� no1�� �ݵ�� �� ���� �� �ʱ�ȭ�� �Ǿ� �־�� ��
	}

	public static void main(String [] args) {
		// no1, no2, m1() ������ ���ؼ� ��ü ���� �ʼ�
		//s1�̶�� ���� ������ �����ϴ� Syntax1Variable instance(��ü)
		Syntax1Variable s1 = new Syntax1Variable()     ;
		
//		System.out.println(s1);  //step02.Syntax1Variable@1c4af82c
//		System.out.println(s1.no1);  // 0
//		System.out.println(s1.b);  // false
//		System.out.println(s1.f);  // 0.0
//		System.out.println(s1.c);  // ��'
//		
		s1.m1();
		
	}
	
}