package model.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Builder
@Entity
public class Emp {

	@Id
	@Column
	private Long empno;
	
	@Column
	private String ename;
	
	@Column
	private String job;
	
	@Column
	private Long mgr;
	
	@Column
	private Date hiredate;
	
	@Column
	private Long sal;
	
	@Column
	private Long comm;
	
	/* 
	 * JPA�� entity fk ������ EntityŸ������ ����
	 * @ManyToOne : dept ��ü ���� -> emp��ü ���� (has a ����)
	 * @ManyToOne(fetch=FetchType.LAZY) : emp ��ü ���� -> ��ü ���� emp�� dept ��ü ����, has a
	 */
	
//	@ManyToOne(fetch=FetchType.LAZY)
	@ManyToOne // ����� table�� ��� ���� �˻�(�ϳ� �̻��� table�� ��� join �˻�)
	@JoinColumn(name = "deptno")
	private Dept deptno; // emp�������� fk/dept deptno pk
	
	/*
	 * @ManyToOne(fetch=FetchType.LAZY)
	 * 	- Emp���� Dept�� join ���� �˻�
	 * 	- Dept�� �÷� ������ �ʿ��� ��� ���� select ����
	 * 	- ���� ����
	 * 		- �̹� select �� ������ Ȱ��ÿ� ���� Dept table�� ������ Ȱ���ϴ� �ڵ�� ����
	 * 		- ���� : toString() ������ ó�� �����ʹ� �������� �ұ��ϰ� �� select ��û�� ���� ���� ���·� deptno.getDname() ȣ�� �� ���� ����  
	 */

	@Override
	public String toString() {
		return "Employee [��� ���̵� = " + empno + ", ����� = " + ename + ", �޿� = " + sal + ", �μ� = " + deptno.getDname() + "]";
	}
}