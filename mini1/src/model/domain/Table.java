package model.domain;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class Table {
	private String newComer;
	private Emp empId;

	
	public Table() {
		super();
	}
	
	public Table(String newComer, Emp empId) {
		super();
		this.newComer = newComer;
		this.empId = empId;
	}
		
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("���� ���� : ");
		builder.append(newComer);
		builder.append(" " + empId);
		return builder.toString();
	}
}