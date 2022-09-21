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
public class Department {
	private int deptno; //�μ� ��ȣ
	private String dname; //�μ���
	private String loc; //�μ� ��ġ(����)
}