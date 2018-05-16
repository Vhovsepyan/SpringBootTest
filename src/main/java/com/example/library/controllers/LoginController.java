package com.example.library.controllers;

import com.example.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index(Model model){

        return "login_register/login";
    }

    @PostMapping(params = "login")
    public String doLogin(@Param("name") String name,
                                         String password,
                                         Model model){
        model.addAttribute("name", name);
        model.addAttribute("password", password);
        return "profile";
    }

    @RequestMapping(params = "register")
    public String register(){
        return "login_register/register";
    }
}
