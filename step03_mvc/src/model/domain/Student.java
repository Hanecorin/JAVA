package model.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter; 

@Builder

@Getter
@Setter
public class Student {
	private String name;
	private int grade;//1, 2, 3 등의 학년	
}