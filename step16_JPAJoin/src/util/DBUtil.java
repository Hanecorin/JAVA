package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
	private static EntityManagerFactory emf = null;
	
	static {
		emf = Persistence.createEntityManagerFactory("dbinfo");
	}
	
	// EntityManger
	public static EntityManager getEntityManger() {
		return emf.createEntityManager();
	}
	
	public static void close() {
		emf.close();
	}
	
}
