
package run;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;

import model.domain.entity.Dept;
import util.DBUtil;

public class RunTest {

	public static void main(String[] args) {
		EntityManager em = DBUtil.getEntityManager();
		
		//@NamedQuery(name = "Dept.findDnameByDeptno", query = "select d.dname from Dept d where d.deptno = :deptno")
//		Dept d1 = (Dept)em.createNamedQuery("Dept.findDnameByDeptno").setParameter("deptno", 10L).getSingleResult();
		String d1 = (String)em.createNamedQuery("Dept.findDnameByDeptno").setParameter("deptno", 10L).getSingleResult();
	
		System.out.println(d1);
		
		// @NamedQuery(name = "Dept.findDept", query = "select d form Dept d")
		List<Dept> l1 = em.createNamedQuery("Dept.findDept").getResultList();
		
		l1.forEach(System.out::println);				
		
		em.close();
		em = null;
	}

}