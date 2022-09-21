package model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Department {

	private int deptId;
	private String deptName;
	private String loc;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("�μ� ID  ");
		builder.append(deptId);
		builder.append(", �μ� �̸� : ");
		builder.append(deptName);
		builder.append(", �ٹ��� : ");
		builder.append(loc);
		return builder.toString();
	}

}