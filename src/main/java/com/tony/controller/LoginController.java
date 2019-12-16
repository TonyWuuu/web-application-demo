package com.tony.controller;

import com.tony.entity.User;
import com.tony.entity.UserDto;
import com.tony.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@EnableAutoConfiguration
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping("/initialLoginPage")
    public String initialLoginPage() {
        return "login.html";
    }

    @RequestMapping("/login")
    public String login(String username, String password, Model model) {
        User user = userService.getByUsername(username);
        if (user != null && password.equals(user.getPassword())){
            return "index.html";
        } else {
            model.addAttribute("content", "Login Error : " + username);
            return "error.html";
        }

    }

    @RequestMapping("/initialRegisterPage")
    public String initialRegister(){
        System.out.println("initial register page");
        return "register.html";
    }
    @PostMapping("/register")
    public String register(UserDto user){
        System.out.println(user.username + user.password);
        userService.save(new User(user.username, user.password));
        return "index.html";
    }

    @RequestMapping("/")
    public String postLogin(){
        System.out.println("in======>index");
        return "index";
    }


}
