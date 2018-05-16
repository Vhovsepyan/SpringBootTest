package com.example.library.controllers;

import com.example.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    @Autowired
    private UserService userService;

    @PostMapping(params = "login_register/login")
    public String doRegistr(String name, String login, String password, Model model){
        model.addAttribute("info", "Success Register :)");
        return "login_register/login";
    }


}
