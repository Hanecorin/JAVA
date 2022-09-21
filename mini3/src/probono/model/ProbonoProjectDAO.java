package probono.model;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.junit.Test;

import probono.model.entity.ActivistDTO;
import probono.model.entity.ProbonoDTO;
import probono.model.entity.ProbonoProjectDTO;
import probono.model.entity.RecipientDTO;
import probono.model.util.DBUtil;

public class ProbonoProjectDAO {
	
	private static ProbonoProjectDAO instance = new ProbonoProjectDAO();
	
	public ProbonoProjectDAO() {}
	
	public static ProbonoProjectDAO  getInstance() {
		return instance;
	}
	
		// ���κ��� ������Ʈ ����
	public static void addProbonoProject(ProbonoProjectDTO probonoProject) throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			System.out.println("-------------");
			System.out.println(probonoProject);
			System.out.println("-------------");
			
			em.persist(probonoProject);
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
	// ���κ��� ������Ʈ ID�� ��ɱ���� ����
	public static void updateProbonoProjectActivist(int projectId, ActivistDTO activistId) throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		try {
			ProbonoProjectDTO project = em.find(ProbonoProjectDTO.class, projectId);
			project.setActivistId(activistId);
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
	// ���κ��� ������Ʈ id�� ������ ���� ����
	public static void updateProbonoProjectReceive(int probonoProjectId, RecipientDTO receiveId) throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		try {
			ProbonoProjectDTO project = em.find(ProbonoProjectDTO.class, probonoProjectId);
			project.setReceiveId(receiveId);
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
	// ���κ��� ������Ʈ id�� ���κ��� ������Ʈ ����
	public static void deleteProbonoProject(int probonoProjectId) throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();
		try {
			ProbonoProjectDTO project = em.find(ProbonoProjectDTO.class, probonoProjectId);
			em.remove(project);
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

	// ���κ��� ������Ʈ id�� �ش� ���κ���������Ʈ �˻�
	public static ProbonoProjectDTO getProbonoProject(int probonoProjectId) throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		
		ProbonoProjectDTO project = null;
		
		try {
			project = em.find(ProbonoProjectDTO.class, probonoProjectId);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
			em = null;
		}
		
		return project;
	}

	// ��� ���κ��� ������Ʈ �˻�
	public static ArrayList<ProbonoProjectDTO> getAllProbonoProjects() throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		
		ArrayList<ProbonoProjectDTO> list = null;
		
		try {
			list = (ArrayList<ProbonoProjectDTO>) em.createQuery("select p from ProbonoProjectDTO p").getResultList();		
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
		ProbonoDAO pdao = ProbonoDAO.getInstance();
		ActivistDAO adao = ActivistDAO.getInstance();
		RecipientDAO rdao = RecipientDAO.getInstance();
		
		try {			
//			ProbonoDTO p = pdao.getProbono("c");
//			ActivistDTO a = adao.getActivist("b");
//			RecipientDTO r = rdao.getRecipient("a");
//			
//			ProbonoProjectDTO pp = ProbonoProjectDTO.builder().name("T").probonoId(p).activistId(a).receiveId(r).content("Test").build();
//			addProbonoProject(pp);
			
			System.out.println(getAllProbonoProjects());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}