/* 학습 내용
 * 1. builder pattern 이용해서 객체 생성하는 방법 연습 시작
 * 2. 주 목적
 * 	- 필요한 멤버 변수값만 객체 생성시점에 초기화 가능한 설계
 *  - 장점
 *  	- 데이터가 많은 멤버 변수가 다수인 클래스의 객체 생성시에 효율적
 *  - 왜? 다수의 데이터 중에서 선별해서 데이터 초기화 가능하기 때문
 *  - 문법 적인 관점에서
 *  	객체 생성후에 setXxx() 호출 구조 아님 
 * 
 */
package model.domain;

import org.junit.Test;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@NoArgsConstructor //기본 생성자
//@AllArgsConstructor
@Getter
@Setter
@Builder
public class Customer {
	private String id;
	private int age;
	private String grade;
	private char gender; //f, m

	/*
	public Customer(String id) {
		this.id = id;
	}
	public Customer(int age) {
		this.age = age;
	}
	public Customer(String id, int age) {
		this.id = id;
		this.age = age;
	}
	public Customer(int age, String grade) {
		this.age = age;
		this.grade = grade;
	}	
	public Customer(int age, String id) {
		this.age = age;
		this.id = id;
	}	*/
	
	
	//단순 test  - 개발시 실시간 test로 사용 단 실제 서비스를 위해 서버에 배포시에는 삭제하는 단위 test
	/* 자소서로 작성하는 데이터 - 해당 작성자 정로보 관리
	 * 30개의 데이터가 가정 / 30개의 변수 / table의 관점 : 30개의 컬럼
	 * 모든 자소서의 모든 항목 100% 다 작성 보장불가 
	 * 옵션
	 * 만일 자바 관점에서 입력된 데이터로 해당 Customer 객체 생성이라 가정시
	 *  30개의 parameter가 있는 생성자 필요
	 *  옵션을 제외한 수 만큼의 parameter가 있는 생성자 필요
	 *  즉 다양한 생성가 개발 필요
	 *  문제
	 *  	옵션 항목이 사람마다 다르다
	 *  	 어떤 변수가 빠져야 하고 어떤 변수가??? 이슈 발생 
	 */
	
	//@Test
//	public void run() {
	public static void main(String [] args) {
		//기본 생성자로 호출해서 객체 생성
//		Customer c1 = new Customer();
//		c1.setId("id01");
		
	/* CustomerBuilder 
	 * 	주용도 : 데이터 선별해서 멤버변수 초기화 가능하게 해주는 주체
	 *  Customer 라는 객체를 생성(만드는)하는 API
	 *  @Builder로 인해 자동 생성
	 *  해당 클래스가 보유하게 되는 구성
	 *  	Customer의 모든 멤버 변수와 변수명과 동일한 메소드 자동 생성
	 *  
	 *  활용 문법
	 *  Customer.builder()  반환 타입  CustomerBuilder
	 *  id() 반환 타입 CustomerBuilder
	 *  build() 반환 타입 Customer
	 */
		// 멤버 변수들은 객체 생성 시점에 자동 초기화
		//id값은 명시적 초기화
		//메소드 호출을 연계해서 메소도 호출 체이닝 기술 로 데이터 초기화
		Customer c2 = Customer.builder().id("id01").build();	
		System.out.println(c2.id + " " + c2.age + " " + c2.gender);
	
	}

}