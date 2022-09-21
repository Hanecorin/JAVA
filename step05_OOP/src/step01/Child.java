// 상속 학습
package step01;

class Parent extends Object{
	String name;
	int age;
	
	Parent(){
		super(); //부모의 기본 생성자 호출
		System.out.println("부모");
	}
	Parent(String name, int age){
		super(); //부모의 기본 생성자 호출
		System.out.println("부모");
		this.name = name;
		this.age = age;
	}
	void print() {
		System.out.println(name);
		System.out.println(age);
		//.. 80line 이라 가정
	}
}
//name, age, print() 상속, 단 print() 내용 수정(재정의, override, overriding)
public class Child extends Parent{
	String job;
	
	Child(){
		super(); //부모의 기본 생성자 호출
		System.out.println("자식");
	}
	void print() {
		super.print();
		System.out.println(job);
	}
	
	public static void main(String [] args) {
		//Object -> Parent -> Child 객체 순으로 생성
		//Parent 객체 생성시 name, age 메모리 생성 -> Child 객체 생성시 job 메모리 생성
		Child c = new Child(); 
		System.out.println(c.name);
	}
}