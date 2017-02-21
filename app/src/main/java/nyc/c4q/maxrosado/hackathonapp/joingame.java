package nyc.c4q.maxrosado.hackathonapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Joingame extends AppCompatActivity {
    CreateFitEventDatabaseHelper myDataBase;
    private View btnAddData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joingame);
        myDataBase = new CreateFitEventDatabaseHelper(this);
/*
        Picasso.with(getApplicationContext()).load(R.drawable.bluegradientbackground).into(imageView2);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitleMarginStart(360);
        toolbar.setTitle(R.string.toolbar);
 */

        List<String> categories = new ArrayList<String>();
        categories.add("Basketball");
        categories.add("Football");
        categories.add("Soccer");
        categories.add("Swimming");
        categories.add("Handball");
    }


}
