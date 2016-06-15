package siorsys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import siorsys.service.UserService;

@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String home() {
        return "home";
    }
    @RequestMapping("/login")
    public String login(@RequestParam String login,
                        @RequestParam String pass){
        if (userService.getUserByLogin(login)!=null) return "main";
        return "home";
    }
}
