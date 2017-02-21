package nyc.c4q.maxrosado.hackathonapp;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CreateGameActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    CreateFitEventDatabaseHelper myDataBase;
    Spinner sportsSelect;
    Spinner skillLevel;
    Spinner yesNoSpinner;
    Button submitBtn;
    EditText nameofGamer;
    TextView textView;
    Button continueBtn;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creategame);
        textView = (TextView) findViewById(R.id.description);
        textView.setText("Create Your Game, Have People Join, Get ACTIVE !");
        nameofGamer = (EditText) findViewById(R.id.gameCreatorName);
        skillLevel = (Spinner) findViewById(R.id.skillLevel);
        continueBtn = (Button) findViewById(R.id.continbtn);
        continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CreateGameActivity2.class);
                startActivity(intent);
            }
        });

        List<String> sportsDropDrown = new ArrayList<String>();
        sportsDropDrown.add(0, "Basketball");
        sportsDropDrown.add(1, "Football");
        sportsDropDrown.add(2, "Soccer");
        sportsDropDrown.add(3, "Swimming");
        sportsDropDrown.add(4, "Handball");

        List<String> skillDropDown = new ArrayList<String>();
        skillDropDown.add(0, "Beginner");
        skillDropDown.add(1, "Intermediate");
        skillDropDown.add(2, "Expert");

        List<String> yesNOdrop = new ArrayList<String>();
        yesNOdrop.add(0, "No");
        yesNOdrop.add(1, "Yes");


        yesNoSpinner = (Spinner) findViewById(R.id.equipmentReponse);
        ArrayAdapter<String> yesNoAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, yesNOdrop);
        yesNoAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        yesNoSpinner.setAdapter(yesNoAdapter);


        ArrayAdapter<String> skillAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, skillDropDown);
        skillAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        skillLevel.setAdapter(skillAdapter);

        sportsSelect = (Spinner) findViewById(R.id.sportsSelect);
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, sportsDropDrown);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sportsSelect.setAdapter(dataAdapter);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        parent.getItemAtPosition(position);
        if (position == 1) {
            Toast.makeText(getApplicationContext(), "Show Next Button", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), "Show Nothing", Toast.LENGTH_LONG).show();
        }
    }
}
