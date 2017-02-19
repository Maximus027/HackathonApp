package nyc.c4q.maxrosado.hackathonapp.tabFragments.hiking;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import nyc.c4q.maxrosado.hackathonapp.R;
import nyc.c4q.maxrosado.hackathonapp.tabFragments.bike.BikeRentalFragment;

/**
 * Created by tarynking on 2/18/17.
 */

public class HikingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bike_rental);


        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.activity_bike_rental2_id, new BikeRentalFragment())
                    .commit();
        }

    }
}