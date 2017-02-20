package nyc.c4q.maxrosado.hackathonapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;

public class LocationActivity extends AppCompatActivity implements OnMapReadyCallback {
    private GoogleMap mainGoogleMap;
    private static final String BASE_URL = "https://api.citybik.es/";
    private static final String TAG = "BikeActivity";
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mainGoogleMap = googleMap;
        gotToLocationZoom(40.739194, -73.930890, 15);
//        googleMap.addMarker(new MarkerOptions().position(40.739194, -73.930890)
//                .title("Name of location"));
    }

    private void gotToLocationZoom(double lat, double lng, float zoom) {
        LatLng ll = new LatLng(lat, lng);
        CameraUpdate update = CameraUpdateFactory.newLatLngZoom(ll, zoom);
        mainGoogleMap.moveCamera(update);
    }
}
