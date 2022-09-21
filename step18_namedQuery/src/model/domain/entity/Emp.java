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
	 * JPA의 entity fk 설정은 Entity타입으로 선언
	 * @ManyToOne : dept 객체 생성 -> emp객체 생성 (has a 관계)
	 * @ManyToOne(fetch=FetchType.LAZY) : emp 객체 생성 -> 객체 생성 emp는 dept 객체 포함, has a
	 */
	
//	@ManyToOne(fetch=FetchType.LAZY)
	@ManyToOne // 연계된 table의 모든 정보 검색(하나 이상의 table인 경우 join 검색)
	@JoinColumn(name = "deptno")
	private Dept deptno; // emp관점에서 fk/dept deptno pk
	
	/*
	 * @ManyToOne(fetch=FetchType.LAZY)
	 * 	- Emp에서 Dept와 join 없이 검색
	 * 	- Dept의 컬럼 정보가 필요한 경우 별도 select 실행
	 * 	- 주의 사항
	 * 		- 이미 select 한 데이터 활용시에 절대 Dept table의 정보를 활용하는 코드는 금지
	 * 		- 예시 : toString() 재정의 처럼 데이터는 없음에도 불구하고 재 select 요청도 하지 않은 상태로 deptno.getDname() 호출 시 실행 오류  
	 */

	@Override
	public String toString() {
		return "Employee [사원 아이디 = " + empno + ", 사원명 = " + ename + ", 급여 = " + sal + ", 부서 = " + deptno.getDname() + "]";
	}
}