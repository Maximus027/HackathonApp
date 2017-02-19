package nyc.c4q.maxrosado.hackathonapp.tabFragments.bike;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.maxrosado.hackathonapp.models.bike_models.Station;


/**
 * Created by tarynking on 2/18/17.
 */

public class BikeRentalAdapter extends RecyclerView.Adapter {
    private List<Station> bikeStations = new ArrayList<>();

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new BikeRentalViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        BikeRentalViewHolder bikeViewHolder = (BikeRentalViewHolder) holder;
        Station currentBikeStation = bikeStations.get(position);
        bikeViewHolder.bind( currentBikeStation);
    }


    @Override
    public int getItemCount() {
        return bikeStations.size();
    }

    public void setData(List<Station> locations) {
        this.bikeStations = locations;
        notifyDataSetChanged();
    }
}
