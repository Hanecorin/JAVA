/* 학습 내용
 * 변수 
 * 1. 선언 위치에 따른 구분
 * 	1. 멤버 변수
 * 		- class {} 괄호 내부에 선언되는 변수
 * 		- 객체 생성시 객체를 구성하는 데이터들
 * 		- 객체 생성시 생성, 객체가 소멸시 삭제
 * 
 *  2. 로컬 변수
 *  	- 메소드의 () 또는 {} 내부에 선언
 *  	- 메소드 호출시에만 생성되었다가 메소드 종료시 자동 소멸
 *  	- 일시적인 사용 변수
 *  	- temporary, local, automatic, stack
 *  	- 메소드 호출시 생성, 메소드 종료시 자동 소멸
 *  	- 선언된 메소드 내에서만 사용 가능한 변수
 *  	- 저장되는 공간 stack
 *  
 * 2. 타입에 따란 변수 구분
 * 	1. 기본 타입
 * 		- 8가지 내장된 built in type
 * 		- int
 *  2. 참조 타입
 *  	- class를 기반으로 한 타입
 *  	- String, People ...
 * 
 */

package model.domain;

public class Car {
	
	private String carName; //멤버	
	private int carNumber;  //멤버
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {  //carName 로컬 변수
		this.carName = carName;  //멤버 변수에 로컬 변수값 대입
	}
		
	
	public int getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(int carNumber) {  //carNumber 로컬 변수
		this.carNumber = carNumber;   //멤버 변수에 로컬 변수값 대입
	}
	
	public void print() {
		String msg = "Car";  // 로컬 변수 
		System.out.println(msg);
	}
	
	
}