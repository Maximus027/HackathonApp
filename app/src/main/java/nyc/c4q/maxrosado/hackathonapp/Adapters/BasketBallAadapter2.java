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

import nyc.c4q.maxrosado.hackathonapp.Basketball;
import nyc.c4q.maxrosado.hackathonapp.R;

/**
 * Created by queenabergen on 2/21/17.
 */

public class BasketBallAadapter2 extends RecyclerView.Adapter<BasketBallAadapter2.MyViewHolder> {

    ImageView imageView;
    String[] playerNumbers = {"2 / 10"};
    String[] bouroughNames = {"Manhattan"};
    String[] times = {"12:30"};
    String[] dates = {"Tuesday Feb 28th "};
    int[] sportsCons = {R.drawable.basketballicon1};
    int[] userImageList = {R.drawable.user1};
    private Context mContext;
    private ImageView userImage;
    private ImageView sportsIcon;
    private TextView cityNames;
    private TextView timeofGame;
    private TextView dateOfGame;
    private TextView playersNeeded;
    private Button button;


    public class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(View itemView) {
            super(itemView);
            playersNeeded = (TextView) itemView.findViewById(R.id.fractionOfPlayers);
            timeofGame = (TextView) itemView.findViewById(R.id.timeView);
            userImage = (ImageView) itemView.findViewById(R.id.userImage);
            imageView = (ImageView) itemView.findViewById(R.id.logoBanner);
            sportsIcon = (ImageView) itemView.findViewById(R.id.sportsIcon);
            cityNames = (TextView) itemView.findViewById(R.id.bouroughOfGame);
            dateOfGame = (TextView) itemView.findViewById(R.id.dateOfGame);
            button = (Button) itemView.findViewById(R.id.joingameBTN);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
                    builder.setMessage("Are you sure you want to leave game ?")
                            .setTitle("Leave Basketball Game");
                    builder.setPositiveButton(R.string.Yes, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Intent intent = new Intent(mContext, Basketball.class);
                            mContext.startActivity(intent);
                        }
                    });
                    builder.setNegativeButton(R.string.No, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Intent intent = new Intent(mContext, Basketball.class);
                            mContext.startActivity(intent);
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
            });

        }

    }


    @Override
    public BasketBallAadapter2.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.sportsholder3, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(BasketBallAadapter2.MyViewHolder holder, int position) {
        playersNeeded.setText(playerNumbers[position]);
        userImage.setImageResource(userImageList[position]);
        sportsIcon.setImageResource(sportsCons[position]);
        timeofGame.setText(times[position]);
        cityNames.setText(bouroughNames[position]);
        dateOfGame.setText(dates[position]);
    }

    @Override
    public int getItemCount() {
        return bouroughNames.length;
    }


}