package va.com.mvvm1.viewmodel;

import android.databinding.BaseObservable;

import va.com.mvvm1.R;
import va.com.mvvm1.model.User;

/**
 * Created by soft on 24-Jul-18.
 */

public class UserModel extends BaseObservable {
    private String email;
    private String password;
    private String email_hint;
    private String password_hint;

    public UserModel(User user) {
        this.email_hint = user.getEmail_hint();
        this.password_hint = user.getPassword_hint();
    }

    public String getEmail() {
            return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(R.id.email);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(R.id.password);

    }

    public String getEmail_hint() {
        return email_hint;
    }

    public void setEmail_hint(String email_hint) {
        this.email_hint = email_hint;
    }

    public String getPassword_hint() {
        return password_hint;
    }

    public void setPassword_hint(String password_hint) {
        this.password_hint = password_hint;
    }

}
