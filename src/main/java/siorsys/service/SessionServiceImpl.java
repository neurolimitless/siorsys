package siorsys.service;

import org.springframework.stereotype.Service;
import siorsys.model.User;

import javax.servlet.http.HttpSession;

@Service("sessionService")
public class SessionServiceImpl implements SessionService{

    @Override
    public boolean isValidSession(HttpSession session) {
       if (session!=null){
           User user =(User) session.getAttribute("user");
           if (user!=null) return true;
       }
        return false;
    }

    @Override
    public User getUserFromSession(HttpSession session) {
        if (session!=null) {
            return (User) session.getAttribute("user");
        } return null;
    }

    @Override
    public boolean isUserAdmin(User user) {
        return user != null && user.getRole().equals("admin");
    }


}
