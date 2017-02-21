package nyc.c4q.maxrosado.hackathonapp.sportchoose;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import nyc.c4q.maxrosado.hackathonapp.Basketball;
import nyc.c4q.maxrosado.hackathonapp.Football;
import nyc.c4q.maxrosado.hackathonapp.Handbal;
import nyc.c4q.maxrosado.hackathonapp.R;
import nyc.c4q.maxrosado.hackathonapp.tabFragments.HomeActivity;
import nyc.c4q.maxrosado.hackathonapp.tabFragments.bike.BikeRentalActivity;
import nyc.c4q.maxrosado.hackathonapp.tabFragments.parks.ParksActivity;


public class SportChooser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                if (position < 4) {
                    Intent intent = new Intent(SportChooser.this, HomeActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(SportChooser.this, "" + position,
                            Toast.LENGTH_SHORT).show();
                }
//                 Class goToactivity = HomeActivity.class;
//                 Intent activityChosen;

//                 switch (position){
//                     case 0://Parks
//                         goToactivity = ParksActivity.class;
//                         break;
//                     case 1://Basketball
//                         goToactivity = HomeActivity.class;
//                         break;
//                     case 2://Handball
//                         goToactivity = HandballActivity.class;
//                         break;
//                     case 3://Soccer
//                         goToactivity = HomeActivity.class;
//                         break;
//                     case 4://Football
//                         goToactivity = HomeActivity.class;
//                         break;
//                     case 5://Bikes
//                         goToactivity = BikeRentalActivity.class;
//                         break;
//                     case 6:
//                         break;


                switch (position) {
                    case 0:
                        Intent goToParks = new Intent(getApplicationContext(), ParksActivity.class);
                        startActivity(goToParks);
                        break;
                    case 1:
                        Intent goToBasketBall = new Intent(getApplicationContext(), Basketball.class);
                        startActivity(goToBasketBall);
                        break;
                    case 2:
                        Intent goToHandBall = new Intent(getApplicationContext(), Handbal.class);
                        startActivity(goToHandBall);
                        break;
                    case 3:
                        Intent goToSoccer = new Intent(getApplicationContext(), Soccer.class);
                        startActivity(goToSoccer);
                        break;
                    case 4:
                        Intent goToFootBall = new Intent(getApplicationContext(), Football.class);
                        startActivity(goToFootBall);
                        break;
                    case 5:
                        Intent goToBikes = new Intent(getApplicationContext(), BikeRentalActivity.class);
                        startActivity(goToBikes);
                        break;

                }

//                 activityChosen = new Intent(sportChooser.this, goToactivity);
//                     startActivity(activityChosen);

            }
        });

    }

}
