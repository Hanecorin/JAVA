/* 배열 학습내용
 * 
 * 1. 문법 - [] 
 * 2. 특징
 * 	- 다수의 데이터를 하나의 그룹처럼 관리
 *  - 고유한 데이터값들은 index로 처리 
 *  - 한번 생성된 배열의 크기는 수정 불가
 *  - 모든 배열은 무조건 객체타입
 *  - length 즉 배열의 크기값을 보유한 속성이 자동 생성
 *  
 * 3. 문법
 * 	1. 선언 생성 초기화를 한번에 한 문장으로 구현
 * 		타입 [] 변수 = {값1, 값2, 값3,...};
 *  2. 선언, 생성과 초기화를 분리해서 구현
 *  	타입 [] 변수 = new 타입[크기];
 *  	변수[index] = 값;
 */
package step02;

import org.junit.Test;

import model.domain.People;

public class Syntax6Array {
	
	//int값들로 구성된 배열 생성 및 활용
	//배열 선언 및 생성 -> 값 초기화 순으로 작업
//	@Test
	public void intArray() {
		int [] i = new int[2]; //int값 두개 저장 가능한 int배열 생성    i=[]
		i[0] = 10;  //초기화
		i[1] = 20;
		System.out.println(i[0]);  //10
		System.out.println(i.length); //2
	}
	
	//선언 생성 초기화를 한 문장으로 구현
//	@Test
	public void intArray2() {
		//{} 표현만으로 객체 생성 
		int[] i = {1, 2, 3}; //3개의 int값 저장 가능한 메모리 생성 및 명시적인 초기화
		System.out.println(i[0]);  //1
		System.out.println(i.length); //3
		
		
		int i2;
//		System.out.println(i2);//i2는 초기화 되지 않아서 사용시 에러 사용전 초기화 필수 
		
		int [] i3 = new int[5]; //로컬 변수임에도 배열은 생성시 heap 공간에 저장 따라서 자동 초기화
		System.out.println(i3[2]); // 0
		i[3] = 100;//초기화
	}
	
	
	
	
	//String값들로 구성된 배열 
//	@Test
	public void stringArray() {
		String [] s = {"a", "b", "c"};  //0~2까지의 index와 3값을 보유한 length 생성
		for(String v : s) {
			System.out.println(v);			
		}
	}
	
	//People값들로 구성된 배열  import model.domain.People
	@Test
	public void peopleArray() {
		People [] p = {new People("연아", 30), 
					   new People("재석", 60),
					   new People("동엽", 30),
					   new People("동엽", 50)};
		
		System.out.println(p); //People 배열 객체
		System.out.println(p[0]); //People 객체
		System.out.println(p[0].getName()); //String 객체
		
		System.out.println("30살인 동엽(index 2)의 이름이랑 동명이인의 이름과 나이 출력");
		
		//? 힌트 - 문자열 내용값 동등 비교 메소드 public boolen equals(String v){}
		String name = p[2].getName(); //동엽
		
		//for(People v : p) {
		for(int i=0; i < p.length ; i++) { //index값이 필요한 경우 권장
			
			if( i != 2 && name.equals(p[i].getName())) {  //이름 비교
				System.out.println(p[i].getName() + " " + p[i].getAge());
			}
			
		}
		
		//? 30 살 친구들만 출력해 보기
		System.out.println("*** 30살 ***");
		for(People v : p) {
			if(v.getAge() == 30) {
				System.out.println(v.getName() + " " + v.getAge());
			}
		}
		
		//주소값 비교
		System.out.println(p[0] == p[1]); //false 객체들의 주소값 비교
		System.out.println(p[0].getAge() == p[1].getAge()); //false int값 비교
		
		//이름 비교
		System.out.println(p[0].getName().equals(p[1].getName())); //false 이름값들 비교		
		
	}
		
}