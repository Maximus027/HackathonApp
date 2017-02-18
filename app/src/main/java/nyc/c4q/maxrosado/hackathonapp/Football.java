package nyc.c4q.maxrosado.hackathonapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import nyc.c4q.maxrosado.hackathonapp.Adapters.FootballAdapter;

/**
 * Created by queenabergen on 2/18/17.
 */

public class Football extends Activity {
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private FootballAdapter footballadapter;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sportslandingpage);
        imageView = (ImageView)findViewById(R.id.logoBanner);
        imageView.setImageResource(R.drawable.footballbanner);


        recyclerView = (RecyclerView) findViewById(R.id.sportsRecView);
        linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        footballadapter = new FootballAdapter();
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(footballadapter);
    }
}
