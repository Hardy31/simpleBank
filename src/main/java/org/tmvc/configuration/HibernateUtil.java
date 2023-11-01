package org.tmvc.configuration;

import lombok.experimental.UtilityClass;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.tmvc.entity.Manager;

@UtilityClass
public class HibernateUtil {
    public static SessionFactory buildSessionFactory() {
        return  new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Manager.class)
                .buildSessionFactory();
    }
}

