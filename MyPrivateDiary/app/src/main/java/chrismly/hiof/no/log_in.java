package chrismly.hiof.no;

import androidx.appcompat.app.AlertDialog;
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

        checkPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final EditText passwordInput = findViewById(R.id.passwordInput);
                final String password = passwordInput.getText().toString();
                if(password.equals("password")) {
                    setContentView(R.layout.main_page);
                }
                /*else{
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setTitle("Wrong password");
                    builder.setMessage("Please try again");
                    builder.setPositiveButton("ok", null);
                    AlertDialog dialog = builder.show();
                }*/
            }
        });

    }
}