package running.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.Test;

import model.domain.entity.Member;

public class RunningTest {
	
	@Test
	public void step01() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbinfo");
		
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction tx = em.getTransaction();
//		tx.begin();			
//		
//		
//		/* ���� ����
//		 * 1. db�� ���� insert �Ŀ� update�� �ұ��?
//		 * 2. db�� insert���� ��򰡿� ���� �Ŀ� update �� �ұ��?
//		 * 
//		 */
//		Member m1 = new Member("���ֿ�", 50);  
//		em.persist(m1); //insert into member (name , team_id) values ( '���ֿ�', 50);
//		
//		em.persist(new Member("���ֿ�2", 53));
//		/*  update Member set name=?, team_id=?  where  member_id=?
//		 * update Member set name='����', team_id=51  where  member_id=8  */
////		m1.setTeamId(51);  //update
////		m1.setName("����");
//		
//		tx.commit();  // insert -> update�� ���� ������ �����͸� ���� db�� ����
	}
}