package org.tmvc.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.tmvc.entity.enums.ManagerStatus;
import java.time.LocalDate;

public class CheckingHibernate {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();

        SessionFactory factory = configuration.buildSessionFactory();
        System.out.println(" SessionFactory is created!");

        try{
            Session session = factory.openSession();
            session.beginTransaction();

            Manager manager = Manager.builder()
                    .firstName("Iakir")
                    .lastName("Voiser")
                    .status(ManagerStatus.NOT_ACTIVE)
                    .createdAt(LocalDate.of(1998, 7, 7).atStartOfDay())
                    .updatedAt(LocalDate.of(2023, 10, 27).atStartOfDay())
                    .build();
            System.out.println(manager);

            session.save(manager);
            session.getTransaction().commit();

        }finally {
            factory.close();
        }






    }
}
