package example.conghuy.com.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import example.conghuy.com.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        user = new User();
        user.setName("Ravi Tamada");
        user.setEmail("ravi@androidhive.info");
        user.setProfileImage("https://api.androidhive.info/images/nature/david1.jpg");

        binding.setUser(user);

        MyClickHandlers handlers = new MyClickHandlers(this);
        binding.setHandlers(handlers);

//       new Handler().postDelayed(new Runnable() {
//           @Override
//           public void run() {
//               user.setName("Huy");
//               user.setEmail("Gmail");
//           }
//       },2000);
    }


}
