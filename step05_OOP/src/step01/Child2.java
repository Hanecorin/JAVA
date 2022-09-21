package step01;

class Parent2 extends Object {
	String id;
	int pw;
	
	Parent2(){
		super();
	}
	
	String getData() {
		return id + " " + pw;
	}
}

public class Child2 extends Parent2 {
	String name;
	
	public Child2() {
		super();
	}
	
	//? ������
	// �θ� �޼ҵ��� ��� ���� �״�� �ݿ��ϴ� �ڵ� super.�޼ҵ��([..]);
	// �޼ҵ� ���𱸰� ���� �ؾ� ��
	//job ���� 
	String getData() {
//		return id + " " + pw + " �̸� " + name;
		return super.getData() + " �̸� " + name;
	}
	
	/* java.lang.Object�� toString() ������
	 * - ���� : ��ü�� ����� ��ġ �� �ּҰ� ���ڿ��� ��ȯ
	 * - ��κ��� API�� Ŭ������ �Ǵ� �츮�� �����Ϳ����� �����ϰԵǴ� 
	 *   VO/DTO ������ Ŭ�������� ������ ����
	 * - java.lang.String - String ��ü�� ���밪�� ���ڿ��� ��ȯ   
	 * - java.lang.Integer - Integer ��ü�� ���밪�� ���ڿ��� ��ȯ   
	 * 
	 */
	public String toString() {
		return "�缮";
	}
		
	
	public static void main(String[] args) {
		Child2 c = new Child2();
		System.out.println(c.getData());
		System.err.println(c); //step01.Child2@123a439b
		
		//���� ������ ��½ÿ� toString() ������ �ڵ� ȣ��
		System.err.println(c.toString()); //step01.Child2@123a439b
		
		String i = "encore";
		System.out.println(i); //i.toString()
		
		Integer i2 = new Integer("3");
		System.out.println(i2); //i2.toString()
	}

}
