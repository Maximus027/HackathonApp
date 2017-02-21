package nyc.c4q.maxrosado.hackathonapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;

import nyc.c4q.maxrosado.hackathonapp.Adapters.BasketBallAadapter2;
import nyc.c4q.maxrosado.hackathonapp.sportchoose.sportChooser;

/**
 * Created by queenabergen on 2/21/17.
 */

public class Basketball2 extends Activity {
    ArrayAdapter<String> dataAdapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    BasketBallAadapter2 basketballAdapter;
    private ImageView imageView;
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
        imageView.setImageResource(R.drawable.basketball);
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
        basketballAdapter = new BasketBallAadapter2();
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(basketballAdapter);
    }

}
