package model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
	private int empId;
	private String empName;
	private int mgrId;
	private double salary;
	private Department deptName;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("직원 ID : ");
		builder.append(empId);
		builder.append(", 직원 이름 : ");
		builder.append(empName);
		builder.append(", 상사 ID : ");
		builder.append(mgrId);
		builder.append(", 급여 : ");
		builder.append(salary);
		builder.append(", 근무 부서 : ");
		builder.append(deptName);
		return builder.toString();
	}
	
}