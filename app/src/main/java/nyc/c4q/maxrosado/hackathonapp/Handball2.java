package nyc.c4q.maxrosado.hackathonapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Handball2 extends AppCompatActivity {
    ImageView logoBanner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.handball2);
        logoBanner = (ImageView) findViewById(R.id.logoBanner);
        Picasso.with(getApplicationContext()).load(R.drawable.handballbanner).into(logoBanner);
    }
}
