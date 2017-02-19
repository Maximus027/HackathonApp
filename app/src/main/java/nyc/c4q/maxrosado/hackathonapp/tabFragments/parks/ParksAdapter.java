package nyc.c4q.maxrosado.hackathonapp.tabFragments.parks;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.maxrosado.hackathonapp.R;
import nyc.c4q.maxrosado.hackathonapp.models.Parks;

/**
 * Created by tarynking on 2/19/17.
 */

public class ParksAdapter extends RecyclerView.Adapter<ParksViewHolder> {
    List<Parks.Facility> parksList = new ArrayList<>();

    public ParksAdapter(List<Parks.Facility> parksList) {
        this.parksList = parksList;
    }

    @Override
    public ParksViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.parks_itemview, parent, false);
        return new ParksViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(ParksViewHolder holder, int position) {
        Parks.Facility parksfacility = parksList.get(position);
        holder.bind(parksfacility);
    }

    @Override
    public int getItemCount() {
        return parksList.size();
    }

    public void setData(List<Parks.Facility> facilities) {
        this.parksList = facilities;
        notifyDataSetChanged();
    }
}