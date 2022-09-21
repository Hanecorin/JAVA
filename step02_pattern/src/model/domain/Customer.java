package model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Customer {
	private String id;
	private int age;
	private String grade;
	private char gender; //f, m
	
	//奄沙 持失切
//	public Customer() {} // @NoArgsConstructor
	
	//持失切
//	public Customer(String id, int age, String grade, char gender) { //@AllArgsConstructor
//		this.id = id;
//		this.age = age;
//		this.grade = grade;
//		this.gender = gender;
//	}
	
//	public String getId() {
//		return id;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public String getGrade() {
//		return grade;
//	}
//	public void setGrade(String grade) {
//		this.grade = grade;
//	}
//	
//	public char getGender() {
//		return gender;
//	}
//	public void setGender(char gender) {
//		this.gender = gender;
//	}
}
