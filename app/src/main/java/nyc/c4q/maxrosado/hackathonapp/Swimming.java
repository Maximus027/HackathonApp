package nyc.c4q.maxrosado.hackathonapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import nyc.c4q.maxrosado.hackathonapp.Adapters.SwimmingAdapter;

/**
 * Created by queenabergen on 2/18/17.
 */

public class Swimming extends Activity {

    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private SwimmingAdapter swimmingAdapter;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sportslandingpage);
        imageView = (ImageView) findViewById(R.id.logoBanner);
        imageView.setImageResource(R.drawable.swimmingbanner);


        recyclerView = (RecyclerView) findViewById(R.id.sportsRecView);
        linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        swimmingAdapter = new SwimmingAdapter();
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(swimmingAdapter);
    }
}
