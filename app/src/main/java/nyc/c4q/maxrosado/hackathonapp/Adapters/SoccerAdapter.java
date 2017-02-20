package nyc.c4q.maxrosado.hackathonapp.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by queenabergen on 2/19/17.
 */

public class SoccerAdapter extends RecyclerView.Adapter<SoccerAdapter.MyViewHolder> {
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }


    @Override
    public SoccerAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(SoccerAdapter.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

}
