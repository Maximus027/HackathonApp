package nyc.c4q.maxrosado.hackathonapp.tabFragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import nyc.c4q.maxrosado.hackathonapp.Basketball;
import nyc.c4q.maxrosado.hackathonapp.Football;
import nyc.c4q.maxrosado.hackathonapp.Handbal;
import nyc.c4q.maxrosado.hackathonapp.R;
import nyc.c4q.maxrosado.hackathonapp.Swimming;

public class HomeActivity extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sprtseect);


        button = (Button) findViewById(R.id.footballbtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Football.class);
                startActivity(intent);
            }
        });
        button2 = (Button) findViewById(R.id.basketbtn);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(), Basketball.class);
                startActivity(intent2);
            }
        });
        button3 = (Button) findViewById(R.id.handballbtn);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(getApplicationContext(), Handbal.class);
                startActivity(intent3);
            }
        });
        button4 = (Button) findViewById(R.id.swimmingbtn);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(getApplicationContext(), Swimming.class);
                startActivity(intent4);
            }
        });

    }

}
