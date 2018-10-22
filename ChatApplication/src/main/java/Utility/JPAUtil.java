package Utility;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static EntityManagerFactory emf;
	static {
		 Map<String, String> properties = new HashMap<String, String>();
		  properties.put("javax.persistence.jdbc.user", "root");
		  properties.put("javax.persistence.jdbc.password", "");
			emf = Persistence.createEntityManagerFactory("ChatApplication",properties);
	}
	
	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
	
	
	
	public static void close() {
		emf.close();
	}
}
