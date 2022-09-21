package model.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder  

// �μ���ȣ�� �μ��� �˻� / �μ���ȣ�� ��� �μ� ���� �˻�
// ���������� ���� ��� : binding
// [:������] - �������ϸ� �ش� ǥ�� ������ ���� ����
@NamedQuery(name = "Dept.findDnameByDeptno", query = "select d.dname from Dept d where d.deptno = :deptno")
@NamedQuery(name = "Dept.findDept", query = "select d from Dept d")

@Entity
public class Dept {
	@Id
	@Column
	private Long deptno;
	
	@Column
	private String dname;
	
	@Column
	private String loc;

}