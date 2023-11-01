package org.tmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyWebController {
    public static Integer count = 1;
    @RequestMapping("/")
    public String StartPage(){
        return  "index";
    }

    @RequestMapping("/regis")
    public String registration(){
        return "registration";
    }
    @RequestMapping("/clientData")
    public String clientData(HttpServletRequest request, Model model){
        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        String pass = request.getParameter("pass");
        model.addAttribute("first_name", first_name);
        model.addAttribute("last_name", last_name);
        model.addAttribute("address", address);
        model.addAttribute("phone", phone);
        model.addAttribute("check_number", count++);
        model.addAttribute("pass", pass);

        return "client/clientData";
    }



    @RequestMapping("/employeeData")
    public String employeeData(HttpServletRequest request, Model model){
        String manager_id = request.getParameter("manager_id");
        String password = request.getParameter("passWorker");
//        ПО этим данным получаем данные о работнике и возвращвем ему его рабочий стол/

        String first_name = "Ivan";
        String last_name = "Sidorof";
        model.addAttribute("em_first_name", first_name);
        model.addAttribute("em_last_name", last_name);
        return "employeeData";
    }

    @RequestMapping("/login")
    public String identification(){
        return "login";
    }

    @RequestMapping("/data")
    public String chekData(HttpServletRequest request,Model model){
        String numberCheck = request.getParameter("identifier");
        String password = request.getParameter("password");
//        ПО этим данным получаем данные о счетах клиента и звращвем ему его данные по счетам/

        String first_name = "Ivan";
        String last_name = "Sidorof";
        String sheck= "g55h";
        Integer summs = 55000;
        model.addAttribute("cl_first_name", first_name);
        model.addAttribute("cl_last_name", last_name);
        model.addAttribute("sheck", sheck);
        model.addAttribute("summs", summs);
        return "client/clientCeck";
    }

    @RequestMapping("/worker")
    public String working(){
        return "worker";
    }

}
