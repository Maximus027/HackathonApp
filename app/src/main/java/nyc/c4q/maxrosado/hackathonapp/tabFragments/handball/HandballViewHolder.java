package nyc.c4q.maxrosado.hackathonapp.tabFragments.handball;

import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.maxrosado.hackathonapp.R;
import nyc.c4q.maxrosado.hackathonapp.models.Handball;

/**
 * Created by tarynking on 2/19/17.
 */

public class HandballViewHolder extends RecyclerView.ViewHolder {
    private TextView nameTextView;
    private TextView locationTextView;
    private TextView numofCourtsTextView;

    private boolean saveClicked = false;

    public HandballViewHolder(View itemView) {
        super(itemView);
        nameTextView = (TextView) itemView.findViewById(R.id.handball_name_id);
        locationTextView = (TextView) itemView.findViewById(R.id.handball_location_id);
        numofCourtsTextView = (TextView) itemView.findViewById(R.id.handball_numOfCourts_id);

    }



    public void bind(final Handball.Facility facility) {
        nameTextView.setText(Html.fromHtml(facility.getName()));
        locationTextView.setText(Html.fromHtml(facility.getLocation()));
        numofCourtsTextView.setText(Html.fromHtml(facility.getNum_of_Courts()));

        if (facility.getName() == null) {
            nameTextView.setVisibility(View.GONE);
        } else {
            nameTextView.setText(Html.fromHtml(facility.getName()));
        }

        if (facility.getLocation() == null) {
            locationTextView.setVisibility(View.GONE);
        } else {
            locationTextView.setText(Html.fromHtml(facility.getLocation()));
        }

        if (facility.getNum_of_Courts() == null) {
            numofCourtsTextView.setVisibility(View.GONE);
        } else {
            numofCourtsTextView.setText(Html.fromHtml("Number of Courts: "+facility.getNum_of_Courts()));
        }
    }

}

