package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import model.domain.Dept;
import model.domain.Emp;
import util.DBUtil;

public class EmpDeptDAO {
	
	private static EmpDeptDAO instance = new EmpDeptDAO();
	
//외부에서 객체 생성 불가하게 코드로 제어 즉 필수
//생략 시엔 class 선언구에 적용된 access modifier 가 적용된 public EmpDeptDAO() {} 생성
	private EmpDeptDAO() {}
	
	public static EmpDeptDAO getInstance() {
		return instance;
	}

	//TO DO
	public List<Emp> findElementAll() throws Exception{
		EntityManager em = DBUtil.getEntityManager();
		
		List<Emp> emps = null;
		
		try {
			// sql : select * from emp
			emps = em.createQuery("select e from Emp e").getResultList();		
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
			em = null;
		}		
		return emps;
	}
	
	/* 주의사항 : 
	 * EntityManager 생성과 동시에 Persistence Context  생성
	 * EntityManager 소멸시 Persistence Context  소멸
	 * 따라서 @ManyToOne(fetch=FetchType.LAZY) 설정으로 필요에 의해 select 선별적으로 진행되어야 할 경우
	 * EntityManager & Persistence Context  소멸되기 전에 select 필수  
	 */
	
	public Emp findEmployee(long id) throws Exception{
		EntityManager em = DBUtil.getEntityManager();
		
		Emp employee = null;
		
		try {
			employee = em.find(Emp.class, id); //employee 로 부터 select
			employee.getDeptno().getDname();//부서명 dept에 존재 dept select
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
			em = null;
		}
		
		return employee;
	}
	
	// dept table의 deptno는 long 타입 따라서 값도 L or l 표현 필수 
	public Dept findDept(long deptno) throws Exception{
		EntityManager em = DBUtil.getEntityManager();
		
		Dept dept = null;
		
		try {
			 dept = em.find(Dept.class, deptno);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
			em = null;
		}
		
		return dept;
	}
	
	
	public void createEmployee(Emp employee) throws Exception{
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		try {
			em.persist(employee);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
			em = null;
		}
	}
	
	//TO DO
	public void updateEmployee(long updateId, long updateSal) throws Exception{
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		try {
			Emp e = em.find(Emp.class, updateId);
			e.setSal(updateSal);
			tx.commit();			
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
			em = null;
		}
	}
	
	public void deleteElement(long deleteId) throws Exception{
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();
		try {
			Emp employee = em.find(Emp.class, deleteId);
			em.remove(employee);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
			em = null;
		}
	}
	
}