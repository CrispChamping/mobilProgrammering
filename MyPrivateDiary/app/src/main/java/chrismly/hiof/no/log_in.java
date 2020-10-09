package chrismly.hiof.no;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class log_in extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);

        //Add the button behavior
        final Button checkPassword = findViewById(R.id.checkPassword);
        final TextView welcomeUser = findViewById(R.id.welcomeUser);
        final EditText passwordInput = findViewById(R.id.passwordInput);

        checkPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.main_page);
            }
        });

    }
}