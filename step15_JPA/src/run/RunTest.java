/* 1. table 생성
 * 	- xml문서 로딩시
 * 
 * 2. 데이터 저장
 * 	- EntityManager persist()
 * 
 * 3. 데이터 수정
 * 	- Entity의 setXxx()
 * 
 * 4. 데이터 삭제
 * 	- EntityManager remove
 * 
 * 5. 데이터 검색
 *  - EntityManager find(entityClass명.class, pk)
 * ***************
 * 
 * 1. commit() 존재 
 * 첫번째 로직
 * 	- 데이터 저장 후 바로 수정
 * 		- 데이터 저장(persist) 후 바로 수정(setXxx()) 
 * 			- jdk의 임시메모리에 데이터 저장
 * 				-> 저장된 데이터를 임시 메모리에서 수정
 * 					-> 1번. DB에 수정된 내용이 저장이 효율적 및 선택된 로직 
 *  				   2번. DB에 저장후 DB의 데이터를 실제 수정?
 * 				
 * 
 * 두번째 로직
 * 	- 데이터 저장 후 바로 삭제
 * 		- persist -> remove
 * 			- jdk의 임시메모리에 데이터 저장
 * 				-> 저장된 데이터를 임시메모리에서 삭제 	
 * 					-> DB에 저장 후 
 * 세번째 로직
 * 	- 데이터 저장 후 수정 후 삭제
 * 		- persist -> setXxx() -> remove
 * 			- jdk의 임시메모리에 데이터 저장
 * 				-> 저장된 데이터를 임시 메모리에서 수정
 * 					-> 저장된 데이터를 임시메모리에서 삭제 	
 */


package run;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import lombok.extern.slf4j.Slf4j;
import model.domain.entity.Customer;

@Slf4j
public class RunTest {

	public static void main(String[] args) {
		log.info("lombok에서 제공하는 log의 api");
		//db접속 정보 보유 객체
		/* dbinfo라는 이름으로 매핑된 xml 설정정보에 등록된 entity 클래스로 table 생성
		 * <class>model.domain.entity.Customer</class>
		 */
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbinfo");
		
		
		//db접속 및 로직 처리 객체
		EntityManager em = emf.createEntityManager();
		//crud
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		//insert
//		Customer c1 = new Customer(6, "재석");
//		em.persist(c1);  //insert가 생성 
		//select
			//update customer set name='연아' where id=1;
		
		/* 임시 메모리에서 검색
		 *  - 존재할 경우 : db에까지 select 하지 않음
		 * 	- 미존재 할 경우 : db에 실제 select
		 */
		Customer c2 = em.find(Customer.class, 2); //select
		System.out.println(c2);
		
		//update  
		// jdk내부의 jpa 실행 환경의 임시 메모리값 수정 단 데이터가 미 존재시 실제 db에서 수정
//		c2.setName("재석----------");
		System.out.println(c2); //Customer(id=3, name=재석2)
		
		//em.remove(c1);
				
		tx.commit(); //insert 실제 실행 
		
		//자원반환
		em.close();
		emf.close();		
	}

}