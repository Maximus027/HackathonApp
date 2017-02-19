package nyc.c4q.maxrosado.hackathonapp.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import nyc.c4q.maxrosado.hackathonapp.R;
import nyc.c4q.maxrosado.hackathonapp.sportchoose.sportChooser;

public class LoginMain extends AppCompatActivity {

    EditText userName, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_main);

        userName = (EditText) findViewById(R.id.username_logMain);
        password = (EditText) findViewById(R.id.password_logMain);

    }

    public void createAcct(View view) {

        Intent creatAcctIntent = new Intent(this, LoginCreate.class);
        startActivity(creatAcctIntent);
    }

    public void loginIntent(View view) {

        if (userName.length() == 0) {

            Toast.makeText(view.getContext(), "Username required", android.widget.Toast.LENGTH_SHORT).show();

        } else if (password.length() == 0) {

            Toast.makeText(view.getContext(), "Password required", android.widget.Toast.LENGTH_SHORT).show();

        } else {

            Intent sportChoose = new Intent(this, sportChooser.class);
            startActivity(sportChoose);

        }

    }
}
