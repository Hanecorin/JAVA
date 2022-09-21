package probono.model;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.junit.Test;

import probono.model.entity.ProbonoDTO;
import probono.model.util.DBUtil;

public class ProbonoDAO {
	
	private static ProbonoDAO instance = new ProbonoDAO();
	
	public ProbonoDAO() {}
	
	public static ProbonoDAO  getInstance() {
		return instance;
	}

	// ����
	public static void addProbono(ProbonoDTO probono) throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		try {
			em.persist(probono);
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

	// ���κ��� id�� ���κ��� ���� �����ϱ�
	public static void updateProbono(String probonoId, String probonoPurpose) throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		try {
			ProbonoDTO probono = em.find(ProbonoDTO.class, probonoId);
			probono.setPurpose(probonoPurpose);
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

	// ����
	public static void deleteProbono(String probonoId) throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();
		try {
			ProbonoDTO probono = em.find(ProbonoDTO.class, probonoId);
			em.remove(probono);
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

	// �������� ���̵�� �ش� ���κ��� ��� ���� �˻�
	public static ProbonoDTO getProbono(String probonoId) throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		
		ProbonoDTO probono = null;
		
		try {
			probono = em.find(ProbonoDTO.class, probonoId);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
			em = null;
		}
		
		return probono;
	}

	// ��� ���κ��� �˻�
	// sql - select * from activist
	public static ArrayList<ProbonoDTO> getAllProbonos() throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		
		ArrayList<ProbonoDTO> list = null;
		
		try {
			list = (ArrayList<ProbonoDTO>) em.createQuery("select p from Probono p").getResultList();		
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
//			addProbono(new ProbonoDTO("c", "projectc", "Test"));
//			updateProbono("c", "yyy");
//			System.out.println(getProbono("c"));
//			deleteProbono("c");
			System.out.println(getAllProbonos());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}