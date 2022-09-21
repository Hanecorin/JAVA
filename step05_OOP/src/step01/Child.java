// ��� �н�
package step01;

class Parent extends Object{
	String name;
	int age;
	
	Parent(){
		super(); //�θ��� �⺻ ������ ȣ��
		System.out.println("�θ�");
	}
	Parent(String name, int age){
		super(); //�θ��� �⺻ ������ ȣ��
		System.out.println("�θ�");
		this.name = name;
		this.age = age;
	}
	void print() {
		System.out.println(name);
		System.out.println(age);
		//.. 80line �̶� ����
	}
}
//name, age, print() ���, �� print() ���� ����(������, override, overriding)
public class Child extends Parent{
	String job;
	
	Child(){
		super(); //�θ��� �⺻ ������ ȣ��
		System.out.println("�ڽ�");
	}
	void print() {
		super.print();
		System.out.println(job);
	}
	
	public static void main(String [] args) {
		//Object -> Parent -> Child ��ü ������ ����
		//Parent ��ü ������ name, age �޸� ���� -> Child ��ü ������ job �޸� ����
		Child c = new Child(); 
		System.out.println(c.name);
	}
}