package nyc.c4q.maxrosado.hackathonapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.maxrosado.hackathonapp.Adapters.BasketballAdapter;

/**
 * Created by queenabergen on 2/18/17.
 */

public class Basketball extends Activity {
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    BasketballAdapter basketballAdapter;
    private ImageView imageView;

    List<String> dateofGames = new ArrayList<>();
    DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();
    DatabaseReference mCondition = mRootRef.child("Date");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sportslandingpage);
        imageView = (ImageView) findViewById(R.id.logoBanner);
        imageView.setImageResource(R.drawable.basketball);
        recyclerView = (RecyclerView) findViewById(R.id.sportsRecView);
        linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        basketballAdapter = new BasketballAdapter();
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(basketballAdapter);
    }

    @Override
    protected void onStart() {
        super.onStart();

        mCondition.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String dateValue = dataSnapshot.getValue(String.class);
                dateofGames.add(0, dateValue);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
