/* 1. table ����
 * 	- xml���� �ε���
 * 
 * 2. ������ ����
 * 	- EntityManager persist()
 * 
 * 3. ������ ����
 * 	- Entity�� setXxx()
 * 
 * 4. ������ ����
 * 	- EntityManager remove
 * 
 * 5. ������ �˻�
 *  - EntityManager find(entityClass��.class, pk)
 * ***************
 * 
 * 1. commit() ���� 
 * ù��° ����
 * 	- ������ ���� �� �ٷ� ����
 * 		- ������ ����(persist) �� �ٷ� ����(setXxx()) 
 * 			- jdk�� �ӽø޸𸮿� ������ ����
 * 				-> ����� �����͸� �ӽ� �޸𸮿��� ����
 * 					-> 1��. DB�� ������ ������ ������ ȿ���� �� ���õ� ���� 
 *  				   2��. DB�� ������ DB�� �����͸� ���� ����?
 * 				
 * 
 * �ι�° ����
 * 	- ������ ���� �� �ٷ� ����
 * 		- persist -> remove
 * 			- jdk�� �ӽø޸𸮿� ������ ����
 * 				-> ����� �����͸� �ӽø޸𸮿��� ���� 	
 * 					-> DB�� ���� �� 
 * ����° ����
 * 	- ������ ���� �� ���� �� ����
 * 		- persist -> setXxx() -> remove
 * 			- jdk�� �ӽø޸𸮿� ������ ����
 * 				-> ����� �����͸� �ӽ� �޸𸮿��� ����
 * 					-> ����� �����͸� �ӽø޸𸮿��� ���� 	
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
		log.info("lombok���� �����ϴ� log�� api");
		//db���� ���� ���� ��ü
		/* dbinfo��� �̸����� ���ε� xml ���������� ��ϵ� entity Ŭ������ table ����
		 * <class>model.domain.entity.Customer</class>
		 */
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbinfo");
		
		
		//db���� �� ���� ó�� ��ü
		EntityManager em = emf.createEntityManager();
		//crud
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		//insert
//		Customer c1 = new Customer(6, "�缮");
//		em.persist(c1);  //insert�� ���� 
		//select
			//update customer set name='����' where id=1;
		
		/* �ӽ� �޸𸮿��� �˻�
		 *  - ������ ��� : db������ select ���� ����
		 * 	- ������ �� ��� : db�� ���� select
		 */
		Customer c2 = em.find(Customer.class, 2); //select
		System.out.println(c2);
		
		//update  
		// jdk������ jpa ���� ȯ���� �ӽ� �޸𸮰� ���� �� �����Ͱ� �� ����� ���� db���� ����
//		c2.setName("�缮----------");
		System.out.println(c2); //Customer(id=3, name=�缮2)
		
		//em.remove(c1);
				
		tx.commit(); //insert ���� ���� 
		
		//�ڿ���ȯ
		em.close();
		emf.close();		
	}

}