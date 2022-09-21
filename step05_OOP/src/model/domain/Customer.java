package model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@ToString
public class Customer {
	private String id;
	private int pw;
	
	//toString() 재정의
	//equals() 재정의
	/* 같은 Customer 타입의 객체들 간에 내용 비교(데이터값) 
	 * 동일한 true / 다르면 false
	 * 1. Customer 타입 - instanceof 		
	 * 	1. 맞다 - id/pw 비교
	 * 		- String 값들 비교시 : equals() / int 값들 비교시 : ==  
	 * 		1. 맞다 - true
	 * 		2. 다르다 - false
	 *  2. 다르다 - false
	 *  
	 *  t
	 */
	public boolean equals(Object o) { //o는 Customer 자식만의 id/pw는 access 불가
		if(o instanceof Customer) {
			Customer c = (Customer)o;
			if( id.equals(c.id) && pw == c.pw ) {
				return true;  //return 시 메소드 종료
			}
		}
		
		return false;
	}
	
//	public boolean equals(Object o) { //o는 Customer 자식만의 id/pw는 access 불가
//		if(o instanceof Customer) {
//			Customer c = (Customer)o;
//			
//			if( id.equals(c.id) && pw == c.pw ) {
//				return true;
//			}else {
//				return false;
//			}
//		}else {
//			return false;
//		}				
//	}
//	
	
	
}