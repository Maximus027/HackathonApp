package nyc.c4q.maxrosado.hackathonapp.tabFragments.parks;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.maxrosado.hackathonapp.R;
import nyc.c4q.maxrosado.hackathonapp.models.Parks;
import nyc.c4q.maxrosado.hackathonapp.services.ParksApi;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

/**
 * A placeholder fragment containing a simple view.
 */
public class ParksActivityFragment extends Fragment {

    private static final String TAG = ParksActivityFragment.class.getName();

    private RecyclerView parksRV;
    List<Parks.Facility> parksList = new ArrayList<>();
    View parksRootView;

    public ParksActivityFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        parksRootView = inflater.inflate(R.layout.fragment_parks, container, false);
        parksRV = (RecyclerView) parksRootView.findViewById(R.id.parks_rv);
        return parksRootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        fetchParks();
    }

    public void fetchParks() {
        Retrofit retrofit = new Retrofit.Builder()
                //https://www.nycgovparks.org/bigapps/DPR_Parks_001.xml
                .baseUrl("http://nycgovparks.org/")
                .client(new OkHttpClient())
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build();

        ParksApi service = retrofit.create(ParksApi.class);
        Call<Parks> call = service.getFacility();
        call.enqueue(new Callback<Parks>() {



            @Override
            public void onResponse(Call<Parks> call, Response<Parks> response) {
                parksList = response.body().getFacility();
                parksRV.setLayoutManager((new LinearLayoutManager(parksRootView.getContext())));
                parksRV.setAdapter(new ParksAdapter(parksList));
                Log.d(TAG, "onResponse: " + parksList.get(0).getLocation());

            }

            @Override
            public void onFailure(Call<Parks> call, Throwable t) {
                Log.d(TAG, "onFailure: Fail Download Parks Data");
                Log.d(TAG, "onFailure: " + t.getMessage());
                Toast.makeText(parksRootView.getContext(), "Unable to Download Parks Data", Toast.LENGTH_SHORT).show();
            }
        });

    }
}