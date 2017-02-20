package nyc.c4q.maxrosado.hackathonapp;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TimePicker;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class CreateGameActivity extends AppCompatActivity {
    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
    DatabaseReference mConditionRef = databaseReference.child("Date");

    Spinner sportsSelect;
    EditText nameofGamer;
    DatePicker dateSelect;
    TimePicker timeSelect;

    @Override
    protected void onStart() {
        super.onStart();
        mConditionRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creategame);

        nameofGamer = (EditText) findViewById(R.id.gameCreatorName);
        String name = nameofGamer.getText().toString();
        dateSelect = (DatePicker) findViewById(R.id.dateSelector);
        int month = dateSelect.getMonth();
        int day = dateSelect.getDayOfMonth();
        int year = dateSelect.getYear();
        timeSelect = (TimePicker) findViewById(R.id.timePicker);

        List<String> categories = new ArrayList<String>();
        categories.add("Basketball");
        categories.add("Football");
        categories.add("Soccer");
        categories.add("Swimming");
        categories.add("Handball");
        sportsSelect = (Spinner) findViewById(R.id.sportsSelect);
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sportsSelect.setAdapter(dataAdapter);


    }
}
