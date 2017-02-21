package nyc.c4q.maxrosado.hackathonapp.tabFragments.parks;

import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.maxrosado.hackathonapp.R;
import nyc.c4q.maxrosado.hackathonapp.models.Parks;

/**
 * Created by tarynking on 2/19/17.
 */

public class ParksViewHolder extends RecyclerView.ViewHolder {
    private TextView nameTextView;
    private TextView locationTextView;
    private TextView zipTextView;

    private boolean saveClicked = false;

    public ParksViewHolder(View itemView) {
        super(itemView);
        nameTextView = (TextView) itemView.findViewById(R.id.parks_name_id);
        locationTextView = (TextView) itemView.findViewById(R.id.parks_location_id);
        zipTextView = (TextView) itemView.findViewById(R.id.parks_zip_id);

    }



    public void bind(final Parks.Facility facility) {
        nameTextView.setText(Html.fromHtml(facility.getName()));
        locationTextView.setText(Html.fromHtml(facility.getLocation()));
        zipTextView.setText(Html.fromHtml(facility.getZip()));

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

        if (facility.getZip() == null) {
            zipTextView.setVisibility(View.GONE);
        } else {
            zipTextView.setText(Html.fromHtml("Number of Courts: "+facility.getZip()));
        }
    }


}


