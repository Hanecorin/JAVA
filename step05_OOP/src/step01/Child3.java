//다형성 학습 
/* 상속 관계에서만 성립되는 메카니즘
 * 문법
 * 	상위타입 변수 = 자식객체
 */

package step01;

class Parent3 extends Object{
	int no1 = 10;
	
	Parent3(){
		super();
	}
}

public class Child3 extends Parent3 {  //Child3은 no1, no2 변수
	int no2 = 100; //다형성 변수로 access 불가 은닉구조
	
	public Child3() {
		super();
	}
	public static void main(String[] args) {
		Object c1 = new Child3();
		Object p1 = new Parent3();
		/* c2타입 - Parent3
		 * c2 변수는 상속관계의 다형성 객체 생성 Child3 
		 * 	Child3 객체 생성시에 Object -> Parent3 -> Child3 순으로생성
		 * 		Parent3 생성시 no1 변수 메모리에 생성
		 * 		Child3 "	 no2  "    "    "  
		 */
		Parent3 c2 = new Child3(); //다형성 적용된 객체 생성
		System.out.println(c2.no1); // 10
		c2.no1 = 1000;
		System.out.println(c2.no1); // 1000
		//c2.no2 = 2000;  //에러 상위타입 변수로는 access 절대 불가
		
		//해결책 : 객체 타입간의 형변환
		//새로운 객체 생성? 이미 생성된 객체를 공유?
		Child3 c22 = (Child3)c2;
		c22.no2 = 2000;
		System.out.println(c22.no2);
		c2.no1 = 10000;  //1000 -> 10000으로 변경
		System.out.println(c22.no1); // 10000
		
	}

}