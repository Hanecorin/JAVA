package step02;

interface Playdata {
	// 반드시 나이 값 반환
	public abstract int getAge();
	
}

public class InnerClass {
	public static void main(String[] args) {
		// Playdata p1 = new Playdata(); 문법 오류

		/* 
		 * inner class의 구현과 객체 생성이 혼용된 구조
		 * Playdata interface를 이름이 없는 클래스 개발
		 * 메소드 재정의 
		 * 객체 생성
		 * 
		 * 
		 * class InnerClass$1 implements Playdata{
		 * 		public int getAge() {//재정의 필수 
		 *			return 20;
		 *		}
		 * }
		 * Playdata p1 = new InnerClass$1();
		 * 
		 * 동일한 코드
		 */
		Playdata p1 = new Playdata() {
			public int getAge() {//재정의 필수 
				return 20;
			}
		};
		System.out.println(p1);// step02.InnerClass$1@cac736f

		Playdata p2 = new Playdata() {
			public int getAge() {
				return 30;
			}
		};
		System.out.println(p2);
	}
}

