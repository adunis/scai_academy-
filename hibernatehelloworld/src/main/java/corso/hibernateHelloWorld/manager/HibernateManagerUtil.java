package corso.hibernateHelloWorld.manager;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateManagerUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory() {
		Configuration cfg = new Configuration();
		StandardServiceRegistryBuilder srvRegistry = null;
		try {
			cfg.configure();
			srvRegistry = new StandardServiceRegistryBuilder()
					.applySettings(cfg.getProperties());
		} catch (Throwable ex) {
			// TODO: handle exception
			ex.printStackTrace();
		}
		return cfg.buildSessionFactory(srvRegistry.build());
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
