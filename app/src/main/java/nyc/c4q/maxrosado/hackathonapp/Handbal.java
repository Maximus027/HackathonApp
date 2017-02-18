package nyc.c4q.maxrosado.hackathonapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import nyc.c4q.maxrosado.hackathonapp.Adapters.HandballAdapter;

/**
 * Created by queenabergen on 2/18/17.
 */

public class Handbal extends Activity {
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private HandballAdapter handballAdapter;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sportslandingpage);
        imageView = (ImageView)findViewById(R.id.logoBanner);
        imageView.setImageResource(R.drawable.handballbanner);


        recyclerView = (RecyclerView) findViewById(R.id.sportsRecView);
        linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        handballAdapter = new HandballAdapter();
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(handballAdapter);
    }
}
