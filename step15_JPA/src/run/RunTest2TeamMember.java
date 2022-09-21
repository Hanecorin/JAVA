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
		
		// step01 - database설계 대비 entity 클래스 개발의 논리적 오류 발생
		/*
		 * 한명의 member는 반드시 존재하는 team에 소속되어야 하나
		 * Member의 private long teamId; 변수값을 Team이 아닌 모든 long값을 다 수용가능한 타입으로 설정된 논리적 옾
		 */
//		Team t1 = new Team("Team1");
//		em.persist(t1);
//		
//		Member m1 = new Member("Kim", t1);
//		em.persist(m1);
		
		
		// step02
//		Team t1 = new Team("배구팀");
//		em.persist(t1);
//		
//		Member m1 = new Member("Kim", t1);
//		em.persist(m1);
//		
//		em.persist(new Member("Lee", t1));
//		
//		// Persistence context 영역의 메모리 삭제
//		em.flush();
//		em.clear();
		
		// step03 지연 로딩 - 데이터가 필요산 시점에 실행하겠다는 설정 인식
		// member table만 select
		Member m = em.find(Member.class, 1L); 
//		System.out.println(m); // Member와 Team table의 모든 정보를 toString으로 반환
		System.out.println(m.getName()); // Kim
		
		System.out.println(m.getTeamId().getTeamName());
		
		tx.commit();
		em.close();
		emf.close();

	}

}
