package nyc.c4q.maxrosado.hackathonapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import nyc.c4q.maxrosado.hackathonapp.Adapters.BasketballAdapter;

/**
 * Created by queenabergen on 2/18/17.
 */

public class Basketball extends Activity {
    ArrayAdapter<String> dataAdapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    BasketballAdapter basketballAdapter;
    private ImageView imageView;
    private FloatingActionButton floatingActionButton;
    


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sportslandingpage);

        imageView = (ImageView) findViewById(R.id.logoBanner);
        imageView.setImageResource(R.drawable.basketball);
        floatingActionButton = (FloatingActionButton) findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CreateGameActivity.class);
                startActivity(intent);
            }
        });


        recyclerView = (RecyclerView) findViewById(R.id.sportsRecView);
        linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        basketballAdapter = new BasketballAdapter();
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(basketballAdapter);
    }

}
