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
	
	//? 재정의
	// 부모 메소드의 모든 로직 그대로 반영하는 코드 super.메소드명([..]);
	// 메소드 선언구가 동일 해야 함
	//job 포함 
	String getData() {
//		return id + " " + pw + " 이름 " + name;
		return super.getData() + " 이름 " + name;
	}
	
	/* java.lang.Object의 toString() 재정의
	 * - 로직 : 객체가 저장된 위치 즉 주소값 문자열로 반환
	 * - 대부분의 API의 클래스들 또는 우리가 데이터용으로 구현하게되는 
	 *   VO/DTO 구조의 클래스에서 재정의 권장
	 * - java.lang.String - String 객체의 내용값을 문자열로 반환   
	 * - java.lang.Integer - Integer 객체의 내용값을 문자열로 반환   
	 * 
	 */
	public String toString() {
		return "재석";
	}
		
	
	public static void main(String[] args) {
		Child2 c = new Child2();
		System.out.println(c.getData());
		System.err.println(c); //step01.Child2@123a439b
		
		//참조 변수값 출력시에 toString() 무조건 자동 호출
		System.err.println(c.toString()); //step01.Child2@123a439b
		
		String i = "encore";
		System.out.println(i); //i.toString()
		
		Integer i2 = new Integer("3");
		System.out.println(i2); //i2.toString()
	}

}
