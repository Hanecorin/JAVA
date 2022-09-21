// 실제 db와 연동되는 핵심
package model;

import model.domain.Customer;

public class Model {
	
	private Customer c = new Customer("id01", 20, "vvip", 'F');  //단수 test 데이터 구성
	
	public Model() {}
	
	//"id01"
	public Customer select(String id){
		//id값으로 비교 검증 로직이 있다 가정  ....
		return c; //new Customer("id01", 20, "vvip", 'F') 즉 이 데이터를 보유한 객체 반환
	}

	public boolean update(String id, String newGrade){
		//update customer set grade=? where id=? 문장 실행 예정이라 가정
		c.setGrade(newGrade);// 차후에 sql로 처리 예정
		return true;		
	}
	
}