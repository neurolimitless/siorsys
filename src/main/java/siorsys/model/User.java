package siorsys.model;

import org.springframework.stereotype.Component;

@Component
public class User {

    private static String login;
    private static String password;
    private static String email;
    private static long id;

    public User() {
    }

    public static String getLogin() {
        return login;
    }

    public static void setLogin(String login) {
        User.login = login;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        User.password = password;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        User.email = email;
    }

    public static long getId() {
        return id;
    }

    public static void setId(long id) {
        User.id = id;
    }

    @Override
    public int hashCode() {
        return login.hashCode() + password.hashCode() + email.hashCode() * 2 + (int) id;
    }

}
