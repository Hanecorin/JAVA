/*
 * CREATE TABLE recipient (
       recipient_id         VARCHAR2(20) PRIMARY KEY,
       name                 VARCHAR2(20) NULL,
       password             VARCHAR2(20) NULL,
       receiveHopeContent   VARCHAR2(50) NULL
);
 */
package probono.model;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.junit.Test;

import probono.model.entity.RecipientDTO;
import probono.model.util.DBUtil;

//수혜자 table과 연관된 DAO 클래스
public class RecipientDAO {
	
	private static RecipientDAO instance = new RecipientDAO();
	
	public RecipientDAO() {}
	
	public static RecipientDAO  getInstance() {
		return instance;
	}

	// 수혜자 등록
	public static void addRecipient(RecipientDTO recipient) throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		try {
			em.persist(recipient);
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

	// 수정 로직
	// 프로젝트 명으로 내용 수정하기
	public static void updateRecipient(String recipientId, String receiveHopeContent) throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		try {
			RecipientDTO recipient = em.find(RecipientDTO.class, recipientId);
			recipient.setContent(receiveHopeContent);
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

	// 삭제 로직
	public static void deleteRecipient(String recipientId) throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();
		try {
			RecipientDTO recipient = em.find(RecipientDTO.class, recipientId);
			em.remove(recipient);
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
	
	// id로 해당 수혜자 정보 반환
	public static RecipientDTO getRecipient(String recipientId) throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		
		RecipientDTO recipient = null;
		
		try {
			recipient = em.find(RecipientDTO.class, recipientId);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
			em = null;
		}
		
		return recipient;
	}
	
	// 모든 수혜자 검색
	public static ArrayList<RecipientDTO> getAllRecipients() throws Exception {
		EntityManager em = DBUtil.getEntityManager();
		
		ArrayList<RecipientDTO> list = null;
		
		try {
			list = (ArrayList<RecipientDTO>) em.createQuery("select r from Recipient r").getResultList();		
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
//			addRecipient(new RecipientDTO("a", "kim", "rp4", "Test"));
//			updateRecipient("a", "zzz");
//			System.out.println(getRecipient("a"));
//			deleteRecipient("a");
			System.out.println(getAllRecipients());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}