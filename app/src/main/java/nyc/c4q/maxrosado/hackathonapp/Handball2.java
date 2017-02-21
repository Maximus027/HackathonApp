package nyc.c4q.maxrosado.hackathonapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import nyc.c4q.maxrosado.hackathonapp.sportchoose.sportChooser;

public class Handball2 extends AppCompatActivity {
    ImageView logoBanner;
    ImageView homebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.handball2);
        logoBanner = (ImageView) findViewById(R.id.logoBanner);
        homebtn = (ImageView) findViewById(R.id.backBtn);
        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), sportChooser.class);
                startActivity(intent);
            }
        });
        Picasso.with(getApplicationContext()).load(R.drawable.handballbanner).into(logoBanner);
    }
}
