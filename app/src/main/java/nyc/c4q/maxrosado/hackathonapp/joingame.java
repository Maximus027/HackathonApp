package nyc.c4q.maxrosado.hackathonapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Joingame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joingame);

        List<String> categories = new ArrayList<String>();
        categories.add("Basketball");
        categories.add("Football");
        categories.add("Soccer");
        categories.add("Swimming");
        categories.add("Handball");
    }
}
