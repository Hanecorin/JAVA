package step03.app;

import org.junit.Test;

import model.domain.Student;
import model.domain.Subject;

public class School {
	
	/* ? 연아, 3, 체육, 강사명 동엽
	 * Student 객체 생성 후에 이름만 출력
	 */
	@Test
	public void m1() {
		Subject sub = new Subject("체육", "동엽");
		/* Student.builder().name("연아").grade(3).subject(sub).build()
		 * Student.builder() - StudentBuilder
		 * Student.builder().name("연아") - StudentBuilder
		 * Student.builder().name("연아").grade(3) - StudentBuilder
		 * Student.builder().name("연아").grade(3).subject(sub) - StudentBuilder
		 * Student.builder().name("연아").grade(3).subject(sub).build() - Student
		 */		
		//데이터 설정 프로그램에서 사용 가능한 형식으로 구성
		//객체생성
		Student s1 = Student.builder().name("연아")
					.grade(3).subject(sub).build();
		
		/* 
		 * Student 객체로 부터 Subject 객체 뽑고 TeacherName 값 뽑고 출력 
		 */
		System.out.println(s1.getSubject().getTeacherName());
		
	}
}