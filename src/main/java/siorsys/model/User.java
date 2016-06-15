package siorsys.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {

    private String login;
    private String password;
    private String email;
    @Id
    @GeneratedValue
    @Column(name="id")
    private long id;

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return login.hashCode() + password.hashCode() + email.hashCode() * 2 + (int) id;
    }

}
