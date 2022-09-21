package step01;

import org.junit.Test;

class A{
	String name = "playdata";
	A(){
		System.out.println("A");
	}
}
class B{
	A a = new A();
	B(){
		System.out.println("B");
	}
}
class C{
	B b = new B();
	C(){
		System.out.println("C");
	}
}

public class App {

	@Test
	public void test() {
		C c = new C();  //더 이상의 객체 생성 금지
		//? A의 name 변수값 출력
		//? 객체 생성 순서 나열하기 String -> A -> B -> C
		/* c.b.a.name
		 * c = C
		 * c.b = B
		 * c.b.a = A
		 * c.b.a.name = String  
		 */
		System.out.println(c.b.a.name.charAt(0)); //playdata
		System.out.println(c.b.a.name.length()); //8
		
		/* System.out.println()
		 * System - java.lang
		 * System.out - public static PrintStream out 
		 * println() 은 PrintStream에서 제공하는 메소드
		 */
	}
	
}