package siorsys.service;

import siorsys.model.User;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

public interface SessionService {
    boolean isValidSession(HttpSession session);
    User getUserFromSession(HttpSession session);
    boolean isUserAdmin(User user);
}
