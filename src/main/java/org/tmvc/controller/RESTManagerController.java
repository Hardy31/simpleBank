package org.tmvc.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tmvc.configuration.HibernateUtil;
import org.tmvc.entity.Manager;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RESTManagerController {
    @GetMapping("/managers")
    public List<Manager> showAllManagers(){

        SessionFactory factory = HibernateUtil.buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        Query < Manager> query = session.createQuery("from Manager ");
        List<Manager> allManagers = query.getResultList();
        System.out.println("Это из RESTManagerController");
        for(Manager e : allManagers) {
            System.out.println(e);
        }
        session.getTransaction().commit();
        factory.close();

        return allManagers;
    };


}
