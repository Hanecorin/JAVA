/* List 학습
 * 
 * 1. 객체들만 저장 가능
 * 2. 동적 메모리 구조
 * 3. 촉촉
 * 	데이터 저장
 * 		public boolean add(Object o){
 * 			ArrayList 객체에 데이터 저장
 * 		}
 * 	데이터 반환
 * 		public Object get(int index){
 * 			index값으로 해당 index에 저장된 객체 반환
 * 		}
 *  데이터 삭제
 *  
 *  */


package step01.util;

import java.util.ArrayList;


public class ArrayListTest {
	
	
	public static void main(String[] args) {
		//String 타입만 저장 가능한 ArrayList로 제한
		//제네릭 적용
		ArrayList<String> a1 = new ArrayList<>(); // [], list(),
		
		a1.add("string");  //0번째 저장
		a1.add("a"); //1번째 저장
		a1.add("b"); //2번째 저장
		a1.add("c"); //3번째 저장
		a1.add("d"); //4번째 저장
		
		System.out.println(a1.size()); //데이터 개수  5
		System.out.println(a1.get(2)); // b
		a1.remove(2);
		System.out.println(a1.size()); //데이터 개수  4 
		System.out.println(a1.get(2)); // c    
	}
		
	public static void main2(String[] args) {
		//모든 객체 타입 저장가능한 ArrayList
		ArrayList a1 = new ArrayList(); // [], list(),
		
		a1.add("string");  //0번째 저장
//		a1.add(new Integer(3));
		a1.add(3); // a1.add(new Integer(3)); 코드로 자동 변환
		a1.add("string"); //2번째 저장
		a1.add(new A());
		
		//[string, 3, string, step01.util.A@cac736f]
		/* ArrayList의 toString 메소드 구현부는
		 * 아마도
		 * 보유한 모든 객체의 toString()를 호출한 결과값을 하나의 문자열로 조합해서 반환
		 */
		System.out.println(a1);//a1.toString()
		
	}

}