package nyc.c4q.maxrosado.hackathonapp.tabFragments.handball;

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
import nyc.c4q.maxrosado.hackathonapp.models.Handball;
import nyc.c4q.maxrosado.hackathonapp.services.HandballApi;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;



/**
 * A placeholder fragment containing a simple view.
 */
public class HandballActivityFragment extends Fragment {

    private static final String TAG = HandballActivityFragment.class.getName();

    private RecyclerView handballRV;
    List<Handball.Facility> handballsList = new ArrayList<>();
    View handballRootView;

    public HandballActivityFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        handballRootView = inflater.inflate(R.layout.fragment_handball, container, false);
        handballRV = (RecyclerView) handballRootView.findViewById(R.id.handball_rv);
        return handballRootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        fetchHandballCourts();
    }

    public void fetchHandballCourts() {
        Retrofit retrofit = new Retrofit.Builder()
                //http://nycgovparks.org/bigapps/DPR_Handball_001.xml
                .baseUrl("http://nycgovparks.org/")
                .client(new OkHttpClient())
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build();

        HandballApi service = retrofit.create(HandballApi.class);
        Call<Handball> call = service.getFacility();
        call.enqueue(new Callback<Handball>() {
            @Override
            public void onResponse(Call<Handball> call, Response<Handball> response) {
                handballsList = response.body().getFacility();
                handballRV.setLayoutManager(new LinearLayoutManager(handballRootView.getContext()));
                handballRV.setAdapter(new HandballAdapter(handballsList));
                Log.d(TAG, "onResponse: "+ handballsList.get(0).getLocation());

            }

            @Override
            public void onFailure(Call<Handball> call, Throwable t) {
                Log.d(TAG, "onFailure: Fail Download Handball Data");
                Log.d(TAG, "onFailure: " + t.getMessage());
                Toast.makeText(handballRootView.getContext(), "Unable to Download Handball Data", Toast.LENGTH_SHORT).show();
            }
        });

    }
}