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

        //Var
        final Button loginBtn = findViewById(R.id.loginBtn);
        final Button createBtn = findViewById(R.id.createBtn);
        final TextView welcomeUser = findViewById(R.id.welcomeUser);
        final Button checkPassword = findViewById(R.id.checkPassword);
        final Button createUser = findViewById(R.id.createUser);
        final EditText passwordInput = findViewById(R.id.passwordInput);
        final EditText usernameInput = findViewById(R.id.usernameInput);
        final Button gobackBtn = findViewById(R.id.gobackBtn);

        //Go back to start
        gobackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginBtn.setVisibility(View.VISIBLE);
                createBtn.setVisibility(View.VISIBLE);
                welcomeUser.setVisibility(View.GONE);
                checkPassword.setVisibility(View.GONE);
                createUser.setVisibility(View.GONE);
                usernameInput.setVisibility(View.GONE);
                passwordInput.setVisibility(View.GONE);
                gobackBtn.setVisibility(View.GONE);
            }
        });

        //Login
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginBtn.setVisibility(View.GONE);
                createBtn.setVisibility(View.GONE);
                welcomeUser.setText("Welcome back");
                welcomeUser.setVisibility(View.VISIBLE);
                checkPassword.setVisibility(View.VISIBLE);
                usernameInput.setVisibility(View.VISIBLE);
                passwordInput.setVisibility(View.VISIBLE);
                gobackBtn.setVisibility(View.VISIBLE);

            }
        });

        //Check password
        checkPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String password = passwordInput.getText().toString();
                if(password.equals("password")) {
                    setContentView(R.layout.main_page);
                }
            }
        });

        //Create new user
        createBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginBtn.setVisibility(View.GONE);
                createBtn.setVisibility(View.GONE);
                welcomeUser.setText("Welcome");
                welcomeUser.setVisibility(View.VISIBLE);
                createUser.setVisibility(View.VISIBLE);
                usernameInput.setVisibility(View.VISIBLE);
                passwordInput.setVisibility(View.VISIBLE);
                gobackBtn.setVisibility(View.VISIBLE);

                //create a way to save users :)


            }
        });

    }
}