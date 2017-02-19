package nyc.c4q.maxrosado.hackathonapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

/**
 * Created by tarynking on 2/18/17.
 */


public class BikeRentalActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager llm;
    private BikeRentalAdapter adapter;

    private static final String BASE_URL = "https://api.citybik.es/";

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
