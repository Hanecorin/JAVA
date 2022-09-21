package run;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.junit.Test;

import model.domain.entity.Employee;
import util.DBUtil;

public class RunTest2JPQL {
	//한명의 직원 검색 - find()
//	@Test
	public void step01() {
		EntityManager em = DBUtil.getEntityManger();
		Employee e = em.find(Employee.class, 1l);
		System.out.println(e.getEname());		
	}
	
	//모든 직원 검색 
	//
	// select * from employee;
	/* 
	 * JPA 기반의 select 문장 생성시 즉 JPQL 기법을 table기준이 아닌 entity가 기준
	 * 
	 * Employee 라는 Entity 클래스의 모든 멤버 변수를 e로 검색함을 의미 
	 * select e from Employee e
	 */
//	@Test
	public void step02() {
		EntityManager em = DBUtil.getEntityManger();
		// db로 부터 검색된 데이터를 코드상에서 사용 가능한 list로 변환
		// e라는 별칭에는 Employee의 모든 멤버 변수들 보유 e.ename문법
		List<Employee> all = em.createQuery("select e from Employee e").getResultList();
		for(Employee e : all) {
			System.out.println(e);
		}
	}
	
	// JPQL - select e.ename from Employee e
	// SQL - select ename from Employee
	@Test
	public void step03() {
		EntityManager em = DBUtil.getEntityManger();
		List<String> all = em.createQuery("select e from Employee e").getResultList();
		for(String e : all) {
			System.out.println(e);
		}
	}
	
	
	
	
	@Test
	public void step04() {
		EntityManager em = DBUtil.getEntityManger();
		// 직원 총원 - select count(*) from employee
		List r1 = em.createQuery("select count(*) from Employee e").getResultList();
		System.out.println(r1);
		
		// K로 시작하는 전 직원명 조회 - select ename from employee where ename like 'K%'
		List<String> r2 = em.createQuery("select ename from Employee e where ename like 'K%'").getResultList();
//		for(String r : r2) { 
//			System.out.println(r);
//		}
		r2.forEach(System.out::println);
		
		// company_id로 사원들의 사번과 이름 조회 - select empno, ename from employee where company_id=?
//		System.out.println(em.createQuery("select e.empno, e.ename from Employee e where company_id=1").getResultList());
		List<Employee> r3 = em.createQuery("select e from Employee e where company_id=1").getResultList();
//		for(Employee r : r3) { 
//			System.out.println(r.getEmpno() + " " + r.getEname());
//		}		
		r3.forEach(v -> System.out.println(v.getEmpno() + " " + v.getEname()));
		
		System.out.println("****  ****");
		//System.out.println(em.createQuery("select e.empno, e.ename from Employee e where company_id=1").getResultList().get(0));
		
		/* 다형성
		 *  - 상속 기반의 형변환
		 *  - 자식 타입의 변수에 부모 타입의 객체를 변환
		 *  - List<Employee> createQuery("Employee").getResultList()
		 *  - List<String> createQuery("Employee의 ename들만 검색").getResultList()
		 *  - List<Object[]>
		 */
//		Object o = em.createQuery("select e.empno, e.ename from Employee e where company_id=1").getResultList().get(0);
//		System.out.println((Object[])o);
//		System.out.println( ((Object[])o)[0] );
//		System.out.println( ((Object[])o)[1] );
		
		List<Object[]> o = em.createQuery("select e.empno, e.ename from Employee e where company_id=1").getResultList();
		System.out.println(o.get(1)[0] + " " + o.get(1)[1]);
		

		System.out.println("*** 코드 분석 ***");
		List o2 = em.createQuery("select e.empno, e.ename from Employee e where company_id=1").getResultList();
		Object[] obj = (Object[])o2.get(0);
		System.out.println(obj.length);
		
		System.out.println("*** 개수 counting ***");
		//검색된 데이터는 개수값을 보유한 하나의 row 구조로 검색 즉 size()는 list에 몇개의 row 즉 데이터 수 카운팅
//		int count = em.createQuery("select count(*) from Employee e").getResultList().size();
		
		//int count = em.createQuery("select count(*) from Employee e").getSingleResult();
		System.out.println(em.createQuery("select count(*) from Employee e").getSingleResult());
		
		System.out.println("*** 사번으로 직원 한명 검색 ***");
		Employee emp = (Employee)em.createQuery("select e from Employee e where empno=2").getSingleResult();
		System.out.println(emp);


	}
	
}
