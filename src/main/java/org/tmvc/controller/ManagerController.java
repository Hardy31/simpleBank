package org.tmvc.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.tmvc.configuration.HibernateUtil;
import org.tmvc.entity.Manager;

import java.util.List;


@Controller
public class ManagerController {



    @RequestMapping("/managers")
    public String showAllManagers(Model model){



        SessionFactory factory = HibernateUtil.buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        Query < Manager> query = session.createQuery("from Manager ");
        List<Manager> allManagers = query.getResultList();
        System.out.println("Это из ManagerController");
        for(Manager e : allManagers) {
            System.out.println(e);
        }
        session.getTransaction().commit();
        factory.close();

        model.addAttribute("allManags", allManagers);


        return "manager/all_managers";
    };

}
