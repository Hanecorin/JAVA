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
		builder.append("���� ID : ");
		builder.append(empId);
		builder.append(", ���� �̸� : ");
		builder.append(empName);
		builder.append(", ��� ID : ");
		builder.append(mgrId);
		builder.append(", �޿� : ");
		builder.append(salary);
		builder.append(", �ٹ� �μ� : ");
		builder.append(deptName);
		return builder.toString();
	}
	
}