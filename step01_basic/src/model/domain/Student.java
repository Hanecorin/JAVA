package model.domain;

import org.junit.Test;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString; 

@Builder
//@NoArgsConstructor
@Getter
@Setter
//@ToString  //재정의 
public class Student {
	
	private String name;
	private int grade;//1, 2, 3 등의 학년	
	private Subject subject;  //과목명, 강사명   has a[헤즈어] 관계
	
	//이클립스는 모든 멤버 변수들 값을 하나의 문자열로 결합해서 반환
	//데이터 표현의 default 권장 로직
	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", subject=" + subject + "]";
	}
	
//	@Test
//	public void m() {
//		Student s = new Student();
//		System.out.println(s);
//	}
}

