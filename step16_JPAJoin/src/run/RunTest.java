package run;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.domain.entity.Company;
import model.domain.entity.Employee;

public class RunTest {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbinfo");
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		Company c1 = new Company("A", "Seoul");
		em.persist(c1);
		em.persist(new Company("B", "Busan"));
		
		em.persist(new Employee("Kim", c1));
		em.persist(new Employee("Lee", c1));
		em.persist(new Employee("Park", c1));
		em.persist(new Employee("Choi", c1));
		em.persist(new Employee("John", c1));
		em.persist(new Employee("Smith", c1));
		em.persist(new Employee("Sam", c1));
		em.persist(new Employee("Tom", c1));
		
		em.flush();
		em.clear();
		
		// id가 1(1L)인 직원의 이름만 검색 -> select 문장 확인
		Employee e = em.find(Employee.class, 1L);
		System.out.println(e.getEname());
		
		// 직원이 소속된 회사의 지역만 검색 -> select 문장 확인
		System.out.println(e.getCompanyId().getCompanyAddr());
		
		tx.commit();		
		em.close();
		emf.close();
	}

}
