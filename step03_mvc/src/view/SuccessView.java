package view;

import model.domain.Student;

//브라우저에 출력 담당하는 화면 처리로 변환예정 : jsp라는 화면 처리 스펙
//StartView -> Controller -> Model : Student&Subject -> Controller -> SuccessView or FileView
public class SuccessView {
	
	//검색된 학생 정보 출력
	public static void printStudent(Student stu) {
		System.out.println("검색된 학생 정보 : " + stu.getName() + " " + stu.getGrade());
	}

	public static void printTeacherName(String name) {
		System.out.println("해당 과목의 강사명 정보 : " + name);
	}
	
}