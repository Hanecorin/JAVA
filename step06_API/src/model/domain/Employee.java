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
	private int empno;  //���
	private String ename;  //�����
	private double sal; //�� �޿�
	
	private Department dept;//�Ҽӵ� �μ� ����
}