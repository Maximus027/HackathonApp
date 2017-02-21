package nyc.c4q.maxrosado.hackathonapp.Adapters;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import nyc.c4q.maxrosado.hackathonapp.Basketball;
import nyc.c4q.maxrosado.hackathonapp.Handball2;
import nyc.c4q.maxrosado.hackathonapp.R;

/**
 * Created by queenabergen on 2/18/17.
 */

public class HandballAdapter extends RecyclerView.Adapter<HandballAdapter.MyViewHolder> {
    String[] fractionofPlayers = {"1/2"};
    String[] bouroughNames = {"47 Cue Court"};
    String[] dates = {"Friday Feb 24 2017"};
    int[] sportsCons = {R.drawable.handballicon};

    private ImageView userImage;
    private TextView userId;
    private ImageView sportsIcon;
    private TextView cityNames;
    private TextView dateOfGame;
    private Context mContext;
    private TextView timeofGame;
    private TextView playersNeeded;
    private Button deleteGame;


    public class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(View itemView) {
            super(itemView);
            playersNeeded = (TextView) itemView.findViewById(R.id.fractionOfPlayers);
            timeofGame = (TextView) itemView.findViewById(R.id.timeView);
            userImage = (ImageView) itemView.findViewById(R.id.userImage);
            sportsIcon = (ImageView) itemView.findViewById(R.id.sportsIcon);
            cityNames = (TextView) itemView.findViewById(R.id.bouroughOfGame);
            dateOfGame = (TextView) itemView.findViewById(R.id.dateOfGame);
            deleteGame = (Button) itemView.findViewById(R.id.joingameBTN);
            deleteGame.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
                    builder.setMessage(R.string.dialog_message)
                            .setTitle(R.string.dialog_title);
                    builder.setPositiveButton(R.string.No, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Intent intent = new Intent(mContext, Basketball.class);
                            mContext.startActivity(intent);
                        }
                    });
                    builder.setNegativeButton(R.string.Yes, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Intent intent = new Intent(mContext, Handball2.class);
                            mContext.startActivity(intent);
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
            });
            userId = (TextView) itemView.findViewById(R.id.userId);

        }
    }

    @Override
    public HandballAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.sportsholder2, parent, false);
        return new HandballAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(HandballAdapter.MyViewHolder holder, int position) {
        Picasso.with(mContext).load(R.drawable.queenaimage).resize(300, 300).into(userImage);
        timeofGame.setText("12:00PM");
        userId.setText("Cue");
        playersNeeded.setText(fractionofPlayers[position]);
        sportsIcon.setImageResource(sportsCons[position]);
        cityNames.setText(bouroughNames[position]);
        dateOfGame.setText(dates[position]);
    }

    @Override
    public int getItemCount() {
        return bouroughNames.length;
    }
}
