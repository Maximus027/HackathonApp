package nyc.c4q.maxrosado.hackathonapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.google.gson.GsonBuilder;

import java.util.List;

import nyc.c4q.maxrosado.hackathonapp.models.BikeLocation;
import nyc.c4q.maxrosado.hackathonapp.models.BikeNetwork;
import nyc.c4q.maxrosado.hackathonapp.models.BikeRental;
import nyc.c4q.maxrosado.hackathonapp.services.BikeRentalApi;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

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

        recyclerView = (RecyclerView) findViewById(R.id.bike_rental_rv2);
        llm = new LinearLayoutManager(this);
        adapter = new BikeRentalAdapter();
        recyclerView.setLayoutManager(llm);
        recyclerView.setAdapter(adapter);

        //retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().registerTypeAdapter(BikeNetwork.class, new BikeNetworkSerializer()).create()))
                //.addConverterFactory(GsonConverterFactory.create())
                .build();

        BikeRentalApi api = retrofit.create(BikeRentalApi.class);

        Call<BikeRental> call = api.getNetworks();
        call.enqueue(new Callback<BikeRental>() {
            @Override
            public void onResponse(Call<BikeRental> call, Response<BikeRental> response) {
                Log.d("JJJ", "onResponse: "+response.isSuccessful());
                Log.d("JJJ", "onResponse: "+response.body().getNetworks().get(0));

                BikeRental bikeRental = response.body();
                List<BikeLocation> bikeLocations = bikeRental.getBikeLocation();
                BikeRentalAdapter adapter = (BikeRentalAdapter) recyclerView.getAdapter();
                adapter.setData(bikeLocations);
            }

            @Override
            public void onFailure(Call<BikeRental> call, Throwable t) {
                Log.d("JJJ", "onResponse: FAILED" + t);

            }
        });


//        if (savedInstanceState == null) {
//            getFragmentManager().beginTransaction()
//                    .add(R.id., new BikeRentalFragment())
//                    .commit();
//        }

    }
}
