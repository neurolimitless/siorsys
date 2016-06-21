package siorsys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import siorsys.model.Food;
import siorsys.model.User;
import siorsys.service.FoodService;
import siorsys.service.SessionService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@SessionAttributes({"cart"})
public class MenuController {

    @Autowired
    FoodService foodService;
    @Autowired
    SessionService sessionService;

    @RequestMapping("/menu")
    public String menu(
            HttpServletRequest request,
            HttpServletResponse response,
            ModelMap map) throws Exception {
        HttpSession currentSession = request.getSession(false);
        if (sessionService.isValidSession(currentSession)) {
            if (!map.containsAttribute("cart")) map.addAttribute("cart", new ArrayList<Food>());
            else map.addAttribute("total", foodService.calculateTotal((List<Food>) currentSession.getAttribute("cart")));
            User currentUser = sessionService.getUserFromSession(currentSession);
            map.addAttribute("menu", foodService.getAllFood());
            map.addAttribute("username", currentUser.getName());

            if (sessionService.isUserAdmin(currentUser)) map.addAttribute("admin", true);
            return "menu";
        }
        response.sendRedirect("/");
        return "home";
    }

    @RequestMapping("/admin")
    public String admin(HttpServletResponse response,
                        HttpServletRequest request,
                        ModelMap map) throws Exception {
        if (sessionService.isUserAdmin(sessionService.getUserFromSession(request.getSession()))) {
            return "admin";
        }
        response.sendRedirect("/");
        return "home";
    }

    @RequestMapping(value = "/addProduct-{id}", method = RequestMethod.POST)
    public String addProduct(@PathVariable int id, HttpServletResponse response,
                             @ModelAttribute("cart") ArrayList<Food> cart,
                             ModelMap map) throws Exception {
        Food food = foodService.getById(id);
        cart.add(food);
        return "redirect:menu";
    }

    @RequestMapping(value = "/clear-cart")
    public String clearCart(ModelMap map) {
        map.addAttribute("cart", new ArrayList<Food>());
        return "redirect:menu";
    }
}
