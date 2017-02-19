package nyc.c4q.maxrosado.hackathonapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.maxrosado.hackathonapp.models.BikeRental;
import nyc.c4q.maxrosado.hackathonapp.models.Station;
import nyc.c4q.maxrosado.hackathonapp.services.BikeRentalApi;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by tarynking on 2/18/17.
 */


public class BikeRentalFragment extends Fragment {
    //https://api.citybik.es/v2/networks
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private BikeRentalAdapter adapter;

    private static final String BASE_URL = "https://api.citybik.es/";
    private static final String TAG = "BikeActivity";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.bike_rental_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = (RecyclerView) view.findViewById(R.id.bike_rental_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(new BikeRentalAdapter());

        //retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                //.addConverterFactory(GsonConverterFactory.create(new GsonBuilder().registerTypeAdapter(BikeNetwork.class, new BikeNetworkSerializer()).create()))
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        BikeRentalApi api = retrofit.create(BikeRentalApi.class);

        Call<BikeRental> call = api.getNetworks();
        call.enqueue(new Callback<BikeRental>() {
            @Override
            public void onResponse(Call<BikeRental> call, Response<BikeRental> response) {
                Log.d(TAG, "onResponse: "+response.isSuccessful());

                BikeRental bikeRental = response.body();
                List<Station> bikeLocations = bikeRental.getNetwork().getStations();
                BikeRentalAdapter adapter = (BikeRentalAdapter) recyclerView.getAdapter();
                adapter.setData(bikeLocations);
            }

            @Override
            public void onFailure(Call<BikeRental> call, Throwable t) {
                Log.d(TAG, "onResponse: FAILED" + t);

            }
        });



    }
}

