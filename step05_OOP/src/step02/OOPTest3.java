/* ��ü Ÿ�� �� �н�
 * 
 * 1. ��ü Ÿ�� �� ������ : instanceof
 * 2. ��, ��� ���賢���� Ÿ�԰����� ��
 * 3. ���ǻ���
 * 		���� Ÿ���� ������ ������ ���� ��ü����(������ ����) ����Ÿ���� ��� ���� ���� Ÿ�Ե�� �� ����
 * 		B b = new B() ó�� Ÿ�԰� ��ü�� ��ġ�� ��쿣 ���� Ÿ�� �̿ܿ� �ٸ� Ÿ�԰� �� �Ұ� 
 * 4. �⺻�� ������ ��� ��üŸ�԰� Ÿ�԰� �� �����ϰ� �Ϸ��� � Ÿ���� ������ ����
 * 	- Object
 */
package step02;

class A{}
class B extends A{}

class D extends A{}

public class OOPTest3 {

	public static void main(String[] args) {
		System.out.println("step01 ---");
		A a = new A();  // Object -> A
		B b = new B();  // Object -> A -> B 
		D d = new D();  // Object -> A -> D
		System.out.println(a == b); // false
		System.out.println(a instanceof A); //true a�� �����ϴ� Ÿ���� A Ÿ�Կ��� Ȯ��
		System.out.println(a instanceof Object); //true a�� �����ϴ� Ÿ���� Object Ÿ�Կ��� Ȯ��
		System.out.println(a instanceof B); //false a�� �����ϴ� Ÿ���� Object Ÿ�Կ��� Ȯ��

		// ��Ӱ��谡 �ƴ� Ÿ�԰����� �� ��ü ����
		// System.out.println(b instanceof D);  //����   B b = new B();
		
		System.out.println("step02 --- ������ ����");
		Object a2 = new A();  	// Object -> A
		A b2 = new B();  		// Object -> A -> B 
		A d2 = new D();  		// Object -> A -> D
		
		/* A Ÿ��(����)�� ������ ������ ������ ���� Ÿ���� ��ü���� 
		 * A�� ��ӹ޴� Ÿ�԰����� �� ���� 
		 */
		System.out.println(b2 instanceof D);   //
		System.out.println(d2 instanceof B);   //?
		
		
		
		System.out.println(a2 instanceof Object);   //true
		System.out.println(b2 instanceof Object);   //true
		System.out.println(d2 instanceof Object);   //true
		
		System.out.println(b2 instanceof A);   //true
		System.out.println(d2 instanceof A);   //true
		

		System.out.println("step03 --- ������ ����");
		Object a3 = new A();
		System.out.println(a3 instanceof Object); 	//t
		System.out.println(a3 instanceof A);  		//t
		System.out.println(a3 instanceof String);  	//f
		System.out.println(a3 instanceof Integer); 	//f
		
		
	}

}
