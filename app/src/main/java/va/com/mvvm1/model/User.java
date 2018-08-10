package va.com.mvvm1.model;

/**
 * Created by soft on 24-Jul-18.
 */

public class User {
    private String email;
    private String password;
    private String email_hint;
    private String password_hint;

    public User(String email_hint, String password_hint) {
        this.email_hint = email_hint;
        this.password_hint = password_hint;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail_hint() {
        return email_hint;
    }

    public String getPassword_hint() {
        return password_hint;
    }
}
