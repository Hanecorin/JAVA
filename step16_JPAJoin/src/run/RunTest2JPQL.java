package run;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.junit.Test;

import model.domain.entity.Employee;
import util.DBUtil;

public class RunTest2JPQL {
	//�Ѹ��� ���� �˻� - find()
//	@Test
	public void step01() {
		EntityManager em = DBUtil.getEntityManger();
		Employee e = em.find(Employee.class, 1l);
		System.out.println(e.getEname());		
	}
	
	//��� ���� �˻� 
	//
	// select * from employee;
	/* 
	 * JPA ����� select ���� ������ �� JPQL ����� table������ �ƴ� entity�� ����
	 * 
	 * Employee ��� Entity Ŭ������ ��� ��� ������ e�� �˻����� �ǹ� 
	 * select e from Employee e
	 */
//	@Test
	public void step02() {
		EntityManager em = DBUtil.getEntityManger();
		// db�� ���� �˻��� �����͸� �ڵ�󿡼� ��� ������ list�� ��ȯ
		// e��� ��Ī���� Employee�� ��� ��� ������ ���� e.ename����
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
		// ���� �ѿ� - select count(*) from employee
		List r1 = em.createQuery("select count(*) from Employee e").getResultList();
		System.out.println(r1);
		
		// K�� �����ϴ� �� ������ ��ȸ - select ename from employee where ename like 'K%'
		List<String> r2 = em.createQuery("select ename from Employee e where ename like 'K%'").getResultList();
//		for(String r : r2) { 
//			System.out.println(r);
//		}
		r2.forEach(System.out::println);
		
		// company_id�� ������� ����� �̸� ��ȸ - select empno, ename from employee where company_id=?
//		System.out.println(em.createQuery("select e.empno, e.ename from Employee e where company_id=1").getResultList());
		List<Employee> r3 = em.createQuery("select e from Employee e where company_id=1").getResultList();
//		for(Employee r : r3) { 
//			System.out.println(r.getEmpno() + " " + r.getEname());
//		}		
		r3.forEach(v -> System.out.println(v.getEmpno() + " " + v.getEname()));
		
		System.out.println("****  ****");
		//System.out.println(em.createQuery("select e.empno, e.ename from Employee e where company_id=1").getResultList().get(0));
		
		/* ������
		 *  - ��� ����� ����ȯ
		 *  - �ڽ� Ÿ���� ������ �θ� Ÿ���� ��ü�� ��ȯ
		 *  - List<Employee> createQuery("Employee").getResultList()
		 *  - List<String> createQuery("Employee�� ename�鸸 �˻�").getResultList()
		 *  - List<Object[]>
		 */
//		Object o = em.createQuery("select e.empno, e.ename from Employee e where company_id=1").getResultList().get(0);
//		System.out.println((Object[])o);
//		System.out.println( ((Object[])o)[0] );
//		System.out.println( ((Object[])o)[1] );
		
		List<Object[]> o = em.createQuery("select e.empno, e.ename from Employee e where company_id=1").getResultList();
		System.out.println(o.get(1)[0] + " " + o.get(1)[1]);
		

		System.out.println("*** �ڵ� �м� ***");
		List o2 = em.createQuery("select e.empno, e.ename from Employee e where company_id=1").getResultList();
		Object[] obj = (Object[])o2.get(0);
		System.out.println(obj.length);
		
		System.out.println("*** ���� counting ***");
		//�˻��� �����ʹ� �������� ������ �ϳ��� row ������ �˻� �� size()�� list�� ��� row �� ������ �� ī����
//		int count = em.createQuery("select count(*) from Employee e").getResultList().size();
		
		//int count = em.createQuery("select count(*) from Employee e").getSingleResult();
		System.out.println(em.createQuery("select count(*) from Employee e").getSingleResult());
		
		System.out.println("*** ������� ���� �Ѹ� �˻� ***");
		Employee emp = (Employee)em.createQuery("select e from Employee e where empno=2").getSingleResult();
		System.out.println(emp);


	}
	
}
