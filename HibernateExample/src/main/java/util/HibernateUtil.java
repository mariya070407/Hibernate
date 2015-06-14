package util;

import logic.Users;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory = null;

    static {
        try {
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
            //creates the session factory from hibernate.cfg.xml
            //sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
