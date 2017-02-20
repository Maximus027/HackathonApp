package nyc.c4q.maxrosado.hackathonapp.sportchoose;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import nyc.c4q.maxrosado.hackathonapp.R;
import nyc.c4q.maxrosado.hackathonapp.tabFragments.HomeActivity;
import nyc.c4q.maxrosado.hackathonapp.tabFragments.bike.BikeRentalActivity;
import nyc.c4q.maxrosado.hackathonapp.tabFragments.handball.HandballActivity;
import nyc.c4q.maxrosado.hackathonapp.tabFragments.parks.ParksActivity;

public class sportChooser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Class activityclass = HomeActivity.class;
                Intent intent;

                switch (position){
                    case 0://Parks
                        activityclass = ParksActivity.class;
                        break;
                    case 1://Basketball
                        activityclass = HomeActivity.class;
                        break;
                    case 2://Handball
                        activityclass = HandballActivity.class;
                        break;
                    case 3://Soccer
                        activityclass = HomeActivity.class;
                        break;
                    case 4://Football
                        activityclass = HomeActivity.class;
                        break;
                    case 5://Bikes
                        activityclass = BikeRentalActivity.class;
                        break;

                }

                intent = new Intent(sportChooser.this, activityclass);
                    startActivity(intent);

                }
            });

    }

}
