package va.com.mvvm1;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import va.com.mvvm1.commands.UserLogin;
import va.com.mvvm1.databinding.ActivityMainBinding;
import va.com.mvvm1.model.User;
import va.com.mvvm1.viewmodel.UserModel;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = DataBindingUtil.setContentView(this, R.layout.activity_main);

        UserModel userModel = new UserModel(new User(getString(R.string.email), getString(R.string.password)));
        b.setLogin(userModel);

        b.setUserLoginEvent(new UserLogin() {
            @Override
            public void onClickLogin() {
                Toast.makeText(MainActivity.this, "Logging in with email "+b.getLogin().getEmail(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
