package step01;

import model.domain.Car;  //ctrl+shift+o

public class Syntax3CarTest {

	public static void main(String[] args) {
		//객체 생성 / c1 : 객체주소값 보유한 참조 변수
		//멤버 변수들로만 객체 생성 즉 메모리 확보
		//c1 참조 타입변수, 로컬 변수 
		Car c1 = new Car();
		c1.setCarName("그랜저");  //로컬 변수은 carName 변수가 메모리에 생성
		
	}

}