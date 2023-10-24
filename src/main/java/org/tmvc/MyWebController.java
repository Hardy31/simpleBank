package org.tmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyWebController {
    @RequestMapping("/")
    public String StartPage(){
        return  "index";
    }

    @RequestMapping("/regis")
    public String registration(){
        return "registration";
    }

    @RequestMapping("login")
    public String identification(){
        return "login";
    }

    @RequestMapping("/worker")
    public String working(){
        return "worker";
    }

}
