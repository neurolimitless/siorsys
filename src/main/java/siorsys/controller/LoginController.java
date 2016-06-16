package siorsys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import siorsys.model.User;
import siorsys.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String login(HttpServletRequest request, HttpServletResponse response){
        String login = request.getParameter("login");
        String pass = request.getParameter("pass");
        User user = userService.getUserByLogin(login);
        if (user!=null && user.getPass().equals(pass)) return "main";
        return "home";
    }
}
