/* step01/util/A.class 와 ArrayListTest2.class가 생성
 * 
 */

package step01.util;

import java.util.ArrayList;

import org.junit.Test;

class A extends Object{

	public String toString() {
		return "A";
	}
	
	static Object m1() {  //Object 변수 =  "A입니다";
		return "A입니다";
	}
}

public class ArrayListTest2 {
	
	@Test
	public void m2() {
		//제네릭 적용 - String만 저장 가능한 String 배열로 간주
		ArrayList<String> a1 = new ArrayList<>(); 
		a1.add("string"); 
		String s1 = a1.get(0);//형변환 없이 String 변수에 대입
		System.out.println(s1.length());
		
		System.out.println(a1.get(0).length());		
		
		//?
		ArrayList<A> a2 = new ArrayList<>();
		a2.add(new A());
		//? A의 m1() 호출 해서 반환된 문자열 길이 출력 
		/*   ( (String)a2.get(0).m1() ).length() 
		 * a2 - ArrayList 단 A객체 저장 가능
		 * a2.get(0) - A객체 반환
		 * a2.get(0).m1() - 반환받은 A의 m1() 호출, m1() 반환값이 Object 
		 * 
		 * (String)a2.get(0).m1() - m1() 반환값을 String으로 변환
		 * ( (String)a2.get(0).m1() ).length() - String의 length() 호출 
		 */
		System.out.println(   ( (String)a2.get(0).m1() ).length()  );
		
		//System.out.println(    (String)a2.get(0).m1().length()  ); 에러
	}
	
//	@Test
	public void m1() {
		/* 타입 제약을 하는 제네릭 표현이 없을 경우엔 저장된 객체 타입만의 멤버 호출시에는 형변환 필수
		 */
		ArrayList a = new ArrayList();
		a.add(new A()); //0번째 저장
		
		//? ArrayList에 저장된 A객체를 획득 후 m1() 호출해서 리턴된 데이터 길이 출력
		Object o = a.get(0);
		A a2 = (A)o;
		Object v = a2.m1();
		String s = (String)v;
		System.out.println( s.length() );
		
		//가독성이 아쉽다!!!
		System.out.println(((String)(((A)(a.get(0))).m1())).length());	
		
		//2차 개선
		A a3 = (A)a.get(0);
		System.out.println( ( (String)a3.m1() ).length() ); 
	}
}