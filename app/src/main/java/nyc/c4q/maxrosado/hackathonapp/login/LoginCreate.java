package nyc.c4q.maxrosado.hackathonapp.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import nyc.c4q.maxrosado.hackathonapp.R;
import nyc.c4q.maxrosado.hackathonapp.sportchoose.sportChooser;

public class LoginCreate extends AppCompatActivity {

    EditText emailAddress, nameField, zipcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_create);

        emailAddress = (EditText) findViewById(R.id.email_logCreate);
        nameField = (EditText) findViewById(R.id.name_logCreate);
        zipcode = (EditText) findViewById(R.id.zip_logCreate);

        Toast.makeText(getApplicationContext(), "This screen is only for demo purposes", android.widget.Toast.LENGTH_SHORT).show();

    }

    public void submitBtn(View view) {

        if (emailAddress.length() == 0) {

            Toast.makeText(view.getContext(), "Email address required", android.widget.Toast.LENGTH_SHORT).show();

        } else if (nameField.length() == 0) {

            Toast.makeText(view.getContext(), "Name required", android.widget.Toast.LENGTH_SHORT).show();

        } else if (zipcode.length() == 0) {

            Toast.makeText(view.getContext(), "Zipcode required", android.widget.Toast.LENGTH_SHORT).show();

        } else {

            Intent sportChoose = new Intent(this, sportChooser.class);
            startActivity(sportChoose);

        }

    }
}
