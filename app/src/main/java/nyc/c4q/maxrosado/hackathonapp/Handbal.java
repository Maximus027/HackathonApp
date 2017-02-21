package nyc.c4q.maxrosado.hackathonapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import nyc.c4q.maxrosado.hackathonapp.Adapters.HandballAdapter;
import nyc.c4q.maxrosado.hackathonapp.sportchoose.sportChooser;

/**
 * Created by queenabergen on 2/18/17.
 */

public class Handbal extends Activity {
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private HandballAdapter handballAdapter;
    private ImageView imageView;
    private FloatingActionButton floatingActionButton;
    private Button createGame;
    private ImageView backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sportslandingpage);
        backBtn = (ImageView) findViewById(R.id.backBtn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), sportChooser.class);
                startActivity(intent);
            }
        });
        imageView = (ImageView) findViewById(R.id.logoBanner);
        imageView.setImageResource(R.drawable.handballbanner);
        createGame = (Button) findViewById(R.id.createGamebtn);
        createGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CreateGameActivity.class);
                startActivity(intent);
            }
        });


        recyclerView = (RecyclerView) findViewById(R.id.sportsRecView);
        linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        handballAdapter = new HandballAdapter();
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(handballAdapter);
    }
}
