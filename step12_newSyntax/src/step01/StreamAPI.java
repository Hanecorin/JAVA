// Stream API
/*
 * 람다식
 * 	- 선언과 동시에 식처럼 활용
 * 	- 값을 받고 반환하는 로직을 간결한 코드로 개발 
 */

package step01;

import java.util.Arrays;
import java.util.List;

public class StreamAPI {

	public static void main(String[] args) {
		System.out.println("--- step01 ---");
		/*
		 * List interface 즉 객체 생성 불가, 미완성 메소드와 상수로 두성
		 * 단 하위 클래스에서 상속(implements) 받고 모든 메소드 재정의
		 */

		List<String> datas = Arrays.asList("a", "b", "c", "d");
		
		//step01 반복문 1.0부터
//		for (int i = 0; i < datas.size(); i++) {
//			System.out.println(datas.get(i));
//		}
		
		// step02 반복문 1.5부터
//		for(String s : datas) {
//			System.out.println(s);
//		}
		
		// step03 반복문 1.8부터
		/* 
		 * datas 변수가 참조하는 list의 데이터 수만큼 반복해서
		 * s라는 변수에 대입 및 출력 
		 */
		datas.forEach(s -> System.out.println(s));
		System.out.println("-----");
		
		// 변수 선언 없이 데이터를 받아서 바로 출력
		//System.out : out 변수 타입 PrintStream에서 println 호출
		/*
		 *  - System.out::println
		 * 		PrintStream의 println 메소드 호출
		 * - Employee::getDepartment
		 * 		Employee의 getDeparement 메소드 호출  
		 * 		employeeList.stream().map(Employee::getDepartment)
		 * 
		 * 이 두개의 문법의 공통점 : 다른 메소드의 parameter로 코딩 
		 */
		datas.forEach(System.out::println);
		
	}

}
