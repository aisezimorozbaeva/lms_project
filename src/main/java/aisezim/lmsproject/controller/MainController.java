package aisezim.lmsproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main-page")
public class MainController {
    public String loginPage(){
        return "main_page";
    }
}
