package run;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.domain.entity.Member;
import model.domain.entity.Team;

public class RunTest2TeamMember {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbinfo");
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		// step01 - database���� ��� entity Ŭ���� ������ ���� ���� �߻�
		/*
		 * �Ѹ��� member�� �ݵ�� �����ϴ� team�� �ҼӵǾ�� �ϳ�
		 * Member�� private long teamId; �������� Team�� �ƴ� ��� long���� �� ���밡���� Ÿ������ ������ ���� ��
		 */
//		Team t1 = new Team("Team1");
//		em.persist(t1);
//		
//		Member m1 = new Member("Kim", t1);
//		em.persist(m1);
		
		
		// step02
//		Team t1 = new Team("�豸��");
//		em.persist(t1);
//		
//		Member m1 = new Member("Kim", t1);
//		em.persist(m1);
//		
//		em.persist(new Member("Lee", t1));
//		
//		// Persistence context ������ �޸� ����
//		em.flush();
//		em.clear();
		
		// step03 ���� �ε� - �����Ͱ� �ʿ�� ������ �����ϰڴٴ� ���� �ν�
		// member table�� select
		Member m = em.find(Member.class, 1L); 
//		System.out.println(m); // Member�� Team table�� ��� ������ toString���� ��ȯ
		System.out.println(m.getName()); // Kim
		
		System.out.println(m.getTeamId().getTeamName());
		
		tx.commit();
		em.close();
		emf.close();

	}

}
