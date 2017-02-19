package nyc.c4q.maxrosado.hackathonapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import nyc.c4q.maxrosado.hackathonapp.models.Station;

/**
 * Created by tarynking on 2/18/17.
 */

public class BikeRentalViewHolder extends RecyclerView.ViewHolder {


    private TextView bikeRentalCityTextView;
    private TextView bikeRentalCountryTextView;

    private Float latitude;
    private Float longitude;


    public BikeRentalViewHolder(ViewGroup parent) {
        super(inflateView(parent));
        bikeRentalCityTextView = (TextView) itemView.findViewById(R.id.bike_city_tv);
        bikeRentalCountryTextView = (TextView) itemView.findViewById(R.id.bike_country_tv);


    }

    private static View inflateView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.bike_rental_item_layout, parent, false);
    }

    public void bind(final Station bikeLocation) {
        bikeRentalCityTextView.setText(bikeLocation.getName());
        bikeRentalCountryTextView.setText("Available bikes: "+ bikeLocation.getFreeBikes().toString());
    }
}
