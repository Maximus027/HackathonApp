package nyc.c4q.maxrosado.hackathonapp;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.maxrosado.hackathonapp.models.BikeLocation;


/**
 * Created by tarynking on 2/18/17.
 */

public class BikeRentalAdapter extends RecyclerView.Adapter {
    private List<BikeLocation> bikeLocations = new ArrayList<>();

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new BikeRentalViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        BikeRentalViewHolder bikeViewHolder = (BikeRentalViewHolder) holder;
        BikeLocation currentBikelocation = bikeLocations.get(position);
        bikeViewHolder.bind(currentBikelocation);
    }

    @Override
    public int getItemCount() {
        return bikeLocations.size();
    }

    public void setData(List<BikeLocation> locations) {
        this.bikeLocations = locations;
        notifyDataSetChanged();
    }
}
