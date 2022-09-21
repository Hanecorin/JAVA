package model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
	private int empno;  //사번
	private String ename;  //사원명
	private double sal; //월 급여
	
	private Department dept;//소속된 부서 정보
}