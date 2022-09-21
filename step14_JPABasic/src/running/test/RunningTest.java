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
//		/* 최종 질문
//		 * 1. db에 직접 insert 후에 update를 할까요?
//		 * 2. db에 insert전에 어딘가에 저장 후에 update 를 할까요?
//		 * 
//		 */
//		Member m1 = new Member("현주엽", 50);  
//		em.persist(m1); //insert into member (name , team_id) values ( '현주엽', 50);
//		
//		em.persist(new Member("현주엽2", 53));
//		/*  update Member set name=?, team_id=?  where  member_id=?
//		 * update Member set name='허재', team_id=51  where  member_id=8  */
////		m1.setTeamId(51);  //update
////		m1.setName("허재");
//		
//		tx.commit();  // insert -> update로 저장 수정된 데이터를 실제 db에 적용
	}
}