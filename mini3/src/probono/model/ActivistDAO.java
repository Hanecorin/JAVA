package probono.model;


import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.junit.Test;

import probono.model.entity.ActivistDTO;
import probono.model.util.DBUtil;

public class ActivistDAO {
	
	private static ActivistDAO instance = new ActivistDAO();
	
	public ActivistDAO() {}
	
	public static ActivistDAO  getInstance() {
		return instance;
	}
	
	// 기부자 등록(insert)
	public static void addActivist(ActivistDTO activist) throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		try {
			em.persist(activist);
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

	// 기부자 id로 주요 기부 내용 수정하기
	public static void updateActivist(String activistId, String major)throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		try {
			ActivistDTO activist = em.find(ActivistDTO.class, activistId);
			activist.setMajor(major);
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

	// sql - delete from activist where activist_id=?
	public static void deleteActivist(String activistId) throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();
		try {
			ActivistDTO activist = em.find(ActivistDTO.class, activistId);
			em.remove(activist);
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

	// id로 해당 기부자의 모든 정보 반환
	public static ActivistDTO getActivist(String activistId) throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		
		ActivistDTO activist = null;
		
		try {
			activist = em.find(ActivistDTO.class, activistId);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
			em = null;
		}
		
		return activist;
	}

	// sql - select * from activist
	public static ArrayList<ActivistDTO> getAllActivists() throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		
		ArrayList<ActivistDTO> list = null;
		
		try {
			list = (ArrayList<ActivistDTO>) em.createQuery("select a from Activist a").getResultList();		
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
			em = null;
		}		
		return list;
	}
	
	@Test
	public void m1() {
		try {
//			addActivist(new ActivistDTO("b", "lee", "gp5", "Test"));
//			updateActivist("b", "www");
//			System.out.println(getActivist("b"));
//			deleteActivist("b");
			System.out.println(getAllActivists());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}