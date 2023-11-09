package org.tmvc.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.tmvc.configuration.HibernateUtil;
import org.tmvc.entity.Manager;
import org.tmvc.entity.enums.ManagerStatus;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
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
    }

    @RequestMapping("/addNewManager")
    public String addNewManager(Model model){

        Manager manag = Manager.builder()
                .firstName("Abram")
                .lastName("Abramovich")
                .build();

        model.addAttribute("manager", manag);

//        model.addAttribute("manager", new Manager());


//        LocalDateTime localDateTime = LocalDateTime.now();
//        model.addAttribute("ldt",localDateTime);

        System.out.println(model);
        return "manager/manager_creation_form";
    }

    @PostMapping("/addManager")
//    public String addManager(HttpServletRequest request, Model model){
    public String addManager(@ModelAttribute("manager") Manager menn, Model model){
//        Manager newManager = new Manager();
//        Object manager = request.getAttribute("manager");

        LocalDateTime localDateTime = LocalDateTime.now();
        menn.setCreatedAt(localDateTime);
        menn.setStatus(ManagerStatus.ACTIVE);


//        newManager.setFirstName(request.getParameter("first_name"));
//        newManager.setLastName(request.getParameter("last_name"));
//        newManager.setStatus(ManagerStatus.valueOf(request.getParameter("status")));
//
//        System.out.println(newManager);




        SessionFactory factory = HibernateUtil.buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();

        session.save(menn);
//
//
//
        Query < Manager> query = session.createQuery("from Manager ");
        List<Manager> allManagers = query.getResultList();
        System.out.println("Это из ManagerController");
        for(Manager e : allManagers) {
            System.out.println(e);
        }
        session.getTransaction().commit();
        factory.close();
        model.addAttribute("allManags", allManagers);





        System.out.println("Новый менеджер добавлен");
        return "manager/all_managers";
    }

}
