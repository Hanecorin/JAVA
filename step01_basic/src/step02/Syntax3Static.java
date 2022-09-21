/* �н�����
 * 1. static Ű����
 * 2. ���� ����
 * 	1. ����
 * 	- Syntax3Static.java
 * 		static type ������ [=��];
 * 		Ư¡
 * 			1. ȣ�⹮��
 * 				class��.������ 
 * 					- �ܺ� Ŭ������ static ���� ȣ�� ���
 * 				������
 * 					- ������ Ŭ������ static ���� ȣ�� ���
 * 				����������.������
 * 					- ���������� �̹� �ִٸ� ���Ǵ� ����
 * 
 *			2. �����Ǵ� ��� ��ü�� �����ϴ� ������
 *				- ���ǻ��� : pw�� id���� ������ ���� static���� ���� �Ұ�
 *
 *			3. ���� ��� �����ϰ� �޸𸮿� �����Ǵ� ������ byte code�� ����(�ε�)�� �ڵ� ����
 *			
 *	2. �޼ҵ�
 *		- Syntax4Static.java
 *		1. Ư¡
 *			- ��ü �������̵� �������� ���� ȣ�� ����
 *
 *		2. ȣ�� ����
 *			- class��.�޼ҵ�() or �޼ҵ��()
 *
 *	3. static{}
 *		- Syntax5Static.java
 * 
 * 3. �ֿ뵵
 * 	1. Ŭ������ ��� ������ �޼ҵ� ȣ��� ��ü ���� �� ���� ������ ȣ���� �⺻
 *  2. static���� ����� ��� ������ �޼ҵ� ȣ��ÿ��� ��ü �������� Ŭ���������� ȣ�� ����
 */

//>java Syntax3Static
//jre Syntax3Static byte code �޸𸮿� �ε�  -> Syntax3Static.main( [..]);
package step02;

public class Syntax3Static {
	int no1;   //��ü(instance) ���� �ʼ�, instance ����
	static int no2; //byte code�� �ε��ɶ� 32bit �޸� ���� �� �ڵ� �ʱ�ȭ, static ����
	
	Syntax3Static(){
		no1++;
		no2++;
	}
	
	void m1() { //��ü ���� �� ���� �����θ� ȣ�� ������ �޼ҵ�
		System.out.println("�Ϲ� �޼ҵ�");
	}
	static void m2() {  //��ü �������� Ŭ���������θ� ȣ�� ������ �޼ҵ� 
		System.out.println("static �޼ҵ�");
	}
	
	public static void main(String[] args) {
		m2();  //static �޼ҵ�
		Syntax3Static.m2(); //static �޼ҵ�  
		System.out.println(no2); //0
		
		Syntax3Static s1 = new Syntax3Static(); //no1 ������ heap �޸𸮿� ����
		System.out.println(s1.no1); //1
		System.out.println(no2); //1
		
		Syntax3Static s2 = new Syntax3Static(); 
		System.out.println(s2.no1); //1
		System.out.println(Syntax3Static.no2); //2
		
		Syntax3Static s3 = new Syntax3Static(); 
		System.out.println(s3.no1); //1
		System.out.println(s3.no2); //3
		
		no2 = 100;
		s1.no2 = 200;
		System.out.println(s3.no2);  //200
	}

}