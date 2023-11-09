package org.tmvc.classFoChecking;

import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tmvc.entity.Manager;
import org.tmvc.entity.enums.ManagerStatus;
import java.time.LocalDate;

@Slf4j
public class CheckingHibernate {
//    private static final Logger log = LoggerFactory.getLogger( CheckingHibernate.class);
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();

        SessionFactory factory = configuration.buildSessionFactory();
        log.trace(" SessionFactory  is created!, obgect ", factory);

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
            log.info("Manager entity is  builded ({})  transient state", manager.toString());

//            session.save(manager);
            session.getTransaction().commit();

        }finally {
            factory.close();
        }






    }
}
