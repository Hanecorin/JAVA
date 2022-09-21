/* 학생, 과목 정보를 활용하게 되는 핵심 클래스
 * 차후에 db에 실제 직접 연동
 * sql문장 처리하는 클래스
 * 
 * 서비스 로직? crud
 * 	학생 정보 저장 / 과목 정보 저장/...
 *  이름으로 학생 한명의 모든 정보 검색이라 가정
 *  	- select * from student where name=?
 *  과목으로 해당 과목의 강사이름만 검색 이라 가정
 *  	- select teacher_name from subject where subject_name=?
 * 
 */
package model;

import model.domain.Student;  //ctrl+shift+o
import model.domain.Subject;

public class Model {

	//static{} 에서 값 대입(초기화), 메소드들에서 데이터 활용
//	private Student stu01; //객체 생성 직후에만 사용 가능한 변수
	private static Student stu01; 
	private static Subject sub01; //객체 생성 전에 사용 가능한 변수
	private static Model instance = new Model();
	
	//외부에서 호출 불가 
	//외부에서 객체 생성 금지 
	//Model에서 객체 생성해서 주소값(참조값) 제공
	private Model() {}
	
	//singleton 구조의 객체의 주소값 반환 
	//단 Model 객체 생성을 외부에서 금지, 즉 객체 생성 및 여부와 무관하게 호출 가능한 메소드 여야 함
	public static Model getInstance() {
		return instance;
	}
	
	
	//Model.class가 메모리에 로딩시 단 한번 실행되는 독특한 문법
	//공유자원 초기화 권장 - test 데이터를 구성(rdbms의 데이터 구성으로 간주)
	static {
		//초기화 값 대입 - Student 변수와 Subject 변수는 멤버
		stu01 = Student.builder().name("연아").grade(3).build();
		sub01 = new Subject("영어", "유재석");
		
	}
	
	// select * from student where name=?
	/* 다수의 학생이 있다 가정, 동명 이익 없음
	 * 이름 비교후 true인 경우 해당 학생 정보 반환
	 * 학생 정보(Student)
	 * 
	 * 참조타입(객체, class, reference)의 기본값은 null
	 * 
	 * Student 타입이 반환인 경우 null 또는 Student 객체만 반환
	 */
	public Student queryStudent(String name){
		if(name.equals(stu01.getName())) { // parameter와 stu01 참조하는 객체의 이름 비교
			return stu01;
		}else {
			return null;  //null 객체타입의 기본 값
		}
	}
		
	// select teacher_name from subject where subject_name=?
//	public static String queryTeacherName(String subjectName){//객체 생성없이 실행 가능한 메소드 
	public String queryTeacherName(String subjectName){//객체 생성 후 참조 변수로 호출하는 메소드 
		return sub01.getTeacherName();
	}
	
}