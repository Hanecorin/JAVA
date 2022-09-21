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
		builder.append("부서 ID  ");
		builder.append(deptId);
		builder.append(", 부서 이름 : ");
		builder.append(deptName);
		builder.append(", 근무지 : ");
		builder.append(loc);
		return builder.toString();
	}

}