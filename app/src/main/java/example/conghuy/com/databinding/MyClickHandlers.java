package example.conghuy.com.databinding;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class MyClickHandlers {
    Context context;

    public MyClickHandlers(Context context) {
        this.context = context;
    }

    public void onButtonClick(View view) {
        Toast.makeText(context, "Button clicked!", Toast.LENGTH_SHORT).show();
    }

    public void onButtonClickWithParam(View view, User user) {
        Toast.makeText(context, "Button clicked! Name: " + user.name, Toast.LENGTH_SHORT).show();
    }

    public boolean onButtonLongPressed(View view) {
        Toast.makeText(context, "Button long pressed!", Toast.LENGTH_SHORT).show();
        return false;
    }
}
