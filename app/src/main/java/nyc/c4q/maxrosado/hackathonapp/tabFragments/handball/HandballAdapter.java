package nyc.c4q.maxrosado.hackathonapp.tabFragments.handball;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.maxrosado.hackathonapp.R;
import nyc.c4q.maxrosado.hackathonapp.models.Handball;

/**
 * Created by tarynking on 2/19/17.
 */

public class HandballAdapter extends RecyclerView.Adapter<HandballViewHolder> {
    List<Handball.Facility> facilityList= new ArrayList<>();

    public HandballAdapter(List<Handball.Facility> facilityList) {
        this.facilityList = facilityList;
    }

    @Override
    public HandballViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.handball_itemview, parent, false);
        return new HandballViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(HandballViewHolder holder, int position) {
        Handball.Facility handballfacility = facilityList.get(position);
        holder.bind(handballfacility);
    }

    @Override
    public int getItemCount() {
        return facilityList.size();
    }

    public void setData(List<Handball.Facility> facilities) {
        this.facilityList = facilities;
        notifyDataSetChanged();
    }
}


